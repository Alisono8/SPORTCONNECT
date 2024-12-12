package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.Categoria;


@Repository
public interface ICategoria {

	List<Categoria> addCategoria(Categoria categoria);
	Categoria updateCategoria(Categoria categoria);
	List<Categoria> getAllCategorias();
	boolean deleteCategoria(int id);
	Categoria getIDCategoria(int id);

	
}
