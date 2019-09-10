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
@Table(name = "aprendiz")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aprendiz.findAll", query = "SELECT a FROM Aprendiz a"),
    @NamedQuery(name = "Aprendiz.findById", query = "SELECT a FROM Aprendiz a WHERE a.id = :id")})
public class Aprendiz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAprendiz")
    private List<IntegrantesGrupo> integrantesGrupoList;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "id_estado_formacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoFormacion idEstadoFormacion;
    @JoinColumn(name = "id_ficha", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ficha idFicha;

    public Aprendiz() {
    }

    public Aprendiz(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlTransient
    public List<IntegrantesGrupo> getIntegrantesGrupoList() {
        return integrantesGrupoList;
    }

    public void setIntegrantesGrupoList(List<IntegrantesGrupo> integrantesGrupoList) {
        this.integrantesGrupoList = integrantesGrupoList;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public EstadoFormacion getIdEstadoFormacion() {
        return idEstadoFormacion;
    }

    public void setIdEstadoFormacion(EstadoFormacion idEstadoFormacion) {
        this.idEstadoFormacion = idEstadoFormacion;
    }

    public Ficha getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(Ficha idFicha) {
        this.idFicha = idFicha;
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
        if (!(object instanceof Aprendiz)) {
            return false;
        }
        Aprendiz other = (Aprendiz) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Aprendiz[ id=" + id + " ]";
    }
    
}
