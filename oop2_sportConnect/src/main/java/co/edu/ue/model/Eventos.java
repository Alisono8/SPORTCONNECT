package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

/**
 * The persistent class for the eventos database table.
 */
@Entity
@Table(name = "eventos")
public class Eventos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    @Positive(message = "El ID del evento debe ser un número positivo.")
    private int idEvento;

    @Column(name = "nombre_evento")
    @NotNull(message = "El nombre del evento no puede ser nulo.")
    @Size(min = 3, max = 50, message = "El nombre del evento debe tener entre 3 y 50 caracteres.")
    @Pattern(regexp = "^[A-Za-záéíóúÁÉÍÓÚñÑ\\s]+$", message = "El nombre del evento solo puede contener letras y espacios.")
    private String nombreEvento;

    @Column(name = "estatus")
    @NotNull(message = "El estatus no puede ser nulo.")
    @Size(max = 20, message = "El estatus no puede exceder los 20 caracteres.")
    @Pattern(regexp = "^[A-Za-z]+$", message = "El estatus solo puede contener letras.")
    private String estatus;

    public Eventos() {
    }

    public int getIdEvento() {
        return this.idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return this.nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
