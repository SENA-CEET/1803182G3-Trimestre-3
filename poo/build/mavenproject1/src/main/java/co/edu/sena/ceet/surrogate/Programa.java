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
@Table(name = "programa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programa.findAll", query = "SELECT p FROM Programa p"),
    @NamedQuery(name = "Programa.findById", query = "SELECT p FROM Programa p WHERE p.id = :id"),
    @NamedQuery(name = "Programa.findByCodigo", query = "SELECT p FROM Programa p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Programa.findByVersion", query = "SELECT p FROM Programa p WHERE p.version = :version"),
    @NamedQuery(name = "Programa.findByNombre", query = "SELECT p FROM Programa p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Programa.findBySigla", query = "SELECT p FROM Programa p WHERE p.sigla = :sigla"),
    @NamedQuery(name = "Programa.findByEstado", query = "SELECT p FROM Programa p WHERE p.estado = :estado")})
public class Programa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Basic(optional = false)
    @Column(name = "version")
    private String version;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "sigla")
    private String sigla;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_nivel_formacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private NivelFormacion idNivelFormacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrograma")
    private List<Ficha> fichaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrograma")
    private List<Proyecto> proyectoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrograma")
    private List<Competencia> competenciaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrograma")
    private List<ListaChequeo> listaChequeoList;

    public Programa() {
    }

    public Programa(Integer id) {
        this.id = id;
    }

    public Programa(Integer id, String codigo, String version, String nombre, String sigla, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.version = version;
        this.nombre = nombre;
        this.sigla = sigla;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public NivelFormacion getIdNivelFormacion() {
        return idNivelFormacion;
    }

    public void setIdNivelFormacion(NivelFormacion idNivelFormacion) {
        this.idNivelFormacion = idNivelFormacion;
    }

    @XmlTransient
    public List<Ficha> getFichaList() {
        return fichaList;
    }

    public void setFichaList(List<Ficha> fichaList) {
        this.fichaList = fichaList;
    }

    @XmlTransient
    public List<Proyecto> getProyectoList() {
        return proyectoList;
    }

    public void setProyectoList(List<Proyecto> proyectoList) {
        this.proyectoList = proyectoList;
    }

    @XmlTransient
    public List<Competencia> getCompetenciaList() {
        return competenciaList;
    }

    public void setCompetenciaList(List<Competencia> competenciaList) {
        this.competenciaList = competenciaList;
    }

    @XmlTransient
    public List<ListaChequeo> getListaChequeoList() {
        return listaChequeoList;
    }

    public void setListaChequeoList(List<ListaChequeo> listaChequeoList) {
        this.listaChequeoList = listaChequeoList;
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
        if (!(object instanceof Programa)) {
            return false;
        }
        Programa other = (Programa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Programa[ id=" + id + " ]";
    }
    
}
