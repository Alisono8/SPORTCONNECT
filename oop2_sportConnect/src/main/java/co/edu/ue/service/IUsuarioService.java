package co.edu.ue.service;

import java.util.List;


import co.edu.ue.model.Usuario;

public interface IUsuarioService {

	List<Usuario> agregarUsuario(Usuario usuario);
	Usuario actualizarUsuario(Usuario usuario);
	List<Usuario> buscarUsuario();
	boolean bajaUsuario(int id);
	Usuario buscarIdDUsuario(int id);
}
