package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.model.Entrenador;
@Repository
public class EntrenadorDao implements IEntrenador {

	@Autowired
	IEntrenadorJpa jpa;

	@Override
	public List<Entrenador> addEntrenador(Entrenador entrenador) {
		jpa.save(entrenador);
		
		return getAllEntrenador();
	}

	@Override
	public Entrenador updateEntrenador(Entrenador entrenador) {
	
		return jpa.save(entrenador);
	}

	@Override
	public List<Entrenador> getAllEntrenador() {
	
		return jpa.findAll();
	}

	@Override
	public boolean deleteEntrenador(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entrenador getIDEntrenador(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	}
	

}
