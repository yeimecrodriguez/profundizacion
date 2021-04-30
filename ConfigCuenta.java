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
@Table(name = "config_cuenta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConfigCuenta.findAll", query = "SELECT c FROM ConfigCuenta c")
    , @NamedQuery(name = "ConfigCuenta.findById", query = "SELECT c FROM ConfigCuenta c WHERE c.id = :id")
    , @NamedQuery(name = "ConfigCuenta.findByNombre", query = "SELECT c FROM ConfigCuenta c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "ConfigCuenta.findByNombreFinca", query = "SELECT c FROM ConfigCuenta c WHERE c.nombreFinca = :nombreFinca")
    , @NamedQuery(name = "ConfigCuenta.findByCiudad", query = "SELECT c FROM ConfigCuenta c WHERE c.ciudad = :ciudad")
    , @NamedQuery(name = "ConfigCuenta.findByCantidadTerreno", query = "SELECT c FROM ConfigCuenta c WHERE c.cantidadTerreno = :cantidadTerreno")
    , @NamedQuery(name = "ConfigCuenta.findByClima", query = "SELECT c FROM ConfigCuenta c WHERE c.clima = :clima")
    , @NamedQuery(name = "ConfigCuenta.findByTelefono", query = "SELECT c FROM ConfigCuenta c WHERE c.telefono = :telefono")})
public class ConfigCuenta implements Serializable {

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
    @Column(name = "nombre_finca")
    private String nombreFinca;
    @Size(max = 20)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 20)
    @Column(name = "cantidad_terreno")
    private String cantidadTerreno;
    @Size(max = 60)
    @Column(name = "clima")
    private String clima;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;

    public ConfigCuenta() {
    }

    public ConfigCuenta(Integer id) {
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

    public String getNombreFinca() {
        return nombreFinca;
    }

    public void setNombreFinca(String nombreFinca) {
        this.nombreFinca = nombreFinca;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCantidadTerreno() {
        return cantidadTerreno;
    }

    public void setCantidadTerreno(String cantidadTerreno) {
        this.cantidadTerreno = cantidadTerreno;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
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
        if (!(object instanceof ConfigCuenta)) {
            return false;
        }
        ConfigCuenta other = (ConfigCuenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ConfigCuenta[ id=" + id + " ]";
    }
    
}
