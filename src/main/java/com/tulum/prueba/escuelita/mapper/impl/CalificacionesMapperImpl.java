package com.tulum.prueba.escuelita.mapper.impl;

import com.tulum.prueba.escuelita.dto.CalificacionDTO;
import com.tulum.prueba.escuelita.jpa.entity.Alumnos;
import com.tulum.prueba.escuelita.jpa.entity.Calificaciones;
import com.tulum.prueba.escuelita.jpa.entity.Materias;
import com.tulum.prueba.escuelita.mapper.ICalificacionesMapper;

public class CalificacionesMapperImpl implements ICalificacionesMapper {

	@Override
	public CalificacionDTO entityToDTO(Calificaciones source) {
		// TODO Auto-generated method stub
		CalificacionDTO destination = new CalificacionDTO();
		
		Alumnos califAlumno = source.getIdAlumno();
		destination.setId_t_usuario(califAlumno.getIdUsuario());
		destination.setNombre(califAlumno.getNombre());
		destination.setApellido(califAlumno.getApPaterno());
		
		Materias califMateria = source.getIdMateria();
		destination.setMateria(califMateria.getNombre());
		
		destination.setCalificacion(source.getCalificacion());
		destination.setFecha_registro(source.getFechaRegistro());
		
		return destination;
	}

}
