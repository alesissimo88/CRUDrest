package com.example.proyectorest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectorest.model.Salas;
import com.example.proyectorest.repository.SalasRepository;
import com.example.proyectorest.service.SalasService;

@Service("SalasServiceBdd")
public class SalasServiceBddImpl implements SalasService {
	
	@Autowired
	private SalasRepository salaRepository;

	@Override
	public List<Salas> findAll() {
		return salaRepository.findAll();
	}

	@Override
	public Salas findById(Long id) {
		Optional<Salas> sala = salaRepository.findById(id);
		return sala.isPresent() ? sala.get() : null;
	}

	@Override
	public Salas add(Salas sala) {
		return salaRepository.save(sala);
	}

	@Override
	public Salas update(Salas sala) {
		Optional<Salas> salaBdd = salaRepository.findById(sala.getId());

		if (salaBdd.isPresent()) {
			
			salaBdd.get().setNombre(sala.getNombre());
			salaBdd.get().setNumero(sala.getNumero());
			salaBdd.get().setLugar(sala.getLugar());
			return salaRepository.save(salaBdd.get());
		}

		return null;
	}

	@Override
	public void remove (Long id) {
		salaRepository.deleteById(id);
	}

}
