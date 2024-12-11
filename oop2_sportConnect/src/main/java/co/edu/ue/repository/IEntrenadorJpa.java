package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Entrenador;

public interface IEntrenadorJpa extends JpaRepository<Entrenador, Integer> {

}
