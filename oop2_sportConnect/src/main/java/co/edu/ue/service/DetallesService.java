package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.DetalleEvento;

@Service
public class DetallesService implements IDetalleEventoService {

	@Autowired
	IDetalleEvento dao;

	@Override
	public List<DetalleEvento> DetalleEvento(DetalleEvento entrenador) {
		return dao.agregarDetalleEventos(entrenador);
	}

	@Override
	public DetalleEvento actualizarDetalleEvento(DetalleEvento detalleEvento) {
		return dao.actualizarDetalleEventos(detalleEvento);
	}

	@Override
	public List<DetalleEvento> buscarEvento() {
		return dao.buscarDetalleEventos();
	}

	@Override
	public boolean bajaDetalleEvento(int id) {
		return dao.bajaDetalleEventos(id);
	}

	@Override
	public DetalleEvento buscarIdDDetalleEvento(int id) {
		return dao.buscarIdDDetalleEventos(id);
	}
	
	

}
