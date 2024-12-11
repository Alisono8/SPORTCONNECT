package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The persistent class for the categoria database table.
 */
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoríadedeportista")
    private int idCategoria;

    @Column(name = "desc_categoria")
    private String descripcionCategoria;
    
    @Column(name = "estatus")
    private String estatus;
  
    
    public Categoria() {
    }

    // Getters y Setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }
    
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
