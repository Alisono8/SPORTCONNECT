package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Categoria;

public interface ICategoriaService {
	
	List<Categoria> agregarCategoria(Categoria categoria);
	Categoria actualizarCategoria(Categoria categoria);
	List<Categoria> buscarCategorias();
	boolean bajaCategoria(int id);
	Categoria buscarIdDCategoria(int id);

	
}
