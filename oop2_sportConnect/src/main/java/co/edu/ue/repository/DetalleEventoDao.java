package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.model.DetalleEvento;
@Repository
public class DetalleEventoDao implements IDetalleEventos{
	
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
	public DetalleEvento getIDDetalleEvento(int id) {
		// TODO Auto-generated method stub
		return jpa.findById(id).orElse(null);
	} 

} 
