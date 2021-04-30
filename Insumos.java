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
@Table(name = "insumos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insumos.findAll", query = "SELECT i FROM Insumos i")
    , @NamedQuery(name = "Insumos.findById", query = "SELECT i FROM Insumos i WHERE i.id = :id")
    , @NamedQuery(name = "Insumos.findByCultivo", query = "SELECT i FROM Insumos i WHERE i.cultivo = :cultivo")
    , @NamedQuery(name = "Insumos.findByPresentacion", query = "SELECT i FROM Insumos i WHERE i.presentacion = :presentacion")
    , @NamedQuery(name = "Insumos.findByAplicacion", query = "SELECT i FROM Insumos i WHERE i.aplicacion = :aplicacion")
    , @NamedQuery(name = "Insumos.findByNombreInsumo", query = "SELECT i FROM Insumos i WHERE i.nombreInsumo = :nombreInsumo")
    , @NamedQuery(name = "Insumos.findByFecha", query = "SELECT i FROM Insumos i WHERE i.fecha = :fecha")
    , @NamedQuery(name = "Insumos.findByNota", query = "SELECT i FROM Insumos i WHERE i.nota = :nota")
    , @NamedQuery(name = "Insumos.findByEtapa", query = "SELECT i FROM Insumos i WHERE i.etapa = :etapa")
    , @NamedQuery(name = "Insumos.findByValor", query = "SELECT i FROM Insumos i WHERE i.valor = :valor")})
public class Insumos implements Serializable {

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
    @Column(name = "presentacion")
    private String presentacion;
    @Size(max = 20)
    @Column(name = "aplicacion")
    private String aplicacion;
    @Size(max = 20)
    @Column(name = "nombre_insumo")
    private String nombreInsumo;
    @Size(max = 20)
    @Column(name = "fecha")
    private String fecha;
    @Size(max = 60)
    @Column(name = "nota")
    private String nota;
    @Size(max = 20)
    @Column(name = "etapa")
    private String etapa;
    @Size(max = 20)
    @Column(name = "valor")
    private String valor;

    public Insumos() {
    }

    public Insumos(Integer id) {
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

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
        if (!(object instanceof Insumos)) {
            return false;
        }
        Insumos other = (Insumos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Insumos[ id=" + id + " ]";
    }
    
}
