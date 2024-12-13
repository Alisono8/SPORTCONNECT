package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.DetalleEvento;

@Service
public class DetallesService implements IDetalleEvento {

	@Autowired
	IDetalleEvento dao;

	@Override
	public List<DetalleEvento> agregarDetalleEventos(DetalleEvento entrenador) {
		return dao.agregarDetalleEventos(entrenador);
	}

	@Override
	public DetalleEvento actualizarDetalleEventos(DetalleEvento detalleEvento) {
		return dao.actualizarDetalleEventos(detalleEvento);
	}

	@Override
	public List<DetalleEvento> buscarDetalleEventos() {
		return dao.buscarDetalleEventos();
	}

	@Override
	public boolean bajaDetalleEventos(int id) {
		return dao.bajaDetalleEventos(id);
	}

	@Override
	public DetalleEvento buscarIdDDetalleEventos(int id) {
		return dao.buscarIdDDetalleEventos(id);
	}
	
	

}
