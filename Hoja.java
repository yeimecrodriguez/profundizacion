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
@Table(name = "hoja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoja.findAll", query = "SELECT h FROM Hoja h")
    , @NamedQuery(name = "Hoja.findById", query = "SELECT h FROM Hoja h WHERE h.id = :id")
    , @NamedQuery(name = "Hoja.findByNombre", query = "SELECT h FROM Hoja h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Hoja.findByApellido", query = "SELECT h FROM Hoja h WHERE h.apellido = :apellido")
    , @NamedQuery(name = "Hoja.findByTelefono", query = "SELECT h FROM Hoja h WHERE h.telefono = :telefono")
    , @NamedQuery(name = "Hoja.findByEmil", query = "SELECT h FROM Hoja h WHERE h.emil = :emil")
    , @NamedQuery(name = "Hoja.findByProductoVendido", query = "SELECT h FROM Hoja h WHERE h.productoVendido = :productoVendido")
    , @NamedQuery(name = "Hoja.findByCantidad", query = "SELECT h FROM Hoja h WHERE h.cantidad = :cantidad")
    , @NamedQuery(name = "Hoja.findByValorUnit", query = "SELECT h FROM Hoja h WHERE h.valorUnit = :valorUnit")
    , @NamedQuery(name = "Hoja.findByTotal", query = "SELECT h FROM Hoja h WHERE h.total = :total")
    , @NamedQuery(name = "Hoja.findByFecha", query = "SELECT h FROM Hoja h WHERE h.fecha = :fecha")
    , @NamedQuery(name = "Hoja.findByDireccion", query = "SELECT h FROM Hoja h WHERE h.direccion = :direccion")})
public class Hoja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 20)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 60)
    @Column(name = "emil")
    private String emil;
    @Size(max = 20)
    @Column(name = "producto_vendido")
    private String productoVendido;
    @Size(max = 20)
    @Column(name = "cantidad")
    private String cantidad;
    @Size(max = 20)
    @Column(name = "valor_unit")
    private String valorUnit;
    @Size(max = 20)
    @Column(name = "total")
    private String total;
    @Size(max = 20)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 20)
    @Column(name = "direccion")
    private String direccion;

    public Hoja() {
    }

    public Hoja(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }

    public String getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(String productoVendido) {
        this.productoVendido = productoVendido;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(String valorUnit) {
        this.valorUnit = valorUnit;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
        if (!(object instanceof Hoja)) {
            return false;
        }
        Hoja other = (Hoja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hoja[ id=" + id + " ]";
    }
    
}
