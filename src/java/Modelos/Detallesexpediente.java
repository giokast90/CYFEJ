package Modelos;
// Generated 09-06-2013 07:53:46 PM by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Detallesexpediente generated by hbm2java
 */
@Entity
@Table(name = "detallesexpediente")
public class Detallesexpediente implements java.io.Serializable {

    private Long idDetExpediente;
    private Expediente expediente;
    private AbogadoTipoabogado abogadoTipoabogado;
    private PersonaTipoPersona personaTipopersona;

    public Detallesexpediente() {
    }

    public Detallesexpediente(Long idDetExpediente, Expediente expediente, AbogadoTipoabogado abogadoTipoabogado, PersonaTipoPersona personaTipopersona) {
        this.idDetExpediente = idDetExpediente;
        this.expediente = expediente;
        this.abogadoTipoabogado = abogadoTipoabogado;
        this.personaTipopersona = personaTipopersona;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "idDetExpediente", unique = true, nullable = false)
    public Long getIdDetExpediente() {
        return this.idDetExpediente;
    }

    public void setIdDetExpediente(Long idDetExpediente) {
        this.idDetExpediente = idDetExpediente;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idExpediente", nullable = false)
    public Expediente getExpediente() {
        return this.expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "idTipoAbogado", referencedColumnName = "idTipoAbogado", nullable = false),
        @JoinColumn(name = "idAbogado", referencedColumnName = "idAbogado", nullable = false)})
    public AbogadoTipoabogado getAbogadoTipoabogado() {
        return this.abogadoTipoabogado;
    }

    public void setAbogadoTipoabogado(AbogadoTipoabogado abogadoTipoabogado) {
        this.abogadoTipoabogado = abogadoTipoabogado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "idTipoPersona", referencedColumnName = "idTipoPersona", nullable = false),
        @JoinColumn(name = "idPersona", referencedColumnName = "idPersona", nullable = false)})
    public PersonaTipoPersona getPersonaTipopersona() {
        return personaTipopersona;
    }

    public void setPersonaTipopersona(PersonaTipoPersona personaTipopersona) {
        this.personaTipopersona = personaTipopersona;
    }
}