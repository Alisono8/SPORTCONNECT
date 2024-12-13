package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import co.edu.ue.model.Usuario;
import co.edu.ue.service.IUsuarioService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(value="Usuario")
@Validated
public class UsuarioController  {
	
	@Autowired
	IUsuarioService service;

	@GetMapping(value="obtenerUsuarios")//endPoint
	public List<Usuario> getAllUsuario() {
		return service.buscarUsuarios();
	}
	
	@GetMapping(value="obtenerIdUsuario")//endPoint
	public Usuario getUserId(@PathVariable("id") int id) {
		return service.buscarIdUsuario(id);
	}
	@PostMapping(value="creaUsuario")//endPoint
	public List<Usuario> postUsuario(@Validated @RequestBody Usuario usuario) {
		return service.agregarUsuario(usuario);
	}
	
	@PutMapping(value="acutualizaUsuarios")//endPoint
	public Usuario putUsuario(@Validated @RequestBody Usuario usuario) {
		return service.actualizarUsuario(null);
	}

	@PutMapping(value = "deleteUsuario/{id}")
	public boolean deleteUsuario(@PathVariable("id") int id) {
		return service.bajaUsuario(id);
	}
}
