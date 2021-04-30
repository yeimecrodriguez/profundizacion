/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author carolina
 */
@Entity
@Table(name = "auditoria_carolina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuditoriaCarolina.findAll", query = "SELECT a FROM AuditoriaCarolina a")
    , @NamedQuery(name = "AuditoriaCarolina.findById", query = "SELECT a FROM AuditoriaCarolina a WHERE a.id = :id")
    , @NamedQuery(name = "AuditoriaCarolina.findByUsuario", query = "SELECT a FROM AuditoriaCarolina a WHERE a.usuario = :usuario")
    , @NamedQuery(name = "AuditoriaCarolina.findByFecha", query = "SELECT a FROM AuditoriaCarolina a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "AuditoriaCarolina.findByAccion", query = "SELECT a FROM AuditoriaCarolina a WHERE a.accion = :accion")
    , @NamedQuery(name = "AuditoriaCarolina.findByContenido", query = "SELECT a FROM AuditoriaCarolina a WHERE a.contenido = :contenido")})
public class AuditoriaCarolina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 30)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 30)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 30)
    @Column(name = "accion")
    private String accion;
    @Size(max = 30)
    @Column(name = "contenido")
    private String contenido;

    public AuditoriaCarolina() {
    }

    public AuditoriaCarolina(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuditoriaCarolina)) {
            return false;
        }
        AuditoriaCarolina other = (AuditoriaCarolina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AuditoriaCarolina[ id=" + id + " ]";
    }
    
}
