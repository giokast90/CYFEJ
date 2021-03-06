package Modelos;
// Generated 09-06-2013 07:53:46 PM by Hibernate Tools 3.2.1.GA


import DAO.Despachos.Abogados.ataDAO;
import DAO.Despachos.Abogados.ataDAOimpl;
import java.util.List;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * AbogadoTipoabogado generated by hbm2java
 */
@Entity
@Table(name= "abogadotipoabogado")
@AssociationOverrides({
    @AssociationOverride(name = "id.abogados", joinColumns =
    @JoinColumn(name = "idAbogado")),
    @AssociationOverride(name = "id.tipoAbogado", joinColumns =
    @JoinColumn(name = "idTipoAbogado"))})

public class AbogadoTipoabogado  implements java.io.Serializable {


     private ataId id = new ataId();
     private ataDAO dao;

    public AbogadoTipoabogado() {
        dao = new ataDAOimpl();
    }

    @EmbeddedId
    public ataId getId() {
        return id;
    }

    public void setId(ataId id) {
        this.id = id;
    }

    @Transient
    public Abogados getAbogados(){
        return getId().getAbogados();
    }
    
    public void setAbogados(Abogados abogados){
        getId().setAbogados(abogados);
    }
    
    @Transient
    public Tipoabogado getTipoabogado(){
        return getId().getTipoAbogado();
    }
    
    public void setTipoabogado(Tipoabogado tipoabogado){
        getId().setTipoAbogado(tipoabogado);
    }
     
    public List<AbogadoTipoabogado> listaATA(){
        return dao.listaATA();
    }
    
    public boolean guardarATAbogado(Abogados abogados, Long idTipoAbogado){
        return  dao.guardarATAbogado(abogados,idTipoAbogado);
    }
    
      @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AbogadoTipoabogado that = (AbogadoTipoabogado) o;

        if (getId() != null ? !getId().equals(that.getId())
                : that.getId() != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (getId() != null ? getId().hashCode() : 0);
    }

}


