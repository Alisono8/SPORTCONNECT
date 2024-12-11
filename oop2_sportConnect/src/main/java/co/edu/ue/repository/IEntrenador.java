package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.Entrenador;

@Repository
public interface IEntrenador {
	List<Entrenador> addEntrenador(Entrenador entrenador);
	Entrenador updateEntrenador(Entrenador entrenador);
	 List<Entrenador> getAllEntrenador();
	 boolean deleteEntrenador(int id);
}
