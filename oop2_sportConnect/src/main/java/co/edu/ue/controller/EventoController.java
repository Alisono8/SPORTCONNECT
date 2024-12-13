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

import co.edu.ue.model.Eventos;

import co.edu.ue.service.IEventosService;

@RestController
@RequestMapping(value="Evento")
@Validated
public class EventoController {

	@Autowired
	IEventosService service;

	@GetMapping(value="obtenerEvento")//endPoint
	public List<Eventos> getAllEvento() {
		return service.buscarEventos();
	}
	
	@GetMapping(value="obtenerIdEvento")//endPoint
	public Eventos getEventoId(@PathVariable("id") int id) {
		return service.buscarIdDEventos(id);
	}
	@PostMapping(value="crearEventos")//endPoint
	public List<Eventos> postEvento(@Validated @RequestBody Eventos evento) {
		return service.agregarEventos(evento);
	}
	
	@PutMapping(value="actualizarEvento")//endPoint
	public Eventos putEvento(@Validated @RequestBody Eventos evento) {
		return service.actualizarEventos(evento);
	}

	@PutMapping(value = "deleteEvento/{id}")
	public boolean deleteEvento(@PathVariable("id") int id) {
		return service.bajaEventos(id);
	}
}
