package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.model.Eventos;  // La clase de entidad es Eventos

@Repository
public class EventoDao implements IEvento {
    
    @Autowired
    IEventoJpa jpa;
    
    @Override
    public List<Eventos> addEvento(Eventos evento) {  // Cambiado Evento a Eventos
        jpa.save(evento); 
        
        return getAllEvento();  
    }

    @Override
    public Eventos updateEvento(Eventos evento) { 
        return jpa.save(evento);  
    }

    @Override
    public List<Eventos> getAllEvento() {  
        return jpa.findAll();  
    }

    @Override
    public boolean deleteEvento(Long id) {  
        if (jpa.existsById(id)) {  
            jpa.deleteById(id);  
            return true;  
        }
        return false;  
    }
}
