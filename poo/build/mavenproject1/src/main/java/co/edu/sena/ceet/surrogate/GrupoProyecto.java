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
@Table(name = "grupo_proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoProyecto.findAll", query = "SELECT g FROM GrupoProyecto g"),
    @NamedQuery(name = "GrupoProyecto.findById", query = "SELECT g FROM GrupoProyecto g WHERE g.id = :id"),
    @NamedQuery(name = "GrupoProyecto.findByNumeroGrupo", query = "SELECT g FROM GrupoProyecto g WHERE g.numeroGrupo = :numeroGrupo"),
    @NamedQuery(name = "GrupoProyecto.findByNombreProyecto", query = "SELECT g FROM GrupoProyecto g WHERE g.nombreProyecto = :nombreProyecto"),
    @NamedQuery(name = "GrupoProyecto.findByEstado", query = "SELECT g FROM GrupoProyecto g WHERE g.estado = :estado")})
public class GrupoProyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_grupo")
    private int numeroGrupo;
    @Basic(optional = false)
    @Column(name = "nombre_proyecto")
    private String nombreProyecto;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrupoProyecto")
    private List<IntegrantesGrupo> integrantesGrupoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrupoProyecto")
    private List<ObservacionGeneral> observacionGeneralList;
    @JoinColumn(name = "id_ficha", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ficha idFicha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGrupoProyecto")
    private List<RespuestaGrupo> respuestaGrupoList;

    public GrupoProyecto() {
    }

    public GrupoProyecto(Integer id) {
        this.id = id;
    }

    public GrupoProyecto(Integer id, int numeroGrupo, String nombreProyecto, String estado) {
        this.id = id;
        this.numeroGrupo = numeroGrupo;
        this.nombreProyecto = nombreProyecto;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<IntegrantesGrupo> getIntegrantesGrupoList() {
        return integrantesGrupoList;
    }

    public void setIntegrantesGrupoList(List<IntegrantesGrupo> integrantesGrupoList) {
        this.integrantesGrupoList = integrantesGrupoList;
    }

    @XmlTransient
    public List<ObservacionGeneral> getObservacionGeneralList() {
        return observacionGeneralList;
    }

    public void setObservacionGeneralList(List<ObservacionGeneral> observacionGeneralList) {
        this.observacionGeneralList = observacionGeneralList;
    }

    public Ficha getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Ficha idFicha) {
        this.idFicha = idFicha;
    }

    @XmlTransient
    public List<RespuestaGrupo> getRespuestaGrupoList() {
        return respuestaGrupoList;
    }

    public void setRespuestaGrupoList(List<RespuestaGrupo> respuestaGrupoList) {
        this.respuestaGrupoList = respuestaGrupoList;
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
        if (!(object instanceof GrupoProyecto)) {
            return false;
        }
        GrupoProyecto other = (GrupoProyecto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.GrupoProyecto[ id=" + id + " ]";
    }
    
}
