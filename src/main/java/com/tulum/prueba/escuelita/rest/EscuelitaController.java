package com.tulum.prueba.escuelita.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tulum.prueba.escuelita.dto.CalificacionDTO;
import com.tulum.prueba.escuelita.dto.ResultDTO;
import com.tulum.prueba.escuelita.jpa.entity.Calificaciones;
import com.tulum.prueba.escuelita.jpa.repository.CalificacionesRepository;
import com.tulum.prueba.escuelita.mapper.ICalificacionesMapper;

@Controller
public class EscuelitaController {
	@Autowired
	private CalificacionesRepository repository;
	
	@Autowired
	private ICalificacionesMapper mapper;
	
	@PostMapping("/calificacion")
	ResultDTO newCalificacion(@RequestBody Calificaciones newCalificacion) {
		ResultDTO result = new ResultDTO();
		Calificaciones newData = repository.save(newCalificacion);
		
		if(newData != null) {
			result.setMsg("calificacion registrada");
			result.setSuccess("OK");
		} else {
			result.setMsg("calificacion no registrada");
			result.setSuccess("failed");
		}
		
		return result;
	}
	
	@GetMapping("/calificacion/{id}")
	public List<CalificacionDTO> getCalificacion(@PathVariable Integer id) {
		List<Calificaciones> list = repository.findByIdAlumno(id);
		List<CalificacionDTO> result = new ArrayList<>();
		
		for(Calificaciones element: list) {
			result.add(mapper.entityToDTO(element));
		}
		return result;
	}
	
	@PutMapping("/calificacion/{id}")
	public ResultDTO updateCalificacion(@RequestBody Calificaciones newCalificacion, @PathVariable Integer id) {
		ResultDTO result = new ResultDTO();
		Calificaciones update = repository.findById(id).map(data -> {
			data.setCalificacion(newCalificacion.getCalificacion());
			data.setFechaRegistro(new Date());
			return repository.save(data);
		}).orElseGet(() -> {
			newCalificacion.setIdCalificacion(id);
			return repository.save(newCalificacion);
		});
		
		if(update != null) {
			result.setMsg("calificacion actualizada");
			result.setSuccess("OK");
		} else {
			result.setMsg("calificacion no actualizada");
			result.setSuccess("failed");
		}
		
		return result;
	}
	
	@DeleteMapping("/calificacion/{id}")
	public ResultDTO greeting(@PathVariable Integer id) {
		ResultDTO result = repository.findById(id).map(data -> {
			repository.delete(data);
			return new ResultDTO("OK", "Calificacion eliminada");
		}).orElseGet(() -> {
			return new ResultDTO("failed", "Calificacion no eliminada");
		});
		
		return result;
	}

}
