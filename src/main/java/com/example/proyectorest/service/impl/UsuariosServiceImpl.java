package com.example.proyectorest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.proyectorest.model.Usuarios;
import com.example.proyectorest.service.UsuariosService;


@Service("UsuariosService")
public class UsuariosServiceImpl implements UsuariosService{

	
	public List<Usuarios> usuarios = new ArrayList<>();

	@Override
	public List<Usuarios> findAll() {
		return usuarios;
	}

	@Override
	public Usuarios findById(Long id) {
		Optional<Usuarios> usuario = usuarios.stream().filter(p -> p.getId() == id).findFirst();

		return usuario.isPresent() ? usuario.get() : null;
	}

	@Override
	public Usuarios add(Usuarios usuario) {
		usuarios.add(usuario);

		return usuario;
	}

	@Override
	public Usuarios update(Usuarios usuario) {
		AtomicInteger index = new AtomicInteger();
		usuarios.stream().forEach(p -> {
			if (p.getId() == usuario.getId()) {
				p.setNombre(usuario.getNombre());
				usuarios.set(index.get(), p);
			}
			index.getAndIncrement();
		});

		return usuario;
	}

	@Override
	public void remove(Long id) {
		Optional<Usuarios> usuario = usuarios.stream().filter(p -> p.getId() == id).findFirst();

		if (usuario.isPresent()) {
			usuarios.remove(usuario.get());
		}
	}
	
}
