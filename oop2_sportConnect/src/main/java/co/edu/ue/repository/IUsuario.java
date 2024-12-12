package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;


import co.edu.ue.model.Usuario;

@Repository
public interface IUsuario {
	List<Usuario> addUsuario(Usuario usuario);
	Usuario updateUsuario(Usuario usuario);
	 List<Usuario> getAllUsuario();
	 boolean deleteUsuario(int id);
	 Usuario getIDUsuario(int id);
}
