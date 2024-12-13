package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Eventos;


public interface IEventosService {

	
	List<Eventos> agregarEventos(Eventos eventos);
	
	Eventos actualizarEventos(Eventos eventos);
	
	List<Eventos> buscarEventos();
	
	boolean bajaEventos(int id);
	
	Eventos buscarIdDEventos(int id);
	
	
}
