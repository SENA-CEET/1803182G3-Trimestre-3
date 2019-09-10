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
@Table(name = "ambiente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ambiente.findAll", query = "SELECT a FROM Ambiente a"),
    @NamedQuery(name = "Ambiente.findById", query = "SELECT a FROM Ambiente a WHERE a.id = :id"),
    @NamedQuery(name = "Ambiente.findByNumeroAmbiente", query = "SELECT a FROM Ambiente a WHERE a.numeroAmbiente = :numeroAmbiente"),
    @NamedQuery(name = "Ambiente.findByDescripcion", query = "SELECT a FROM Ambiente a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Ambiente.findByEstado", query = "SELECT a FROM Ambiente a WHERE a.estado = :estado"),
    @NamedQuery(name = "Ambiente.findByLimitacion", query = "SELECT a FROM Ambiente a WHERE a.limitacion = :limitacion")})
public class Ambiente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_ambiente")
    private String numeroAmbiente;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "limitacion")
    private String limitacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAmbiente")
    private List<Horario> horarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAmbiente")
    private List<LimitacionAmbiente> limitacionAmbienteList;
    @JoinColumn(name = "id_sede", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sede idSede;
    @JoinColumn(name = "id_tipo_ambiente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoAmbiente idTipoAmbiente;

    public Ambiente() {
    }

    public Ambiente(Integer id) {
        this.id = id;
    }

    public Ambiente(Integer id, String numeroAmbiente, String descripcion, String estado, String limitacion) {
        this.id = id;
        this.numeroAmbiente = numeroAmbiente;
        this.descripcion = descripcion;
        this.estado = estado;
        this.limitacion = limitacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroAmbiente() {
        return numeroAmbiente;
    }

    public void setNumeroAmbiente(String numeroAmbiente) {
        this.numeroAmbiente = numeroAmbiente;
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

    public String getLimitacion() {
        return limitacion;
    }

    public void setLimitacion(String limitacion) {
        this.limitacion = limitacion;
    }

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    @XmlTransient
    public List<LimitacionAmbiente> getLimitacionAmbienteList() {
        return limitacionAmbienteList;
    }

    public void setLimitacionAmbienteList(List<LimitacionAmbiente> limitacionAmbienteList) {
        this.limitacionAmbienteList = limitacionAmbienteList;
    }

    public Sede getIdSede() {
        return idSede;
    }

    public void setIdSede(Sede idSede) {
        this.idSede = idSede;
    }

    public TipoAmbiente getIdTipoAmbiente() {
        return idTipoAmbiente;
    }

    public void setIdTipoAmbiente(TipoAmbiente idTipoAmbiente) {
        this.idTipoAmbiente = idTipoAmbiente;
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
        if (!(object instanceof Ambiente)) {
            return false;
        }
        Ambiente other = (Ambiente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Ambiente[ id=" + id + " ]";
    }
    
}
