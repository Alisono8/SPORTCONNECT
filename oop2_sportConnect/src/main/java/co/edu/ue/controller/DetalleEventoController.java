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

import co.edu.ue.model.DetalleEvento;

import co.edu.ue.service.IDetalleEvento;

@RestController
@RequestMapping(value="DetalleEvento")
@Validated
public class DetalleEventoController {

	@Autowired
	IDetalleEvento service;

	@GetMapping(value="obtenerDetalleEvento")//endPoint
	public List<DetalleEvento> getAllDetalleEvento() {
		return service.buscarDetalleEventos();
	}
	
	@GetMapping(value="obtenerIdDetalleEvento")//endPoint
	public DetalleEvento getDetalleEventoId(@PathVariable("id") int id) {
		return service.buscarIdDDetalleEventos(id);
	}
	@PostMapping(value="crearDetalleEvento")//endPoint
	public List<DetalleEvento> postDetalleEvento(@Validated @RequestBody DetalleEvento detalleEvento) {
		return service.agregarDetalleEventos(detalleEvento);
	}
	
	@PutMapping(value="actualizarDetalleEvento")//endPoint
	public DetalleEvento putDetalleEvento(@Validated @RequestBody DetalleEvento detalleEvento) {
		
		return service.actualizarDetalleEventos(detalleEvento);
				
		}
	@PutMapping(value = "deleteDetalleEvento/{id}")
	public boolean deleteDetalleEvento(@PathVariable("id") int id) {
		return service.bajaDetalleEventos(id);
	}
}
