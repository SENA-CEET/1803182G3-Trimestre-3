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
@Table(name = "tipo_ambiente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAmbiente.findAll", query = "SELECT t FROM TipoAmbiente t"),
    @NamedQuery(name = "TipoAmbiente.findById", query = "SELECT t FROM TipoAmbiente t WHERE t.id = :id"),
    @NamedQuery(name = "TipoAmbiente.findByTipo", query = "SELECT t FROM TipoAmbiente t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "TipoAmbiente.findByDescripcion", query = "SELECT t FROM TipoAmbiente t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TipoAmbiente.findByEstado", query = "SELECT t FROM TipoAmbiente t WHERE t.estado = :estado")})
public class TipoAmbiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoAmbiente")
    private List<Ambiente> ambienteList;

    public TipoAmbiente() {
    }

    public TipoAmbiente(Integer id) {
        this.id = id;
    }

    public TipoAmbiente(Integer id, String tipo, String descripcion, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Ambiente> getAmbienteList() {
        return ambienteList;
    }

    public void setAmbienteList(List<Ambiente> ambienteList) {
        this.ambienteList = ambienteList;
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
        if (!(object instanceof TipoAmbiente)) {
            return false;
        }
        TipoAmbiente other = (TipoAmbiente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.TipoAmbiente[ id=" + id + " ]";
    }
    
}
