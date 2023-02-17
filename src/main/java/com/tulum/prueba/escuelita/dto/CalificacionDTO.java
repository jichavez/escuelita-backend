package com.tulum.prueba.escuelita.dto;

import java.io.Serializable;
import java.util.Date;

public class CalificacionDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id_t_usuario;
	private String apellido;
	private String nombre;
	private String materia;
	private Double calificacion;
	private Date fecha_registro;
	public Integer getId_t_usuario() {
		return id_t_usuario;
	}
	public void setId_t_usuario(Integer id_t_usuario) {
		this.id_t_usuario = id_t_usuario;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public Double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	
	
}
