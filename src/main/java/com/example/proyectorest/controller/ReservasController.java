package com.example.proyectorest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectorest.model.Reservas;
import com.example.proyectorest.service.ReservasService;


@RestController
@RequestMapping ("/reservas")
public class ReservasController {

	@Autowired
	@Qualifier("ReservasServiceBdd")
	private ReservasService reservasservice;

	@GetMapping
	public List<Reservas> findAll() {
		return reservasservice.findAll();
	}

	@GetMapping("/{id}")
	public Reservas findById(@PathVariable Long id) {
		return reservasservice.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Reservas add(@RequestBody Reservas reserva) {
		return reservasservice.add(reserva);
	}

	@PutMapping
	public Reservas update(@RequestBody Reservas reserva) {
		return reservasservice.update(reserva);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(@PathVariable Long id) {
		reservasservice.remove(id);
	}
	
}
