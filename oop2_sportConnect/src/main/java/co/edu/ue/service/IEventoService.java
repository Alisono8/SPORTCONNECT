package co.edu.ue.service;
import java.util.List;
import co.edu.ue.model.Eventos;

public interface IEventoService {
	List<Eventos> agregarEvento(Eventos evento);
	Eventos actualizarEvento(Eventos evento);
	List<Eventos> buscarEventos();
	boolean bajaEvento(int id);
	Eventos buscarIdEvento(int id);
}
