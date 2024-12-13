package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;


import co.edu.ue.model.DetalleEvento;


@Repository
public interface IDetalleEventos {
	List<DetalleEvento> addDetalleEvento(DetalleEvento detalleEvento);
	DetalleEvento updateDetalleEvento(DetalleEvento detalleEvento);
	 List<DetalleEvento> getAllDetalleEvento();
	
	 DetalleEvento getIDDetalleEvento(int id);
}
