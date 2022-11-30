/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import conexion.Conexion;
import modelos.Estudiantes;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Ever Vásquez
 */
public class EstudianteControlador {
    
    private EntityManager entityManager;
     
    public EstudianteControlador(){
        entityManager = entityManager();
    }
     
    private EntityManager entityManager() {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
     
    public void insertarEstudiante(Estudiantes nuevoEstudiante){
        entityManager.getTransaction().begin();
        entityManager.persist(nuevoEstudiante);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public void editarEstudiante(Estudiantes estuEdit){
        entityManager.getTransaction().begin();
        Estudiantes estu = entityManager.find(Estudiantes.class, estuEdit.getIdEstudiante());
        estu.setNombresApellidos(estuEdit.getNombresApellidos());
        estu.setCarnet(estuEdit.getCarnet());
        estu.setAnnioCarrera(estuEdit.getAnnioCarrera());
        
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public void eliminarEstudiante(int idEstudiante){
        entityManager.getTransaction().begin();
        Estudiantes estuElim = entityManager.find(Estudiantes.class, idEstudiante);
        entityManager.remove(entityManager.merge(estuElim));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public List<Estudiantes> getLisEstudiantes(){
        entityManager.getTransaction().begin();
        return entityManager.createQuery("SELECT estu FROM Estudiantes estu").getResultList();
    }
    
}
