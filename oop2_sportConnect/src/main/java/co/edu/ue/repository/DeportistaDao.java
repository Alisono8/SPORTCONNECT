package co.edu.ue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import co.edu.ue.model.Deportista;

public class DeportistaDao implements IDeportista {
	
	@Autowired
	IDeportistaJpa jpa;

	@Override
	public List<Deportista> addDeportista(Deportista deportista) {
	jpa.save(deportista);
	return getAllDeportistas();
	}

	@Override
	public Deportista updateDeportista(Deportista deportista) {
	
		return jpa.save(deportista);
	}

	@Override
	public List<Deportista> getAllDeportistas() {
	
		return jpa.findAll();
	}


	@Override
	public boolean deleteDeportista(int id) {
		
		Deportista deportista = jpa.findById(id).orElse(null);
		    if (deportista != null) {
		    	deportista.setEstatus("eliminado"); 
		        jpa.save(deportista);   
		        return true;
		    }
		    return false; 
	}

	@Override
	public Deportista getIDDeportistas(int id) {
		
		return  jpa.findById(id).orElse(null);
	}

}
