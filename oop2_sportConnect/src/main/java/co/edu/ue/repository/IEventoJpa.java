package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Eventos;  

public interface IEventoJpa extends JpaRepository<Eventos, Long> {  // Cambiado el ID a Long
}
