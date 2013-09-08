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
 * AbogadoTipoabogado generated by hbm2java
 */
@Entity
@Table(name="abogado_tipoabogado"
    ,catalog="despachoabogados"
)
public class AbogadoTipoabogado  implements java.io.Serializable {


     private AbogadoTipoabogadoId id;
     private Tipoabogado tipoabogado;
     private Abogados abogados;
     private boolean activo;
     private Set detallesexpedientes = new HashSet(0);

    public AbogadoTipoabogado() {
    }

	
    public AbogadoTipoabogado(AbogadoTipoabogadoId id, Tipoabogado tipoabogado, Abogados abogados, boolean activo) {
        this.id = id;
        this.tipoabogado = tipoabogado;
        this.abogados = abogados;
        this.activo = activo;
    }
    public AbogadoTipoabogado(AbogadoTipoabogadoId id, Tipoabogado tipoabogado, Abogados abogados, boolean activo, Set detallesexpedientes) {
       this.id = id;
       this.tipoabogado = tipoabogado;
       this.abogados = abogados;
       this.activo = activo;
       this.detallesexpedientes = detallesexpedientes;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idTipoAbogado", column=@Column(name="idTipoAbogado", nullable=false) ), 
        @AttributeOverride(name="idAbogado", column=@Column(name="idAbogado", nullable=false) ) } )
    public AbogadoTipoabogadoId getId() {
        return this.id;
    }
    
    public void setId(AbogadoTipoabogadoId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idTipoAbogado", nullable=false, insertable=false, updatable=false)
    public Tipoabogado getTipoabogado() {
        return this.tipoabogado;
    }
    
    public void setTipoabogado(Tipoabogado tipoabogado) {
        this.tipoabogado = tipoabogado;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idAbogado", nullable=false, insertable=false, updatable=false)
    public Abogados getAbogados() {
        return this.abogados;
    }
    
    public void setAbogados(Abogados abogados) {
        this.abogados = abogados;
    }
    
    @Column(name="Activo", nullable=false)
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="abogadoTipoabogado")
    public Set getDetallesexpedientes() {
        return this.detallesexpedientes;
    }
    
    public void setDetallesexpedientes(Set detallesexpedientes) {
        this.detallesexpedientes = detallesexpedientes;
    }




}


