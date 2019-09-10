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
@Table(name = "year")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Year.findAll", query = "SELECT y FROM Year y"),
    @NamedQuery(name = "Year.findById", query = "SELECT y FROM Year y WHERE y.id = :id"),
    @NamedQuery(name = "Year.findByNumberYear", query = "SELECT y FROM Year y WHERE y.numberYear = :numberYear"),
    @NamedQuery(name = "Year.findByEstado", query = "SELECT y FROM Year y WHERE y.estado = :estado")})
public class Year implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "number_year")
    private int numberYear;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idYear")
    private List<TrimestreVigente> trimestreVigenteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idYear")
    private List<VinculacionInstructor> vinculacionInstructorList;

    public Year() {
    }

    public Year(Integer id) {
        this.id = id;
    }

    public Year(Integer id, int numberYear, String estado) {
        this.id = id;
        this.numberYear = numberYear;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumberYear() {
        return numberYear;
    }

    public void setNumberYear(int numberYear) {
        this.numberYear = numberYear;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<TrimestreVigente> getTrimestreVigenteList() {
        return trimestreVigenteList;
    }

    public void setTrimestreVigenteList(List<TrimestreVigente> trimestreVigenteList) {
        this.trimestreVigenteList = trimestreVigenteList;
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
        if (!(object instanceof Year)) {
            return false;
        }
        Year other = (Year) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Year[ id=" + id + " ]";
    }
    
}
