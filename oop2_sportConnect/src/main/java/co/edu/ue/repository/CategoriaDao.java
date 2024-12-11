package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.Categoria;

public class CategoriaDao implements ICategoria {

	@Autowired
	ICategoriaJpa jpa;

	@Override
	public List<Categoria> addCategoria(Categoria categoria) {
		jpa.save(categoria);
		return getAllCategorias();
	}

	@Override
	public Categoria updateCategoria(Categoria categoria) {
		return jpa.save(categoria);
	}

	@Override
	public List<Categoria> getAllCategorias() {	
		return jpa.findAll();
	}
	
	@Override
	public boolean deleteCategoria(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
