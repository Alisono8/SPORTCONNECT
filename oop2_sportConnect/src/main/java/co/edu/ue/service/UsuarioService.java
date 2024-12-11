package co.edu.ue.service;

import co.edu.ue.model.Usuario;

import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> findById(Long id);
    Usuario save(Usuario usuario);
    void deleteById(Long id);
    Iterable<Usuario> findAll();
}
