package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.model.Deportista;
import co.edu.ue.service.IDeportistaService;

@RestController
@RequestMapping(value="Deportista")
@Validated
public class DeportistaController {


	@Autowired
	IDeportistaService service;

	@GetMapping(value="obtenerDeportista")//endPoint
	public List<Deportista> getAllDeportista() {
		return service.buscarDeportista();
	}
	
	@GetMapping(value="obtenerIdUsuario")//endPoint
	public Deportista getUserId(@PathVariable("id") int id) {
		return service.buscarIdDDeportista(id);
	}
	
	@PostMapping(value="obtenerUsuarios")//endPoint
	public List<Deportista> postDeportista(@Validated @RequestBody Deportista deportista) {
		return service.agregarDeportista(deportista);
	}
	
	@PutMapping(value="obtenerUsuarios")//endPoint
	public Deportista putDeportista(@Validated @RequestBody Deportista deportista) {
		return service.actualizarDeportista(null);
	}

	@PutMapping(value = "deleteUsuario/{id}")
	public boolean deleteDeportista(@PathVariable("id") int id) {
		return service.bajaDeportista(id);
	}
}
