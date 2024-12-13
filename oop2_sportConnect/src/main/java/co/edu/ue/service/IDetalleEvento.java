package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.DetalleEvento;

public interface IDetalleEvento {

	
	List<DetalleEvento> agregarDetalleEvento(DetalleEvento entrenador);
	
	DetalleEvento actualizarEntrenador(DetalleEvento entrenador);
	
	List<DetalleEvento> buscarDetalleEvento();
	
	boolean bajaDetalleEvento(int id);
	
	DetalleEvento buscarIdDDetalleEvento(int id);
	

}
