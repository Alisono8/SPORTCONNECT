package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Usuario;

public interface IUsuarioJpa extends JpaRepository<Usuario, Integer>  {

}
