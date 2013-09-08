package Entidades;
// Generated 09-06-2013 07:53:46 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PersonaTipopersona generated by hbm2java
 */
@Entity
@Table(name="persona_tipopersona"
    ,catalog="despachoabogados"
)
public class PersonaTipopersona  implements java.io.Serializable {


     private PersonaTipopersonaId id;
     private Tipopersona tipopersona;
     private Personas personas;
     private boolean activo;
     private Set detallesexpedientes = new HashSet(0);

    public PersonaTipopersona() {
    }

	
    public PersonaTipopersona(PersonaTipopersonaId id, Tipopersona tipopersona, Personas personas, boolean activo) {
        this.id = id;
        this.tipopersona = tipopersona;
        this.personas = personas;
        this.activo = activo;
    }
    public PersonaTipopersona(PersonaTipopersonaId id, Tipopersona tipopersona, Personas personas, boolean activo, Set detallesexpedientes) {
       this.id = id;
       this.tipopersona = tipopersona;
       this.personas = personas;
       this.activo = activo;
       this.detallesexpedientes = detallesexpedientes;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idPersona", column=@Column(name="idPersona", nullable=false) ), 
        @AttributeOverride(name="idTipoPersona", column=@Column(name="idTipoPersona", nullable=false) ) } )
    public PersonaTipopersonaId getId() {
        return this.id;
    }
    
    public void setId(PersonaTipopersonaId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idTipoPersona", nullable=false, insertable=false, updatable=false)
    public Tipopersona getTipopersona() {
        return this.tipopersona;
    }
    
    public void setTipopersona(Tipopersona tipopersona) {
        this.tipopersona = tipopersona;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idPersona", nullable=false, insertable=false, updatable=false)
    public Personas getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    
    @Column(name="Activo", nullable=false)
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="personaTipopersona")
    public Set getDetallesexpedientes() {
        return this.detallesexpedientes;
    }
    
    public void setDetallesexpedientes(Set detallesexpedientes) {
        this.detallesexpedientes = detallesexpedientes;
    }




}


