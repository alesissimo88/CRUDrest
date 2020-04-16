package com.example.proyectorest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.example.proyectorest.model.Reservas;
import com.example.proyectorest.service.ReservasService;

@Service("ReservasService")
public class ReservasServiceImpl implements ReservasService {
	
	public List<Reservas> reservas = new ArrayList<>();

	@Override
	public List<Reservas> findAll() {
		return reservas;
	}

	@Override
	public Reservas findById(Long id) {
		Optional<Reservas> reserva = reservas.stream().filter(p -> p.getId() == id).findFirst();

		return reserva.isPresent() ? reserva.get() : null;
	}

	@Override
	public Reservas add(Reservas reserva) {
		reservas.add(reserva);

		return reserva;
	}

	@Override
	public Reservas update(Reservas reserva) {
		AtomicInteger index = new AtomicInteger();
		reservas.stream().forEach(p -> {
			if (p.getId() == reserva.getId()) {
				p.setUsuario(reserva.getUsuario());   // ------
				reservas.set(index.get(), p);
			}
			index.getAndIncrement();
		});

		return reserva;
	}

	@Override
	public void remove(Long id) {
		Optional<Reservas> reserva = reservas.stream().filter(p -> p.getId() == id).findFirst();

		if (reserva.isPresent()) {
			reservas.remove(reserva.get());
		}
	}

}
