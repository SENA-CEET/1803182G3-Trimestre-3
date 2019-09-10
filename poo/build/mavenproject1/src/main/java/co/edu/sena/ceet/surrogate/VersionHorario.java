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
@Table(name = "version_horario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VersionHorario.findAll", query = "SELECT v FROM VersionHorario v"),
    @NamedQuery(name = "VersionHorario.findById", query = "SELECT v FROM VersionHorario v WHERE v.id = :id"),
    @NamedQuery(name = "VersionHorario.findByNumeroVersion", query = "SELECT v FROM VersionHorario v WHERE v.numeroVersion = :numeroVersion"),
    @NamedQuery(name = "VersionHorario.findByEstado", query = "SELECT v FROM VersionHorario v WHERE v.estado = :estado")})
public class VersionHorario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_version")
    private String numeroVersion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVersionHorario")
    private List<Horario> horarioList;
    @JoinColumn(name = "id_trimestre_vigente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TrimestreVigente idTrimestreVigente;

    public VersionHorario() {
    }

    public VersionHorario(Integer id) {
        this.id = id;
    }

    public VersionHorario(Integer id, String numeroVersion, String estado) {
        this.id = id;
        this.numeroVersion = numeroVersion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroVersion() {
        return numeroVersion;
    }

    public void setNumeroVersion(String numeroVersion) {
        this.numeroVersion = numeroVersion;
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

    public TrimestreVigente getIdTrimestreVigente() {
        return idTrimestreVigente;
    }

    public void setIdTrimestreVigente(TrimestreVigente idTrimestreVigente) {
        this.idTrimestreVigente = idTrimestreVigente;
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
        if (!(object instanceof VersionHorario)) {
            return false;
        }
        VersionHorario other = (VersionHorario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.VersionHorario[ id=" + id + " ]";
    }
    
}
