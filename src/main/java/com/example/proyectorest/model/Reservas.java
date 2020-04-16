package com.example.proyectorest.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Reserva")
@Entity(name = "Reserva")

public class Reservas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Integer usuario;
	private Integer sala;
	private Date fecha;
	private String motivo;
	private String aceptada;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}
	
	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	public String getAceptada() {
		return aceptada;
	}

	public void setAceptada(String aceptada) {
		this.aceptada = aceptada;
	}
	

}
