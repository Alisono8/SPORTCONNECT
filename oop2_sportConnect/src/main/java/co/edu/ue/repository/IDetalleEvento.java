package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.DetalleEvento;


@Repository
public interface IDetalleEvento {
	List<DetalleEvento> addDetalleEvento(DetalleEvento detalleEvento);
	DetalleEvento updateDetalleEvento(DetalleEvento detalleEvento);
	 List<DetalleEvento> getAllDetalleEvento();
	 boolean deleteDetalleEvento(int id);
}
