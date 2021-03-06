package Modelos;
// Generated 09-09-2013 12:06:13 AM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Estadoexpediente generated by hbm2java
 */
@Entity
@Table(name = "estadoexpediente")
public class Estadoexpediente implements java.io.Serializable {

    private Long idEstadoExpediente;
    private Estado estado;
    private Expediente expediente;
    private Date fechaEstado;

    public Estadoexpediente() {
    }

    public Estadoexpediente(Estado estado, Expediente expediente, Date fechaEstado) {
        this.estado = estado;
        this.expediente = expediente;
        this.fechaEstado = fechaEstado;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idEstadoExpediente", unique = true, nullable = false)
    public Long getIdEstadoExpediente() {
        return this.idEstadoExpediente;
    }

    public void setIdEstadoExpediente(Long idEstadoExpediente) {
        this.idEstadoExpediente = idEstadoExpediente;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEstado", nullable = false)
    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idExpediente", nullable = false)
    public Expediente getExpediente() {
        return this.expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FechaEstado", nullable = false, length = 19)
    public Date getFechaEstado() {
        return this.fechaEstado;
    }

    public void setFechaEstado(Date fechaEstado) {
        this.fechaEstado = fechaEstado;
    }
}
