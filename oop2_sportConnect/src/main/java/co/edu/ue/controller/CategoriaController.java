package co.edu.ue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.ue.model.Categoria;
import co.edu.ue.service.ICategoriaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "api")
public class CategoriaController {

	@Autowired
	ICategoriaService service;
	
	@GetMapping(value = "categoria")
	public List<Categoria> getAllCategoria() {
		return service.buscarCategorias(); 
	}
}
