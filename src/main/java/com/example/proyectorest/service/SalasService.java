package com.example.proyectorest.service;

import java.util.List;

import com.example.proyectorest.model.Salas;

public interface SalasService {
	
	public List<Salas> findAll();

	public Salas findById (Long id);

	public Salas add (Salas sala);

	public Salas update (Salas sala);

	public void remove (Long id);

}
