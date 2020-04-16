package com.example.proyectorest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectorest.model.Usuarios;
import com.example.proyectorest.repository.UsuariosRepository;
import com.example.proyectorest.service.UsuariosService;


@Service("UsuariosServiceBdd")
public class UsuariosServiceBddImpl implements UsuariosService {
	
	@Autowired
	private UsuariosRepository usuarioRepository;

	@Override
	public List<Usuarios> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuarios findById(Long id) {
		Optional<Usuarios> usuario = usuarioRepository.findById(id);
		return usuario.isPresent() ? usuario.get() : null;
	}

	@Override
	public Usuarios add(Usuarios usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuarios update(Usuarios usuario) {
		Optional<Usuarios> usuarioBdd = usuarioRepository.findById(usuario.getId());

		if (usuarioBdd.isPresent()) {
			
			usuarioBdd.get().setNombre(usuario.getNombre());
			usuarioBdd.get().setApellidos(usuario.getApellidos());
			usuarioBdd.get().setEmail(usuario.getEmail());
			usuarioBdd.get().setfechaNacimiento(usuario.getfechaNacimiento());
			usuarioBdd.get().setEdad(usuario.getEdad());
			return usuarioRepository.save(usuarioBdd.get());
		}

		return null;
	}

	@Override
	public void remove (Long id) {
		usuarioRepository.deleteById(id);
	}

}
