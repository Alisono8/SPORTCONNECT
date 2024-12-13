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
	public List<DetalleEvento> agregarDetalleEvento(DetalleEvento entrenador) {
		return dao.agregarDetalleEvento(entrenador);
	}

	@Override
	public DetalleEvento actualizarDetalleEvento(DetalleEvento detalleEvento) {
		return dao.actualizarDetalleEvento(detalleEvento);
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
