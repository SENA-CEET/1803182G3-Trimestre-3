/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ceet.surrogate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "area_instructor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AreaInstructor.findAll", query = "SELECT a FROM AreaInstructor a"),
    @NamedQuery(name = "AreaInstructor.findById", query = "SELECT a FROM AreaInstructor a WHERE a.id = :id"),
    @NamedQuery(name = "AreaInstructor.findByEstado", query = "SELECT a FROM AreaInstructor a WHERE a.estado = :estado")})
public class AreaInstructor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_area", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Area idArea;
    @JoinColumn(name = "id_instructor", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Instructor idInstructor;

    public AreaInstructor() {
    }

    public AreaInstructor(Integer id) {
        this.id = id;
    }

    public AreaInstructor(Integer id, String estado) {
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

    public Area getIdArea() {
        return idArea;
    }

    public void setIdArea(Area idArea) {
        this.idArea = idArea;
    }

    public Instructor getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(Instructor idInstructor) {
        this.idInstructor = idInstructor;
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
        if (!(object instanceof AreaInstructor)) {
            return false;
        }
        AreaInstructor other = (AreaInstructor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.AreaInstructor[ id=" + id + " ]";
    }
    
}
