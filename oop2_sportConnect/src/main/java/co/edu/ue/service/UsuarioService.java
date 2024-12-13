package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.Usuario;
import co.edu.ue.repository.IUsuario;

public class UsuarioService implements IUsuarioService{

	@Autowired
	IUsuario dao ;

	@Override
	public List<Usuario> agregarUsuario(Usuario usuario) {
		return dao.addUsuario(usuario);
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return dao.updateUsuario(usuario);
	}

	@Override
	public List<Usuario> buscarUsuario() {
		return dao.getAllUsuario();
	}

	@Override
	public boolean bajaUsuario(int id) {
		return dao.deleteUsuario(id);
	}

	@Override
	public Usuario buscarIdDUsuario(int id) {
		return dao.getIDUsuario(id);
	} 
	
}
