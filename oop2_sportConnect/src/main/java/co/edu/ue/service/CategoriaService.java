package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Categoria;
import co.edu.ue.repository.ICategoria;

@Service
public class CategoriaService implements ICategoriaService {
	
	@Autowired
	ICategoria dao;

	@Override
	public List<Categoria> agregarCategoria(Categoria categoria) {
		dao.addCategoria(categoria);
		return dao.getAllCategorias();  
	}

	@Override
	public Categoria actualizarCategoria(Categoria categoria) {
		return dao.updateCategoria(categoria);
	}

	@Override
	public List<Categoria> buscarCategorias() {
		return dao.getAllCategorias();
	}

	@Override
	public boolean bajaCategoria(int id) {
		return dao.deleteCategoria(id);
	}

	@Override
	public Categoria buscarIdDCategoria(int id) {
		return dao.getIDCategoria(id);
	}
}
