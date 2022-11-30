/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Waldir Rosa
 */
public class Conexion {
    private static Conexion instancia = new Conexion();
    private EntityManagerFactory fabrica;
    
    private Conexion(){
        fabrica = Persistence.createEntityManagerFactory("ProyectoProgra3PU");
    }
    
    public static Conexion getInstancia(){
        return instancia;
    }
    
    public EntityManagerFactory getFabrica(){
        return fabrica;
    }
    
}
