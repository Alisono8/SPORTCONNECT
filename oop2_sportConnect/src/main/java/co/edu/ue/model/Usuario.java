package co.edu.ue.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * The persistent class for the usuario database table.
 */
@Entity
@Table(name = "usuarios")
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarios")
    private int idUsuarios;

    @Column(name = "correo")
    @NotNull(message = "El correo no puede ser nulo.")
    @Email(message = "El correo debe ser válido.")
    private String correo;

    @Column(name = "password")
    @NotNull(message = "La contraseña no puede ser nula.")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "La contraseña debe contener al menos una letra y un número.")
    private String password;

    @Column(name = "estatus")
    @NotNull(message = "El estatus no puede ser nulo.")
    @Size(max = 20, message = "El estatus no puede exceder los 20 caracteres.")
    @Pattern(regexp = "^[A-Za-z]+$", message = "El estatus solo puede contener letras.")
    private String estatus;

    public Usuario() {
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
