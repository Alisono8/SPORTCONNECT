package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The persistent class for the eventos database table.
 * 
 */
@Entity
@Table(name = "eventos")  
public class Eventos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private int idEvento;

    @Column(name = "nombre_evento")
    private String nombreEvento;

    @Column(name = "estatus")
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
