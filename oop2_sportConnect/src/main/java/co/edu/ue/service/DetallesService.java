package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.DetalleEvento;


public class DetallesService implements IDetalleEvento {

	@Autowired
	IDetalleEvento dao;

	@Override
	public List<DetalleEvento> agregarDetalleEvento(DetalleEvento entrenador) {
		return dao.agregarDetalleEvento(entrenador);
	}

	@Override
	public DetalleEvento actualizarEntrenador(DetalleEvento entrenador) {
		return dao.actualizarEntrenador(entrenador);
	}

	@Override
	public List<DetalleEvento> buscarDetalleEvento() {
		return dao.buscarDetalleEvento();
	}

	@Override
	public boolean bajaDetalleEvento(int id) {
		return dao.bajaDetalleEvento(id);
	}

	@Override
	public DetalleEvento buscarIdDDetalleEvento(int id) {
		return dao.buscarIdDDetalleEvento(id);
	}
	
	

}
