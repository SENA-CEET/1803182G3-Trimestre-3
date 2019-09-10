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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findById", query = "SELECT c FROM Cliente c WHERE c.id = :id"),
    @NamedQuery(name = "Cliente.findByNumeroDocumento", query = "SELECT c FROM Cliente c WHERE c.numeroDocumento = :numeroDocumento"),
    @NamedQuery(name = "Cliente.findByPrimerNombre", query = "SELECT c FROM Cliente c WHERE c.primerNombre = :primerNombre"),
    @NamedQuery(name = "Cliente.findBySegundoNombre", query = "SELECT c FROM Cliente c WHERE c.segundoNombre = :segundoNombre"),
    @NamedQuery(name = "Cliente.findByPrimerApellido", query = "SELECT c FROM Cliente c WHERE c.primerApellido = :primerApellido"),
    @NamedQuery(name = "Cliente.findBySegundoApellido", query = "SELECT c FROM Cliente c WHERE c.segundoApellido = :segundoApellido")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_documento")
    private String numeroDocumento;
    @Basic(optional = false)
    @Column(name = "primer_nombre")
    private String primerNombre;
    @Column(name = "segundo_nombre")
    private String segundoNombre;
    @Basic(optional = false)
    @Column(name = "primer_apellido")
    private String primerApellido;
    @Column(name = "segundo_apellido")
    private String segundoApellido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<ObservacionRespuesta> observacionRespuestaList;
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoDocumento idTipoDocumento;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @OneToOne(optional = false)
    private User idUser;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private Instructor instructor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<ObservacionGeneral> observacionGeneralList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<LogAuditoria> logAuditoriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<Aprendiz> aprendizList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCliente")
    private List<LogErrores> logErroresList;

    public Cliente() {
    }

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente(Integer id, String numeroDocumento, String primerNombre, String primerApellido) {
        this.id = id;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @XmlTransient
    public List<ObservacionRespuesta> getObservacionRespuestaList() {
        return observacionRespuestaList;
    }

    public void setObservacionRespuestaList(List<ObservacionRespuesta> observacionRespuestaList) {
        this.observacionRespuestaList = observacionRespuestaList;
    }

    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @XmlTransient
    public List<ObservacionGeneral> getObservacionGeneralList() {
        return observacionGeneralList;
    }

    public void setObservacionGeneralList(List<ObservacionGeneral> observacionGeneralList) {
        this.observacionGeneralList = observacionGeneralList;
    }

    @XmlTransient
    public List<LogAuditoria> getLogAuditoriaList() {
        return logAuditoriaList;
    }

    public void setLogAuditoriaList(List<LogAuditoria> logAuditoriaList) {
        this.logAuditoriaList = logAuditoriaList;
    }

    @XmlTransient
    public List<Aprendiz> getAprendizList() {
        return aprendizList;
    }

    public void setAprendizList(List<Aprendiz> aprendizList) {
        this.aprendizList = aprendizList;
    }

    @XmlTransient
    public List<LogErrores> getLogErroresList() {
        return logErroresList;
    }

    public void setLogErroresList(List<LogErrores> logErroresList) {
        this.logErroresList = logErroresList;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.sena.ceet.surrogate.Cliente[ id=" + id + " ]";
    }
    
}
