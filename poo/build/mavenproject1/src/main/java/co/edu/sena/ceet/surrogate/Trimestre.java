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
@Table(name = "trimestre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trimestre.findAll", query = "SELECT t FROM Trimestre t"),
    @NamedQuery(name = "Trimestre.findById", query = "SELECT t FROM Trimestre t WHERE t.id = :id"),
    @NamedQuery(name = "Trimestre.findByNombreTrimestre", query = "SELECT t FROM Trimestre t WHERE t.nombreTrimestre = :nombreTrimestre"),
    @NamedQuery(name = "Trimestre.findByEstado", query = "SELECT t FROM Trimestre t WHERE t.estado = :estado")})
public class Trimestre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre_trimestre")
    private int nombreTrimestre;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTrimestre")
    private List<FichaHasTrimestre> fichaHasTrimestreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTrimestre")
    private List<ProgramacionTrimestre> programacionTrimestreList;
    @JoinColumn(name = "id_jornada", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Jornada idJornada;
    @JoinColumn(name = "id_nivel_formacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private NivelFormacion idNivelFormacion;

    public Trimestre() {
    }

    public Trimestre(Integer id) {
        this.id = id;
    }

    public Trimestre(Integer id, int nombreTrimestre, String estado) {
        this.id = id;
        this.nombreTrimestre = nombreTrimestre;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNombreTrimestre() {
        return nombreTrimestre;
    }

    public void setNombreTrimestre(int nombreTrimestre) {
        this.nombreTrimestre = nombreTrimestre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<FichaHasTrimestre> getFichaHasTrimestreList() {
        return fichaHasTrimestreList;
    }

    public void setFichaHasTrimestreList(List<FichaHasTrimestre> fichaHasTrimestreList) {
        this.fichaHasTrimestreList = fichaHasTrimestreList;
    }

    @XmlTransient
    public List<ProgramacionTrimestre> getProgramacionTrimestreList() {
        return programacionTrimestreList;
    }

    public void setProgramacionTrimestreList(List<ProgramacionTrimestre> programacionTrimestreList) {
        this.programacionTrimestreList = programacionTrimestreList;
    }

    public Jornada getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Jornada idJornada) {
        this.idJornada = idJornada;
    }

    public NivelFormacion getIdNivelFormacion() {
        return idNivelFormacion;
    }

    public void setIdNivelFormacion(NivelFormacion idNivelFormacion) {
        this.idNivelFormacion = idNivelFormacion;
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
        if (!(object instanceof Trimestre)) {
            return false;
        }
        Trimestre other = (Trimestre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Trimestre[ id=" + id + " ]";
    }
    
}
