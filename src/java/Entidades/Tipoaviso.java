package Entidades;
// Generated 09-06-2013 07:53:46 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tipoaviso generated by hbm2java
 */
@Entity
@Table(name="tipoaviso"
    ,catalog="despachoabogados"
)
public class Tipoaviso  implements java.io.Serializable {


     private Integer idTipoAviso;
     private String descripcion;
     private Set estadoevolutivos = new HashSet(0);

    public Tipoaviso() {
    }

	
    public Tipoaviso(String descripcion) {
        this.descripcion = descripcion;
    }
    public Tipoaviso(String descripcion, Set estadoevolutivos) {
       this.descripcion = descripcion;
       this.estadoevolutivos = estadoevolutivos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idTipoAviso", unique=true, nullable=false)
    public Integer getIdTipoAviso() {
        return this.idTipoAviso;
    }
    
    public void setIdTipoAviso(Integer idTipoAviso) {
        this.idTipoAviso = idTipoAviso;
    }
    
    @Column(name="Descripcion", nullable=false, length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tipoaviso")
    public Set getEstadoevolutivos() {
        return this.estadoevolutivos;
    }
    
    public void setEstadoevolutivos(Set estadoevolutivos) {
        this.estadoevolutivos = estadoevolutivos;
    }




}


