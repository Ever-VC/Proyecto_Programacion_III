/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Waldir Rosa
 */
@Entity
@Table(name = "tbl_talleresponencias", catalog = "db_semana_sistemas", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Talleresponencias.findAll", query = "SELECT t FROM Talleresponencias t")})
public class Talleresponencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tallerponencia", nullable = false)
    private Integer idTallerponencia;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @Column(name = "nombre_encargado", length = 100)
    private String nombreEncargado;
    @Column(name = "lugar", length = 100)
    private String lugar;
    @Column(name = "fecha", length = 25)
    private String fecha;
    @Column(name = "hora", length = 50)
    private String hora;
    @OneToMany(mappedBy = "idTallerponencia", fetch = FetchType.LAZY)
    private Collection<Asistencia> asistenciaCollection;

    public Talleresponencias() {
    }

    public Talleresponencias(Integer idTallerponencia) {
        this.idTallerponencia = idTallerponencia;
    }

    public Integer getIdTallerponencia() {
        return idTallerponencia;
    }

    public void setIdTallerponencia(Integer idTallerponencia) {
        this.idTallerponencia = idTallerponencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Collection<Asistencia> getAsistenciaCollection() {
        return asistenciaCollection;
    }

    public void setAsistenciaCollection(Collection<Asistencia> asistenciaCollection) {
        this.asistenciaCollection = asistenciaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTallerponencia != null ? idTallerponencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Talleresponencias)) {
            return false;
        }
        Talleresponencias other = (Talleresponencias) object;
        if ((this.idTallerponencia == null && other.idTallerponencia != null) || (this.idTallerponencia != null && !this.idTallerponencia.equals(other.idTallerponencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
       /* return "modelos.Talleresponencias[ idTallerponencia=" + idTallerponencia + " ]";*/
       return nombre;
    }
    
}
