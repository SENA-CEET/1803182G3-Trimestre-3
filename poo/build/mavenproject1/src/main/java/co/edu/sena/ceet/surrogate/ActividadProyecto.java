/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ceet.surrogate;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "actividad_proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActividadProyecto.findAll", query = "SELECT a FROM ActividadProyecto a"),
    @NamedQuery(name = "ActividadProyecto.findById", query = "SELECT a FROM ActividadProyecto a WHERE a.id = :id"),
    @NamedQuery(name = "ActividadProyecto.findByNumeroActividad", query = "SELECT a FROM ActividadProyecto a WHERE a.numeroActividad = :numeroActividad"),
    @NamedQuery(name = "ActividadProyecto.findByDescipcionActividad", query = "SELECT a FROM ActividadProyecto a WHERE a.descipcionActividad = :descipcionActividad"),
    @NamedQuery(name = "ActividadProyecto.findByEstado", query = "SELECT a FROM ActividadProyecto a WHERE a.estado = :estado")})
public class ActividadProyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_actividad")
    private int numeroActividad;
    @Basic(optional = false)
    @Column(name = "descipcion_actividad")
    private String descipcionActividad;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_fase", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Fase idFase;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idActividadProyecto")
    private List<ActividadPlaneacion> actividadPlaneacionList;

    public ActividadProyecto() {
    }

    public ActividadProyecto(Integer id) {
        this.id = id;
    }

    public ActividadProyecto(Integer id, int numeroActividad, String descipcionActividad, String estado) {
        this.id = id;
        this.numeroActividad = numeroActividad;
        this.descipcionActividad = descipcionActividad;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroActividad() {
        return numeroActividad;
    }

    public void setNumeroActividad(int numeroActividad) {
        this.numeroActividad = numeroActividad;
    }

    public String getDescipcionActividad() {
        return descipcionActividad;
    }

    public void setDescipcionActividad(String descipcionActividad) {
        this.descipcionActividad = descipcionActividad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Fase getIdFase() {
        return idFase;
    }

    public void setIdFase(Fase idFase) {
        this.idFase = idFase;
    }

    @XmlTransient
    public List<ActividadPlaneacion> getActividadPlaneacionList() {
        return actividadPlaneacionList;
    }

    public void setActividadPlaneacionList(List<ActividadPlaneacion> actividadPlaneacionList) {
        this.actividadPlaneacionList = actividadPlaneacionList;
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
        if (!(object instanceof ActividadProyecto)) {
            return false;
        }
        ActividadProyecto other = (ActividadProyecto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.ActividadProyecto[ id=" + id + " ]";
    }
    
}
