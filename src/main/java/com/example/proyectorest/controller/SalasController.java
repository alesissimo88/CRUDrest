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

import com.example.proyectorest.model.Salas;
import com.example.proyectorest.service.SalasService;

@RestController
@RequestMapping ("/salas")
public class SalasController {
	
	@Autowired
	@Qualifier("SalasServiceBdd")
	private SalasService salasservice;

	@GetMapping
	public List<Salas> findAll() {
		return salasservice.findAll();
	}

	@GetMapping("/{id}")
	public Salas findById(@PathVariable Long id) {
		return salasservice.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Salas add(@RequestBody Salas sala) {
		return salasservice.add(sala);
	}

	@PutMapping
	public Salas update(@RequestBody Salas sala) {
		return salasservice.update(sala);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(@PathVariable Long id) {
		salasservice.remove(id);
	}

}
