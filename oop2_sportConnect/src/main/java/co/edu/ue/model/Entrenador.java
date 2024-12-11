package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;

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
    private Long idEntrenador;

    @Column(name = "nombre_entrenador")
    private String nombreEntrenador;

    @Column(name = "estatus")
    private String estatus;

    public Entrenador() {
    }

    public Long getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(Long idEntrenador) {
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

