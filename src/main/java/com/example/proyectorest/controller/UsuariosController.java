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

import com.example.proyectorest.model.Usuarios;
import com.example.proyectorest.service.UsuariosService;

@RestController
@RequestMapping ("/usuarios")

public class UsuariosController {
	
	@Autowired
	@Qualifier("UsuariosServiceBdd")
	private UsuariosService usuariosservice;

	@GetMapping
	public List<Usuarios> findAll() {
		return usuariosservice.findAll();
	}

	@GetMapping("/{id}")
	public Usuarios findById(@PathVariable long id) {
		return usuariosservice.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuarios add(@RequestBody Usuarios usuario) {
		return usuariosservice.add(usuario);
	}

	@PutMapping
	public Usuarios update(@RequestBody Usuarios usuario) {
		return usuariosservice.update(usuario);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(@PathVariable Long id) {
		usuariosservice.remove(id);
	}

}
