/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import conexion.Conexion;
import modelos.Talleresponencias;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Ever Vásquez
 */
public class TalleresPonenciasControlador {
    private EntityManager entityManager;
     
    public TalleresPonenciasControlador(){
        entityManager = entityManager();
    }
    
    private EntityManager entityManager() {
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
    public void insertarTallerPonencia(Talleresponencias nuevoTallerPonencia){
        entityManager.getTransaction().begin();
        entityManager.persist(nuevoTallerPonencia);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public List<Talleresponencias> getLisTalleresPonencias(){
        entityManager.getTransaction().begin();
        return entityManager.createQuery("SELECT tall FROM Talleresponencias tall").getResultList();
    }
    
    public void editarTallerPonencia(Talleresponencias tallEdit){
        entityManager.getTransaction().begin();
        Talleresponencias tall = entityManager.find(Talleresponencias.class, tallEdit.getIdTallerponencia());
        tall.setNombre(tallEdit.getNombre());
        tall.setNombreEncargado(tallEdit.getNombreEncargado());
        tall.setFecha(tallEdit.getFecha());
        tall.setLugar(tallEdit.getLugar());
        tall.setHora(tallEdit.getHora());
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public void eliminarTallerPonencia(int idPonencia){
        entityManager.getTransaction().begin();
        Talleresponencias tall = entityManager.find(Talleresponencias.class, idPonencia);
        entityManager.remove(entityManager.merge(tall));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
