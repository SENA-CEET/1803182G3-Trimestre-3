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
@Table(name = "estado_formacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoFormacion.findAll", query = "SELECT e FROM EstadoFormacion e"),
    @NamedQuery(name = "EstadoFormacion.findById", query = "SELECT e FROM EstadoFormacion e WHERE e.id = :id"),
    @NamedQuery(name = "EstadoFormacion.findByNombreEstado", query = "SELECT e FROM EstadoFormacion e WHERE e.nombreEstado = :nombreEstado"),
    @NamedQuery(name = "EstadoFormacion.findByEstado", query = "SELECT e FROM EstadoFormacion e WHERE e.estado = :estado")})
public class EstadoFormacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre_estado")
    private String nombreEstado;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoFormacion")
    private List<Aprendiz> aprendizList;

    public EstadoFormacion() {
    }

    public EstadoFormacion(Integer id) {
        this.id = id;
    }

    public EstadoFormacion(Integer id, String nombreEstado, String estado) {
        this.id = id;
        this.nombreEstado = nombreEstado;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Aprendiz> getAprendizList() {
        return aprendizList;
    }

    public void setAprendizList(List<Aprendiz> aprendizList) {
        this.aprendizList = aprendizList;
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
        if (!(object instanceof EstadoFormacion)) {
            return false;
        }
        EstadoFormacion other = (EstadoFormacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.EstadoFormacion[ id=" + id + " ]";
    }
    
}
