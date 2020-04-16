package com.example.proyectorest.service;

import java.util.List;

import com.example.proyectorest.model.Usuarios;


public interface UsuariosService {
	
	public List<Usuarios> findAll();

	public Usuarios findById (Long id);

	public Usuarios add (Usuarios usuario);

	public Usuarios update (Usuarios usuario);

	public void remove (Long id);

}
