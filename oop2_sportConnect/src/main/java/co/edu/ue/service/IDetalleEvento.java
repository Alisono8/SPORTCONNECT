package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.DetalleEvento;





public interface IDetalleEvento {

	
	List<DetalleEvento> agregarDetalleEventos(DetalleEvento entrenador);
	
	DetalleEvento actualizarDetalleEventos(DetalleEvento entrenador);
	
	List<DetalleEvento> buscarDetalleEventos();
	
	boolean bajaDetalleEventos(int id);
	
	DetalleEvento buscarIdDDetalleEventos(int id);
	

}
