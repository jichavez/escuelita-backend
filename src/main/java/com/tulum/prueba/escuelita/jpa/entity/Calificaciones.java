package com.tulum.prueba.escuelita.jpa.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calificaciones {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idCalificacion;
	private Materias idMateria;
	private Alumnos idAlumno;
	private Double calificacion;
	private Date fechaRegistro;
	
	public Integer getIdCalificacion() {
		return idCalificacion;
	}
	public void setIdCalificacion(Integer idCalificacion) {
		this.idCalificacion = idCalificacion;
	}
	public Materias getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(Materias idMateria) {
		this.idMateria = idMateria;
	}
	public Alumnos getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Alumnos idAlumno) {
		this.idAlumno = idAlumno;
	}
	public Double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
}
