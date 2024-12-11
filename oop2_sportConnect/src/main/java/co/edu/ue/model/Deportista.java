package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The persistent class for the deportista database table.
 * 
 */
@Entity
@Table(name = "deportista")
@NamedQuery(name = "Deportista.findAll", query = "SELECT d FROM Deportista d")
public class Deportista implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_deportista")
    private Long idDeportista;

    @Column(name = "documento")
    private String documento;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "estatus")
    private String estatus;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Deportista() {
    }

    public Long getIdDeportista() {
        return this.idDeportista;
    }

    public void setIdDeportista(Long idDeportista) {
        this.idDeportista = idDeportista;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
