package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import co.edu.ue.model.Eventos; 

@Repository
public class EventoDao implements IEvento {
    
    @Autowired
    IEventoJpa jpa;
    
 

    @Override
    public Eventos updateEvento(Eventos evento) { 
        return jpa.save(evento);  
    }


	@Override
	public boolean deleteEvento(int id) {
		Eventos evento = jpa.findById(id).orElse(null);
		    if (evento != null) {
		    	evento.setEstatus("eliminado"); 
		        jpa.save(evento);   
		        return true;
		    }
		    return false; 
	}

	@Override
	public Eventos getIDEventos(int id) {
		return jpa.findById(id).orElse(null);
	}


	@Override
	public List<Eventos> addEvento(Eventos evento) {
		jpa.save(evento);
		return getAllEventos() ;
	}


	@Override
	public List<Eventos> getAllEventos() {
		// TODO Auto-generated method stub
		return jpa.findAll();
	}

 
}
