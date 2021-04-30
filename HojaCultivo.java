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
@Table(name = "hoja_cultivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HojaCultivo.findAll", query = "SELECT h FROM HojaCultivo h")
    , @NamedQuery(name = "HojaCultivo.findById", query = "SELECT h FROM HojaCultivo h WHERE h.id = :id")
    , @NamedQuery(name = "HojaCultivo.findByCultivo", query = "SELECT h FROM HojaCultivo h WHERE h.cultivo = :cultivo")
    , @NamedQuery(name = "HojaCultivo.findByFechaInicio", query = "SELECT h FROM HojaCultivo h WHERE h.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "HojaCultivo.findByCantidad", query = "SELECT h FROM HojaCultivo h WHERE h.cantidad = :cantidad")
    , @NamedQuery(name = "HojaCultivo.findByCantidadTerreno", query = "SELECT h FROM HojaCultivo h WHERE h.cantidadTerreno = :cantidadTerreno")
    , @NamedQuery(name = "HojaCultivo.findByFechaFinal", query = "SELECT h FROM HojaCultivo h WHERE h.fechaFinal = :fechaFinal")})
public class HojaCultivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "cultivo")
    private String cultivo;
    @Size(max = 20)
    @Column(name = "fecha_inicio")
    private String fechaInicio;
    @Size(max = 20)
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 20)
    @Column(name = "cantidad_terreno")
    private String cantidadTerreno;
    @Size(max = 20)
    @Column(name = "fecha_final")
    private String fechaFinal;

    public HojaCultivo() {
    }

    public HojaCultivo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCultivo() {
        return cultivo;
    }

    public void setCultivo(String cultivo) {
        this.cultivo = cultivo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantidadTerreno() {
        return cantidadTerreno;
    }

    public void setCantidadTerreno(String cantidadTerreno) {
        this.cantidadTerreno = cantidadTerreno;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
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
        if (!(object instanceof HojaCultivo)) {
            return false;
        }
        HojaCultivo other = (HojaCultivo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.HojaCultivo[ id=" + id + " ]";
    }
    
}
