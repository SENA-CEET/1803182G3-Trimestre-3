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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "instructor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instructor.findAll", query = "SELECT i FROM Instructor i"),
    @NamedQuery(name = "Instructor.findById", query = "SELECT i FROM Instructor i WHERE i.id = :id"),
    @NamedQuery(name = "Instructor.findByEstado", query = "SELECT i FROM Instructor i WHERE i.estado = :estado")})
public class Instructor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInstructor")
    private List<Horario> horarioList;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @OneToOne(optional = false)
    private Cliente idCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInstructor")
    private List<AreaInstructor> areaInstructorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInstructor")
    private List<VinculacionInstructor> vinculacionInstructorList;

    public Instructor() {
    }

    public Instructor(Integer id) {
        this.id = id;
    }

    public Instructor(Integer id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @XmlTransient
    public List<AreaInstructor> getAreaInstructorList() {
        return areaInstructorList;
    }

    public void setAreaInstructorList(List<AreaInstructor> areaInstructorList) {
        this.areaInstructorList = areaInstructorList;
    }

    @XmlTransient
    public List<VinculacionInstructor> getVinculacionInstructorList() {
        return vinculacionInstructorList;
    }

    public void setVinculacionInstructorList(List<VinculacionInstructor> vinculacionInstructorList) {
        this.vinculacionInstructorList = vinculacionInstructorList;
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
        if (!(object instanceof Instructor)) {
            return false;
        }
        Instructor other = (Instructor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Instructor[ id=" + id + " ]";
    }
    
}
