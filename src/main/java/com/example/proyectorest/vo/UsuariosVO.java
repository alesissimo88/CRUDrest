package com.example.proyectorest.vo;

import java.sql.Date;


public class UsuariosVO {

	private long id;
	private String nombre;
	private String apellidos;
	private String email;
	private Date fechaNacimiento;
	private int edad;
	
	
	public Long getId() {
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
