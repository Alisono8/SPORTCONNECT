package co.edu.ue.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

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
    @Positive(message = "El ID del detalle debe ser un número positivo.")
    private int idDetalle;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    @NotNull(message = "El evento no puede ser nulo.")
    private Eventos evento;

    @ManyToOne
    @JoinColumn(name = "id_deportista")
    @NotNull(message = "El deportista no puede ser nulo.")
    private Deportista deportista;

    @Column(name = "hora")
    @NotNull(message = "La hora no puede ser nula.")
    @Pattern(regexp = "^(?:[01]\\d|2[0-3]):[0-5]\\d$", message = "La hora debe estar en formato HH:mm.")
    private String hora;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    @NotNull(message = "La fecha no puede ser nula.")
    private Date fecha;

    @Column(name = "direccion")
    @NotNull(message = "La dirección no puede ser nula.")
    @Size(min = 5, max = 100, message = "La dirección debe tener entre 5 y 100 caracteres.")
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id_entrenador")
    @NotNull(message = "El entrenador no puede ser nulo.")
    private Entrenador entrenador;

    @Column(name = "estatus")
    @Positive(message = "El estatus debe ser un número positivo.")
    private int estatus;

    public DetalleEvento() {
    }

    // Getters y Setters
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
}
