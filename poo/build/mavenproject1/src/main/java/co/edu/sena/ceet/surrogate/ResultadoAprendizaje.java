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
@Table(name = "resultado_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResultadoAprendizaje.findAll", query = "SELECT r FROM ResultadoAprendizaje r"),
    @NamedQuery(name = "ResultadoAprendizaje.findById", query = "SELECT r FROM ResultadoAprendizaje r WHERE r.id = :id"),
    @NamedQuery(name = "ResultadoAprendizaje.findByCodigoResultado", query = "SELECT r FROM ResultadoAprendizaje r WHERE r.codigoResultado = :codigoResultado"),
    @NamedQuery(name = "ResultadoAprendizaje.findByDenominacion", query = "SELECT r FROM ResultadoAprendizaje r WHERE r.denominacion = :denominacion")})
public class ResultadoAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "codigo_resultado")
    private String codigoResultado;
    @Basic(optional = false)
    @Column(name = "denominacion")
    private String denominacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResultadoAprendizaje")
    private List<ProgramacionTrimestre> programacionTrimestreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResultadoAprendizaje")
    private List<ResultadosVistos> resultadosVistosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResultadoAprendizaje")
    private List<LimitacionAmbiente> limitacionAmbienteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResultadoAprendizaje")
    private List<ItemLista> itemListaList;
    @JoinColumn(name = "id_competencia", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Competencia idCompetencia;

    public ResultadoAprendizaje() {
    }

    public ResultadoAprendizaje(Integer id) {
        this.id = id;
    }

    public ResultadoAprendizaje(Integer id, String codigoResultado, String denominacion) {
        this.id = id;
        this.codigoResultado = codigoResultado;
        this.denominacion = denominacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoResultado() {
        return codigoResultado;
    }

    public void setCodigoResultado(String codigoResultado) {
        this.codigoResultado = codigoResultado;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @XmlTransient
    public List<ProgramacionTrimestre> getProgramacionTrimestreList() {
        return programacionTrimestreList;
    }

    public void setProgramacionTrimestreList(List<ProgramacionTrimestre> programacionTrimestreList) {
        this.programacionTrimestreList = programacionTrimestreList;
    }

    @XmlTransient
    public List<ResultadosVistos> getResultadosVistosList() {
        return resultadosVistosList;
    }

    public void setResultadosVistosList(List<ResultadosVistos> resultadosVistosList) {
        this.resultadosVistosList = resultadosVistosList;
    }

    @XmlTransient
    public List<LimitacionAmbiente> getLimitacionAmbienteList() {
        return limitacionAmbienteList;
    }

    public void setLimitacionAmbienteList(List<LimitacionAmbiente> limitacionAmbienteList) {
        this.limitacionAmbienteList = limitacionAmbienteList;
    }

    @XmlTransient
    public List<ItemLista> getItemListaList() {
        return itemListaList;
    }

    public void setItemListaList(List<ItemLista> itemListaList) {
        this.itemListaList = itemListaList;
    }

    public Competencia getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Competencia idCompetencia) {
        this.idCompetencia = idCompetencia;
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
        if (!(object instanceof ResultadoAprendizaje)) {
            return false;
        }
        ResultadoAprendizaje other = (ResultadoAprendizaje) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.ResultadoAprendizaje[ id=" + id + " ]";
    }
    
}
