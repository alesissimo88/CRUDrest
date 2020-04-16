package com.example.proyectorest.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "usuarios")
@Entity(name = "Usuarios")

public class Usuarios {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="email")
	private String email;
	
	@Column(name="fechaNacimiento")
	private Date fechaNacimiento;
	
	@Column(name="edad")
	private int edad;
	
	
	// Métodos get y set de la clase Usuarios
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
	    return nombre;
	}
	
	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}
	
	public String getApellidos() {
	    return apellidos;
	}
	
	public void setApellidos(String apellidos) {
	    this.apellidos = apellidos;
	}
	
	public String getEmail() {
	    return email;
	}
	  
	public void setEmail(String email) {
	    this.email = email;
	}
	
	public Date getfechaNacimiento() {
	    return fechaNacimiento;
	}
	  
	public void setfechaNacimiento(Date fechaNacimiento) {
	    this.fechaNacimiento = fechaNacimiento;
	}
	
	public int getEdad() {
	    return edad;
	}
	  
	public void setEdad(int edad) {
	    this.edad = edad;
	}
	
	
	

}
