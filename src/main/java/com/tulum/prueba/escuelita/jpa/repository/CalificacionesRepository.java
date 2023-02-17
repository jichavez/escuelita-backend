package com.tulum.prueba.escuelita.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tulum.prueba.escuelita.jpa.entity.Calificaciones;

public interface CalificacionesRepository extends JpaRepository<Calificaciones, Integer> {
	
	public List<Calificaciones> findByIdAlumno(Integer idAlumno);
}
