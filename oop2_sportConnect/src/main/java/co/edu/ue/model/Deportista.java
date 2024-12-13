package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

/**
 * The persistent class for the Deportista database table.
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
    @Positive(message = "El ID del deportista debe ser un número positivo.")
    private int idDeportista;

    @Column(name = "documento")
    @NotNull(message = "El documento no puede ser nulo.")
    @Size(min = 6, max = 15, message = "El documento debe tener entre 6 y 15 caracteres.")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "El documento solo puede contener letras y números.")
    private String documento;

    @Column(name = "nombres")
    @NotNull(message = "Los nombres no pueden ser nulos.")
    @Size(min = 3, max = 50, message = "Los nombres deben tener entre 3 y 50 caracteres.")
    @Pattern(regexp = "^[A-Za-záéíóúÁÉÍÓÚñÑ\\s]+$", message = "Los nombres solo pueden contener letras y espacios.")
    private String nombres;

    @Column(name = "apellidos")
    @NotNull(message = "Los apellidos no pueden ser nulos.")
    @Size(min = 3, max = 50, message = "Los apellidos deben tener entre 3 y 50 caracteres.")
    @Pattern(regexp = "^[A-Za-záéíóúÁÉÍÓÚñÑ\\s]+$", message = "Los apellidos solo pueden contener letras y espacios.")
    private String apellidos;

    @Column(name = "estatus")
    @NotNull(message = "El estatus no puede ser nulo.")
    @Size(max = 20, message = "El estatus no puede exceder los 20 caracteres.")
    @Pattern(regexp = "^[A-Za-z]+$", message = "El estatus solo puede contener letras.")
    private String estatus;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Deportista() {
    }

    public int getIdDeportista() {
        return this.idDeportista;
    }

    public void setIdDeportista(int idDeportista) {
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
