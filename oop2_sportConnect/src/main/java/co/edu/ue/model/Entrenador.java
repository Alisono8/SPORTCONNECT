package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

/**
 * The persistent class for the entrenador database table.
 */
@Entity
@Table(name = "entrenador")
@NamedQuery(name = "Entrenador.findAll", query = "SELECT e FROM Entrenador e")
public class Entrenador implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrenador")
    @Positive(message = "El ID del entrenador debe ser un número positivo.")
    private int idEntrenador;

    @Column(name = "nombre_entrenador")
    @NotNull(message = "El nombre del entrenador no puede ser nulo.")
    @Size(min = 3, max = 50, message = "El nombre del entrenador debe tener entre 3 y 50 caracteres.")
    @Pattern(regexp = "^[A-Za-záéíóúÁÉÍÓÚñÑ\\s]+$", message = "El nombre solo puede contener letras y espacios.")
    private String nombreEntrenador;

    @Column(name = "estatus")
    @NotNull(message = "El estatus no puede ser nulo.")
    @Size(max = 20, message = "El estatus no puede exceder los 20 caracteres.")
    @Pattern(regexp = "^[A-Za-z]+$", message = "El estatus solo puede contener letras.")
    private String estatus;

    public Entrenador() {
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
