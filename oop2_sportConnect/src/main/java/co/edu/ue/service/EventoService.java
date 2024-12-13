package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.model.Eventos;
import co.edu.ue.repository.IEvento;
@Service
public class EventoService implements IEventoService {

	@Autowired
	IEvento dao;
	@Override
	public List<Eventos> agregarEvento(Eventos evento) {
		// TODO Auto-generated method stub
		return dao.addEvento(evento);
	}

	@Override
	public Eventos actualizarEvento(Eventos evento) {
		// TODO Auto-generated method stub
		return dao.updateEvento(evento);
	}

	@Override
	public List<Eventos> buscarEventos() {
		// TODO Auto-generated method stub
		return dao.getAllEventos();
	}

	@Override
	public boolean bajaEvento(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEvento(id);
	}

	@Override
	public Eventos buscarIdEvento(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
