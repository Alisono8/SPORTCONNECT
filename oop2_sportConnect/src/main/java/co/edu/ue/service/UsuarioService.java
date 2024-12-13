package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Usuario;
import co.edu.ue.repository.IUsuario;
@Service
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
	public boolean bajaUsuario(int id) {
		return dao.deleteUsuario(id);
	}



	@Override
	public List<Usuario> buscarUsuarios() {
		// TODO Auto-generated method stub
		return dao.getAllUsuario();
	}

	@Override
	public Usuario buscarIdUsuario(int id) {
		// TODO Auto-generated method stub
		return dao.getIDUsuario(id);
	} 
	
}
