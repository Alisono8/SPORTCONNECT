package co.edu.ue.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

/**
 * The persistent class for the detalle_evento database table.
 */
@Entity
@Table(name = "detalle_evento")
public class DetalleEvento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Long idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Eventos evento;

    @ManyToOne
    @JoinColumn(name = "id_deportista")
    private Deportista deportista;

    @Column(name = "hora")
    private String hora;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "direccion")
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_entrenador")
    private Entrenador entrenador;

    @Column(name = "estatus")
    private int estatus;

    public DetalleEvento() {
    }

    // Getters y Setters
    public Long getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Long idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Eventos getEvento() {
        return evento;
    }

    public void setEvento(Eventos evento) {
        this.evento = evento;
    }

    public Deportista getDeportista() {
        return deportista;
    }

    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }
}

   

