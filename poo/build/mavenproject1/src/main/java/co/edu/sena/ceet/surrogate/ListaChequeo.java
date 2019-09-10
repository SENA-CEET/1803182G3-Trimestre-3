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
@Table(name = "lista_chequeo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListaChequeo.findAll", query = "SELECT l FROM ListaChequeo l"),
    @NamedQuery(name = "ListaChequeo.findById", query = "SELECT l FROM ListaChequeo l WHERE l.id = :id"),
    @NamedQuery(name = "ListaChequeo.findByLista", query = "SELECT l FROM ListaChequeo l WHERE l.lista = :lista"),
    @NamedQuery(name = "ListaChequeo.findByEstado", query = "SELECT l FROM ListaChequeo l WHERE l.estado = :estado")})
public class ListaChequeo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "lista")
    private String lista;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idListaChequeo")
    private List<ListaFicha> listaFichaList;
    @JoinColumn(name = "id_programa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Programa idPrograma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idListaChequeo")
    private List<ItemLista> itemListaList;

    public ListaChequeo() {
    }

    public ListaChequeo(Integer id) {
        this.id = id;
    }

    public ListaChequeo(Integer id, String lista, int estado) {
        this.id = id;
        this.lista = lista;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<ListaFicha> getListaFichaList() {
        return listaFichaList;
    }

    public void setListaFichaList(List<ListaFicha> listaFichaList) {
        this.listaFichaList = listaFichaList;
    }

    public Programa getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Programa idPrograma) {
        this.idPrograma = idPrograma;
    }

    @XmlTransient
    public List<ItemLista> getItemListaList() {
        return itemListaList;
    }

    public void setItemListaList(List<ItemLista> itemListaList) {
        this.itemListaList = itemListaList;
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
        if (!(object instanceof ListaChequeo)) {
            return false;
        }
        ListaChequeo other = (ListaChequeo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.ListaChequeo[ id=" + id + " ]";
    }
    
}
