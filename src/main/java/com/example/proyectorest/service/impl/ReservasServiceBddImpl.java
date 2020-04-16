package com.example.proyectorest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectorest.model.Reservas;
import com.example.proyectorest.repository.ReservasRepository;
import com.example.proyectorest.service.ReservasService;


@Service("ReservasServiceBdd")
public class ReservasServiceBddImpl implements ReservasService {
	
	@Autowired
	private ReservasRepository reservaRepository;

	@Override
	public List<Reservas> findAll() {
		return reservaRepository.findAll();
	}

	@Override
	public Reservas findById(Long id) {
		Optional<Reservas> reserva = reservaRepository.findById(id);
		return reserva.isPresent() ? reserva.get() : null;
	}

	@Override
	public Reservas add(Reservas reserva) {
		return reservaRepository.save(reserva);
	}

	@Override
	public Reservas update(Reservas reserva) {
		Optional<Reservas> reservaBdd = reservaRepository.findById(reserva.getId());

		if (reservaBdd.isPresent()) {
			
			reservaBdd.get().setUsuario(reserva.getUsuario());
			reservaBdd.get().setSala(reserva.getSala());
			reservaBdd.get().setFecha(reserva.getFecha());
			reservaBdd.get().setMotivo(reserva.getMotivo());
			reservaBdd.get().setAceptada(reserva.getAceptada());
			return reservaRepository.save(reservaBdd.get());
		}

		return null;
	}

	@Override
	public void remove (Long id) {
		reservaRepository.deleteById(id);
	}

}
