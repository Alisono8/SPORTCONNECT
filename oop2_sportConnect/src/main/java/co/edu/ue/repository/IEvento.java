package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.Eventos;  // Cambiado a la clase Eventos

@Repository
public interface IEvento {
    List<Eventos> addEvento(Eventos evento);  // Cambiado Evento a Eventos
    Eventos updateEvento(Eventos evento);  // Cambiado Evento a Eventos
    List<Eventos> getAllEvento();  // Cambiado Evento a Eventos
    boolean deleteEvento(Long id);  // Cambiado int a Long
}
