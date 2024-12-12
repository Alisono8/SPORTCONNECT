package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;


import co.edu.ue.model.Eventos;  

@Repository
public interface IEvento {
    List<Eventos> addEvento(Eventos evento);  
    Eventos updateEvento(Eventos evento);  
    boolean deleteEvento(int id); 
    Eventos getIDEventos(int id);
    List<Eventos> getAllEventos(); 
}
