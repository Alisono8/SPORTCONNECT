package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.model.Categoria;
@Repository
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
		 Categoria categoria = jpa.findById(id).orElse(null);
		    if (categoria != null) {
		        categoria.setEstatus("eliminado"); 
		        jpa.save(categoria);   
		        return true;
		    }
		    return false; 
	}

	@Override
	public Categoria getIDCategoria(int id) {
		
		return jpa.findById(id).orElse(null);
	}
}
