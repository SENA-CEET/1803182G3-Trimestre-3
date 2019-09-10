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
@Table(name = "competencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Competencia.findAll", query = "SELECT c FROM Competencia c"),
    @NamedQuery(name = "Competencia.findById", query = "SELECT c FROM Competencia c WHERE c.id = :id"),
    @NamedQuery(name = "Competencia.findByCodigoCompetencia", query = "SELECT c FROM Competencia c WHERE c.codigoCompetencia = :codigoCompetencia"),
    @NamedQuery(name = "Competencia.findByDenominacion", query = "SELECT c FROM Competencia c WHERE c.denominacion = :denominacion")})
public class Competencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "codigo_competencia")
    private String codigoCompetencia;
    @Basic(optional = false)
    @Column(name = "denominacion")
    private String denominacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCompetencia")
    private List<DisponibilidadCompetencias> disponibilidadCompetenciasList;
    @JoinColumn(name = "id_programa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Programa idPrograma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCompetencia")
    private List<ResultadoAprendizaje> resultadoAprendizajeList;

    public Competencia() {
    }

    public Competencia(Integer id) {
        this.id = id;
    }

    public Competencia(Integer id, String codigoCompetencia, String denominacion) {
        this.id = id;
        this.codigoCompetencia = codigoCompetencia;
        this.denominacion = denominacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoCompetencia() {
        return codigoCompetencia;
    }

    public void setCodigoCompetencia(String codigoCompetencia) {
        this.codigoCompetencia = codigoCompetencia;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @XmlTransient
    public List<DisponibilidadCompetencias> getDisponibilidadCompetenciasList() {
        return disponibilidadCompetenciasList;
    }

    public void setDisponibilidadCompetenciasList(List<DisponibilidadCompetencias> disponibilidadCompetenciasList) {
        this.disponibilidadCompetenciasList = disponibilidadCompetenciasList;
    }

    public Programa getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Programa idPrograma) {
        this.idPrograma = idPrograma;
    }

    @XmlTransient
    public List<ResultadoAprendizaje> getResultadoAprendizajeList() {
        return resultadoAprendizajeList;
    }

    public void setResultadoAprendizajeList(List<ResultadoAprendizaje> resultadoAprendizajeList) {
        this.resultadoAprendizajeList = resultadoAprendizajeList;
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
        if (!(object instanceof Competencia)) {
            return false;
        }
        Competencia other = (Competencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Competencia[ id=" + id + " ]";
    }
    
}
