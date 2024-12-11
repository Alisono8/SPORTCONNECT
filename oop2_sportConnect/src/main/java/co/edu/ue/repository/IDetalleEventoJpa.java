package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.DetalleEvento;

public interface IDetalleEventoJpa extends JpaRepository<DetalleEvento, Integer>{

}
