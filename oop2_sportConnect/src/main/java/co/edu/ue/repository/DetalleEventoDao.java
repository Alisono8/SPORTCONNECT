package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.DetalleEvento;

public class DetalleEventoDao implements IDetalleEvento{
	
	@Autowired
	IDetalleEventoJpa jpa;

	@Override
	public List<DetalleEvento> addDetalleEvento(DetalleEvento detalleEvento) {
		jpa.save(detalleEvento);
		return getAllDetalleEvento();
	}

	@Override
	public DetalleEvento updateDetalleEvento(DetalleEvento detalleEvento) {
	
		return jpa.save(detalleEvento);
	}

	@Override
	public List<DetalleEvento> getAllDetalleEvento() {
		
		return jpa.findAll();
	}

	@Override
	public boolean deleteDetalleEvento(int id) {
		// TODO Auto-generated method stub
		return false;
	} 

} 
