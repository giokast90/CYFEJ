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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Juzgados generated by hbm2java
 */
@Entity
@Table(name="juzgados"
    ,catalog="despachoabogados"
)
public class Juzgados  implements java.io.Serializable {


     private Integer idJuzgados;
     private Departamento departamento;
     private String descripcion;
     private String direccion;
     private int telefono;
     private Integer celular;
     private Set asuntojuzgados = new HashSet(0);

    public Juzgados() {
    }

	
    public Juzgados(Departamento departamento, String descripcion, String direccion, int telefono) {
        this.departamento = departamento;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    public Juzgados(Departamento departamento, String descripcion, String direccion, int telefono, Integer celular, Set asuntojuzgados) {
       this.departamento = departamento;
       this.descripcion = descripcion;
       this.direccion = direccion;
       this.telefono = telefono;
       this.celular = celular;
       this.asuntojuzgados = asuntojuzgados;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="idJuzgados", unique=true, nullable=false)
    public Integer getIdJuzgados() {
        return this.idJuzgados;
    }
    
    public void setIdJuzgados(Integer idJuzgados) {
        this.idJuzgados = idJuzgados;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idDepartamento", nullable=false)
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    @Column(name="descripcion", nullable=false, length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Column(name="direccion", nullable=false, length=100)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Column(name="telefono", nullable=false)
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Column(name="celular")
    public Integer getCelular() {
        return this.celular;
    }
    
    public void setCelular(Integer celular) {
        this.celular = celular;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="juzgados")
    public Set getAsuntojuzgados() {
        return this.asuntojuzgados;
    }
    
    public void setAsuntojuzgados(Set asuntojuzgados) {
        this.asuntojuzgados = asuntojuzgados;
    }




}


