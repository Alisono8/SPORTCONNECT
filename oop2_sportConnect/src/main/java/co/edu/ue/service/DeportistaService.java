package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Deportista;

import co.edu.ue.repository.IDeportista;
@Service
public class DeportistaService implements IDeportistaService {

	@Autowired
	IDeportista dao;


	@Override
	public List<Deportista> agregarDeportista(Deportista deportista) {
		return dao.addDeportista(deportista);
	}

	@Override
	public Deportista actualizarDeportista(Deportista deportista) {
		return dao.updateDeportista(deportista);
	}

	@Override
	public List<Deportista> buscarDeportista() {
		return dao.getAllDeportistas();
	}

	@Override
	public boolean bajaDeportista(int id) {
		return dao.deleteDeportista(id);
	}

	@Override
	public Deportista buscarIdDDeportista(int id) {
		return dao.getIDDeportistas(id);
	}
	
		
}
