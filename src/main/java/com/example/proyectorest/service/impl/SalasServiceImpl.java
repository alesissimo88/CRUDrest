package com.example.proyectorest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.proyectorest.model.Salas;
import com.example.proyectorest.service.SalasService;

@Service("SalasService")
public class SalasServiceImpl implements SalasService {
	
	public List<Salas> salas = new ArrayList<>();

	@Override
	public List<Salas> findAll() {
		return salas;
	}

	@Override
	public Salas findById(Long id) {
		Optional<Salas> sala = salas.stream().filter(p -> p.getId() == id).findFirst();

		return sala.isPresent() ? sala.get() : null;
	}

	@Override
	public Salas add(Salas sala) {
		salas.add(sala);

		return sala;
	}

	@Override
	public Salas update(Salas sala) {
		AtomicInteger index = new AtomicInteger();
		salas.stream().forEach(p -> {
			if (p.getId() == sala.getId()) {
				p.setNombre(sala.getNombre());
				salas.set(index.get(), p);
			}
			index.getAndIncrement();
		});

		return sala;
	}

	@Override
	public void remove(Long id) {
		Optional<Salas> sala = salas.stream().filter(p -> p.getId() == id).findFirst();

		if (sala.isPresent()) {
			salas.remove(sala.get());
		}
	}

}
