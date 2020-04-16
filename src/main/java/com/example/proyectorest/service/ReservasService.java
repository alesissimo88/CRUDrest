package com.example.proyectorest.service;

import java.util.List;

import com.example.proyectorest.model.Reservas;


public interface ReservasService {
	
	public List<Reservas> findAll();

	public Reservas findById (Long id);

	public Reservas add (Reservas reserva);

	public Reservas update (Reservas reserva);

	public void remove (Long id);

}
