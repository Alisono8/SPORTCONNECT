package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Entrenador;


public interface IEntrenadorService {

	List<Entrenador> agregarEntrenador(Entrenador entrenador);
	
	Entrenador actualizarEntrenador(Entrenador entrenador);
	
	List<Entrenador> buscarEntrenador();
	
	boolean bajaEntrenador(int id);
	
	Entrenador buscarIdDEntrenador(int id);
	
}
