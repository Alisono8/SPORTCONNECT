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

import co.edu.ue.model.Entrenador;

import co.edu.ue.service.IEntrenadorService;

@RestController
@RequestMapping(value="Entrenador")
@Validated
public class EntrenadorController {

	@Autowired
	IEntrenadorService service;

	@GetMapping(value="obtenerEntrenador")//endPoint
	public List<Entrenador> getAllEntrenador() {
		return service.buscarEntrenador();
	}
	
	@GetMapping(value="obtenerIdEntrenador")//endPoint
	public Entrenador getEntrenadorId(@PathVariable("id") int id) {
		return service.buscarIdDEntrenador(id);
	}
	@PostMapping(value="crearEntrenador")//endPoint
	public List<Entrenador> postEntrenador(@Validated @RequestBody Entrenador entrenador) {
		return service.agregarEntrenador(entrenador);
	}
	
	@PutMapping(value="actualizarEntrenador")//endPoint
	public Entrenador putEntrenador(@Validated @RequestBody Entrenador entrenador) {
		
		return service.actualizarEntrenador(entrenador);
				
		}
	@PutMapping(value = "deleteEntrenador/{id}")
	public boolean deleteEntrenador(@PathVariable("id") int id) {
		return service.bajaEntrenador(id);
	}
}
