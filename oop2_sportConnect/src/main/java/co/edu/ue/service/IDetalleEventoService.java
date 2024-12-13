package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.DetalleEvento;

public interface IDetalleEventoService {


	List<DetalleEvento> DetalleEvento(DetalleEvento detalleEvento);
	
	DetalleEvento actualizarDetalleEvento(DetalleEvento detalleEvento);
	
	List<DetalleEvento> buscarEvento();
	
	boolean bajaDetalleEvento(int id);
	
	DetalleEvento buscarIdDDetalleEvento(int id);
	
	
}
