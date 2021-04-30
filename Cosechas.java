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
@Table(name = "cosechas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cosechas.findAll", query = "SELECT c FROM Cosechas c")
    , @NamedQuery(name = "Cosechas.findById", query = "SELECT c FROM Cosechas c WHERE c.id = :id")
    , @NamedQuery(name = "Cosechas.findByCultivo", query = "SELECT c FROM Cosechas c WHERE c.cultivo = :cultivo")
    , @NamedQuery(name = "Cosechas.findByCantidad", query = "SELECT c FROM Cosechas c WHERE c.cantidad = :cantidad")
    , @NamedQuery(name = "Cosechas.findByPresentacion", query = "SELECT c FROM Cosechas c WHERE c.presentacion = :presentacion")
    , @NamedQuery(name = "Cosechas.findByPrecioUnit", query = "SELECT c FROM Cosechas c WHERE c.precioUnit = :precioUnit")
    , @NamedQuery(name = "Cosechas.findByTotal", query = "SELECT c FROM Cosechas c WHERE c.total = :total")
    , @NamedQuery(name = "Cosechas.findByFecha", query = "SELECT c FROM Cosechas c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cosechas.findByTelefono", query = "SELECT c FROM Cosechas c WHERE c.telefono = :telefono")})
public class Cosechas implements Serializable {

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
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 20)
    @Column(name = "presentacion")
    private String presentacion;
    @Size(max = 20)
    @Column(name = "precio_unit")
    private String precioUnit;
    @Size(max = 20)
    @Column(name = "total")
    private String total;
    @Size(max = 20)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;

    public Cosechas() {
    }

    public Cosechas(Integer id) {
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(String precioUnit) {
        this.precioUnit = precioUnit;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        if (!(object instanceof Cosechas)) {
            return false;
        }
        Cosechas other = (Cosechas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Cosechas[ id=" + id + " ]";
    }
    
}
