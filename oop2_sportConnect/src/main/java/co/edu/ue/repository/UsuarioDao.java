package co.edu.ue.repository;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import co.edu.ue.model.Usuario;

public class UsuarioDao implements IUsuario{
	@Autowired
	IUsuarioJpa jpa;

	@Override
	public List<Usuario> addUsuario(Usuario usuario) {
		jpa.save(usuario);
		return getAllUsuario();
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		
		return jpa.save(usuario);
	}

	@Override
	public List<Usuario> getAllUsuario() {
	
		return jpa.findAll();
	}

	@Override
	public boolean deleteUsuario(int id) {
		Usuario usuario = jpa.findById(id).orElse(null);
		if (usuario != null) {
			usuario.setEstatus("elimidado");
			 return true;
		}
		return false;
	}

	@Override
	public Usuario getIDUsuario(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}
	
}

