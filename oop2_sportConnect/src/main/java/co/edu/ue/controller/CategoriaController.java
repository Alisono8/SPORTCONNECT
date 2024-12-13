package co.edu.ue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.ue.model.Categoria;

import co.edu.ue.service.ICategoriaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="Categoria")
@Validated
public class CategoriaController {

	@Autowired
	ICategoriaService service;
	
	@GetMapping(value="obtenerCategoria")//endPoint
	public List<Categoria> getAllCategoria() {
		return service.buscarCategorias();
	}
	
	@GetMapping(value="obtenerIdCategoria")//endPoint
	public Categoria getCategoriaId(@PathVariable("id") int id) {
		return service.buscarIdDCategoria(id);
	}
	@PostMapping(value="crearCategoria")//endPoint
	public List<Categoria> postDeportista(@Validated @RequestBody Categoria categoria) {
		return service.agregarCategoria(categoria);
	}
	
	@PutMapping(value="actualizarCategoria")//endPoint
	public Categoria putCategoria(@Validated @RequestBody Categoria categoria) {
		return service.actualizarCategoria(categoria);
	}

	@PutMapping(value = "deleteUsuario/{id}")
	public boolean deleteDeportista(@PathVariable("id") int id) {
		return service.bajaCategoria(id);
	}
}
