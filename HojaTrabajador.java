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
@Table(name = "hoja_trabajador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HojaTrabajador.findAll", query = "SELECT h FROM HojaTrabajador h")
    , @NamedQuery(name = "HojaTrabajador.findById", query = "SELECT h FROM HojaTrabajador h WHERE h.id = :id")
    , @NamedQuery(name = "HojaTrabajador.findByNombre", query = "SELECT h FROM HojaTrabajador h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "HojaTrabajador.findByApellido", query = "SELECT h FROM HojaTrabajador h WHERE h.apellido = :apellido")
    , @NamedQuery(name = "HojaTrabajador.findByTelefono", query = "SELECT h FROM HojaTrabajador h WHERE h.telefono = :telefono")
    , @NamedQuery(name = "HojaTrabajador.findByEmil", query = "SELECT h FROM HojaTrabajador h WHERE h.emil = :emil")
    , @NamedQuery(name = "HojaTrabajador.findByTrabajoRealizado", query = "SELECT h FROM HojaTrabajador h WHERE h.trabajoRealizado = :trabajoRealizado")
    , @NamedQuery(name = "HojaTrabajador.findByHorasTraba", query = "SELECT h FROM HojaTrabajador h WHERE h.horasTraba = :horasTraba")
    , @NamedQuery(name = "HojaTrabajador.findByFecha", query = "SELECT h FROM HojaTrabajador h WHERE h.fecha = :fecha")
    , @NamedQuery(name = "HojaTrabajador.findByTotal", query = "SELECT h FROM HojaTrabajador h WHERE h.total = :total")})
public class HojaTrabajador implements Serializable {

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
    @Column(name = "trabajo_realizado")
    private String trabajoRealizado;
    @Size(max = 20)
    @Column(name = "horas_traba")
    private String horasTraba;
    @Size(max = 20)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 20)
    @Column(name = "total")
    private String total;

    public HojaTrabajador() {
    }

    public HojaTrabajador(Integer id) {
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

    public String getTrabajoRealizado() {
        return trabajoRealizado;
    }

    public void setTrabajoRealizado(String trabajoRealizado) {
        this.trabajoRealizado = trabajoRealizado;
    }

    public String getHorasTraba() {
        return horasTraba;
    }

    public void setHorasTraba(String horasTraba) {
        this.horasTraba = horasTraba;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
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
        if (!(object instanceof HojaTrabajador)) {
            return false;
        }
        HojaTrabajador other = (HojaTrabajador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.HojaTrabajador[ id=" + id + " ]";
    }
    
}
