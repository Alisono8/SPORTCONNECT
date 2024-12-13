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
	public List<co.edu.ue.model.DetalleEvento> DetalleEvento(co.edu.ue.model.DetalleEvento detalleEvento) {
		return null;
	}

	@Override
	public co.edu.ue.model.DetalleEvento actualizarDetalleEvento(co.edu.ue.model.DetalleEvento detalleEvento) {
		return null;
	}

	@Override
	public List<co.edu.ue.model.DetalleEvento> buscarEvento() {
		return null;
	}

	@Override
	public boolean bajaDetalleEvento(int id) {
		return false;
	}

	@Override
	public co.edu.ue.model.DetalleEvento buscarIdDDetalleEvento(int id) {
		return null;
	}
	
	

}
