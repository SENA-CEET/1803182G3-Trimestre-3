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
@Table(name = "respuesta_grupo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RespuestaGrupo.findAll", query = "SELECT r FROM RespuestaGrupo r"),
    @NamedQuery(name = "RespuestaGrupo.findById", query = "SELECT r FROM RespuestaGrupo r WHERE r.id = :id"),
    @NamedQuery(name = "RespuestaGrupo.findByFecha", query = "SELECT r FROM RespuestaGrupo r WHERE r.fecha = :fecha")})
public class RespuestaGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRespuestaGrupo")
    private List<ObservacionRespuesta> observacionRespuestaList;
    @JoinColumn(name = "id_grupo_proyecto", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private GrupoProyecto idGrupoProyecto;
    @JoinColumn(name = "id_item_lista", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ItemLista idItemLista;
    @JoinColumn(name = "id_valoracion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Valoracion idValoracion;

    public RespuestaGrupo() {
    }

    public RespuestaGrupo(Integer id) {
        this.id = id;
    }

    public RespuestaGrupo(Integer id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<ObservacionRespuesta> getObservacionRespuestaList() {
        return observacionRespuestaList;
    }

    public void setObservacionRespuestaList(List<ObservacionRespuesta> observacionRespuestaList) {
        this.observacionRespuestaList = observacionRespuestaList;
    }

    public GrupoProyecto getIdGrupoProyecto() {
        return idGrupoProyecto;
    }

    public void setIdGrupoProyecto(GrupoProyecto idGrupoProyecto) {
        this.idGrupoProyecto = idGrupoProyecto;
    }

    public ItemLista getIdItemLista() {
        return idItemLista;
    }

    public void setIdItemLista(ItemLista idItemLista) {
        this.idItemLista = idItemLista;
    }

    public Valoracion getIdValoracion() {
        return idValoracion;
    }

    public void setIdValoracion(Valoracion idValoracion) {
        this.idValoracion = idValoracion;
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
        if (!(object instanceof RespuestaGrupo)) {
            return false;
        }
        RespuestaGrupo other = (RespuestaGrupo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.RespuestaGrupo[ id=" + id + " ]";
    }
    
}
