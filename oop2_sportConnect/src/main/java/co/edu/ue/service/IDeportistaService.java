package co.edu.ue.service;

import java.util.List;


import co.edu.ue.model.Deportista;

public interface IDeportistaService {

	List<Deportista> agregarDeportista(Deportista deportista);
	Deportista actualizarDeportista(Deportista deportista);
	List<Deportista> buscarDeportista();
	boolean bajaDeportista(int id);
	Deportista buscarIdDDeportista(int id);

}
