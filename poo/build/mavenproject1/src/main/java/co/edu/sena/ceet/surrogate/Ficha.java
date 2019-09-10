/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.ceet.surrogate;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "ficha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ficha.findAll", query = "SELECT f FROM Ficha f"),
    @NamedQuery(name = "Ficha.findById", query = "SELECT f FROM Ficha f WHERE f.id = :id"),
    @NamedQuery(name = "Ficha.findByNumeroFicha", query = "SELECT f FROM Ficha f WHERE f.numeroFicha = :numeroFicha"),
    @NamedQuery(name = "Ficha.findByFechaInicio", query = "SELECT f FROM Ficha f WHERE f.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Ficha.findByFechaFin", query = "SELECT f FROM Ficha f WHERE f.fechaFin = :fechaFin"),
    @NamedQuery(name = "Ficha.findByRuta", query = "SELECT f FROM Ficha f WHERE f.ruta = :ruta")})
public class Ficha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_ficha")
    private String numeroFicha;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Basic(optional = false)
    @Column(name = "ruta")
    private String ruta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFicha")
    private List<FichaHasTrimestre> fichaHasTrimestreList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idFicha")
    private ListaFicha listaFicha;
    @JoinColumn(name = "id_estado_ficha", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoFicha idEstadoFicha;
    @JoinColumn(name = "id_jornada", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Jornada idJornada;
    @JoinColumn(name = "id_programa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Programa idPrograma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFicha")
    private List<GrupoProyecto> grupoProyectoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFicha")
    private List<Aprendiz> aprendizList;

    public Ficha() {
    }

    public Ficha(Integer id) {
        this.id = id;
    }

    public Ficha(Integer id, String numeroFicha, Date fechaInicio, Date fechaFin, String ruta) {
        this.id = id;
        this.numeroFicha = numeroFicha;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ruta = ruta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(String numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @XmlTransient
    public List<FichaHasTrimestre> getFichaHasTrimestreList() {
        return fichaHasTrimestreList;
    }

    public void setFichaHasTrimestreList(List<FichaHasTrimestre> fichaHasTrimestreList) {
        this.fichaHasTrimestreList = fichaHasTrimestreList;
    }

    public ListaFicha getListaFicha() {
        return listaFicha;
    }

    public void setListaFicha(ListaFicha listaFicha) {
        this.listaFicha = listaFicha;
    }

    public EstadoFicha getIdEstadoFicha() {
        return idEstadoFicha;
    }

    public void setIdEstadoFicha(EstadoFicha idEstadoFicha) {
        this.idEstadoFicha = idEstadoFicha;
    }

    public Jornada getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Jornada idJornada) {
        this.idJornada = idJornada;
    }

    public Programa getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Programa idPrograma) {
        this.idPrograma = idPrograma;
    }

    @XmlTransient
    public List<GrupoProyecto> getGrupoProyectoList() {
        return grupoProyectoList;
    }

    public void setGrupoProyectoList(List<GrupoProyecto> grupoProyectoList) {
        this.grupoProyectoList = grupoProyectoList;
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
        if (!(object instanceof Ficha)) {
            return false;
        }
        Ficha other = (Ficha) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Ficha[ id=" + id + " ]";
    }
    
}
