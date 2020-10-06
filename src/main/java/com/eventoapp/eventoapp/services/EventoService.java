package com.eventoapp.eventoapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventoapp.eventoapp.models.Evento;
import com.eventoapp.eventoapp.repositories.EventoRepository;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eventoRepository;
	
	public List<Evento> findAll(){
		Evento ev1 = new Evento(null, "Evento um", "local um", "Data um", "Horário um");
		Evento ev2 = new Evento(null, "Evento dois", "local dois", "Data dois", "Horário dois");
		Evento ev3 = new Evento(null, "Evento três", "local três", "Data três", "Horário três");
		
		eventoRepository.save(ev1);
		eventoRepository.save(ev2);
		eventoRepository.save(ev3);
		
		return eventoRepository.findAll();
	}
}
