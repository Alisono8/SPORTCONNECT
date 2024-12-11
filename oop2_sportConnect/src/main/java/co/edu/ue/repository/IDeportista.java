package co.edu.ue.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.ue.model.Deportista;

@Repository
public interface IDeportista {
	
 List<Deportista> addDeportista(Deportista deportista);
 Deportista updateDeportista(Deportista deportista);
 List<Deportista> getAllDeportistas();
 boolean deleteDeportista(int id);
}
