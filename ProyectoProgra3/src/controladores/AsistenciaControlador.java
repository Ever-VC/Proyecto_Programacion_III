/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import conexion.Conexion;
import modelos.Asistencia;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Ever Vásquez
 */
public class AsistenciaControlador {
    
    private EntityManager entityManager;
     
    public AsistenciaControlador(){
        entityManager = entityManager();
    }
    
    private EntityManager entityManager() {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
    
    public void insertarAsistencia(Asistencia nuevaAsistencia){
        entityManager.getTransaction().begin();
        entityManager.persist(nuevaAsistencia);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public void eliminarAsistencia(int idAsis){
        entityManager.getTransaction().begin();
        Asistencia asisElim = entityManager.find(Asistencia.class, idAsis);
        entityManager.remove(entityManager.merge(asisElim));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public List<Asistencia> getLisTalleresPonencias(){
        entityManager.getTransaction().begin();
        return entityManager.createQuery("SELECT tall FROM Asistencia tall").getResultList();
    }
}
