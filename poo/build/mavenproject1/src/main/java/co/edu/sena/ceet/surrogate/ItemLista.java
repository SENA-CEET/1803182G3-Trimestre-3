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
@Table(name = "item_lista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemLista.findAll", query = "SELECT i FROM ItemLista i"),
    @NamedQuery(name = "ItemLista.findById", query = "SELECT i FROM ItemLista i WHERE i.id = :id"),
    @NamedQuery(name = "ItemLista.findByNumeroItem", query = "SELECT i FROM ItemLista i WHERE i.numeroItem = :numeroItem"),
    @NamedQuery(name = "ItemLista.findByPregunta", query = "SELECT i FROM ItemLista i WHERE i.pregunta = :pregunta")})
public class ItemLista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_item")
    private int numeroItem;
    @Basic(optional = false)
    @Column(name = "pregunta")
    private String pregunta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idItemLista")
    private List<RespuestaGrupo> respuestaGrupoList;
    @JoinColumn(name = "id_lista_chequeo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ListaChequeo idListaChequeo;
    @JoinColumn(name = "id_resultado_aprendizaje", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ResultadoAprendizaje idResultadoAprendizaje;

    public ItemLista() {
    }

    public ItemLista(Integer id) {
        this.id = id;
    }

    public ItemLista(Integer id, int numeroItem, String pregunta) {
        this.id = id;
        this.numeroItem = numeroItem;
        this.pregunta = pregunta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @XmlTransient
    public List<RespuestaGrupo> getRespuestaGrupoList() {
        return respuestaGrupoList;
    }

    public void setRespuestaGrupoList(List<RespuestaGrupo> respuestaGrupoList) {
        this.respuestaGrupoList = respuestaGrupoList;
    }

    public ListaChequeo getIdListaChequeo() {
        return idListaChequeo;
    }

    public void setIdListaChequeo(ListaChequeo idListaChequeo) {
        this.idListaChequeo = idListaChequeo;
    }

    public ResultadoAprendizaje getIdResultadoAprendizaje() {
        return idResultadoAprendizaje;
    }

    public void setIdResultadoAprendizaje(ResultadoAprendizaje idResultadoAprendizaje) {
        this.idResultadoAprendizaje = idResultadoAprendizaje;
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
        if (!(object instanceof ItemLista)) {
            return false;
        }
        ItemLista other = (ItemLista) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.ItemLista[ id=" + id + " ]";
    }
    
}
