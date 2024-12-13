package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.Eventos;
import co.edu.ue.repository.IEvento;

public class EventoService implements IEventosService{
	
	@Autowired
	IEvento dao;

	@Override
	public List<Eventos> agregarEventos(Eventos eventos) {
		return dao.addEvento(eventos);
	}

	@Override
	public Eventos actualizarEventos(Eventos eventos) {
		// TODO Auto-generated method stub
		return dao.updateEvento(eventos);
	}

	@Override
	public List<Eventos> buscarEventos() {
		// TODO Auto-generated method stub
		return dao.getAllEventos();
	}

	@Override
	public boolean bajaEventos(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEvento(id);
	}

	@Override
	public Eventos buscarIdDEventos(int id) {
		// TODO Auto-generated method stub
		return dao.getIDEventos(id);
	}

}
