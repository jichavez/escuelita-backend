package com.tulum.prueba.escuelita.mapper;

import org.mapstruct.Mapper;

import com.tulum.prueba.escuelita.dto.CalificacionDTO;
import com.tulum.prueba.escuelita.jpa.entity.Calificaciones;

@Mapper
public interface ICalificacionesMapper {
	CalificacionDTO entityToDTO(Calificaciones source);
}
