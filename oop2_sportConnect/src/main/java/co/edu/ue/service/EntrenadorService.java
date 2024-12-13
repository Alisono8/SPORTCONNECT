package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Entrenador;
import co.edu.ue.repository.IEntrenador;
@Service
public class EntrenadorService implements IEntrenadorService{

	@Autowired
	IEntrenador dao ;

	@Override
	public List<Entrenador> agregarEntrenador(Entrenador entrenador) {
		return dao.addEntrenador(entrenador);
	}

	@Override
	public Entrenador actualizarEntrenador(Entrenador entrenador) {
		return dao.updateEntrenador(entrenador);
	}

	@Override
	public List<Entrenador> buscarEntrenador() {
		return dao.getAllEntrenador();
	}

	@Override
	public boolean bajaEntrenador(int id) {
		return dao.deleteEntrenador(id);
	}

	@Override
	public Entrenador buscarIdDEntrenador(int id) {
		return dao.getIDEntrenador(id);
	} 
}
