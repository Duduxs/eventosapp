package com.eventoapp.eventoapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventoapp.eventoapp.models.Evento;
import com.eventoapp.eventoapp.repositories.EventoRepository;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eventoRepository;
	
	/*Esse transactional aí serve pra forçar o banco a reconhecer que isso é um método
	 * que vai fazer alguma operação com o banco
	 */
	@Transactional
	public List<Evento> findAll(){
		/*
		 * Aqui tem alguns seeding do db, tu pode também se quiser criar
		 * no caminho src/main/resources um arquivo chamado import.sql onde tu vai colocar
		 * os comandos SQL que tu quer importar pro banco de dados por exemplo
		 * INSERT INTO evento (nome, local, data, horario) VALUES ('teste','teste','teste','teste);
		 */
		Evento ev1 = new Evento(null, "Evento um", "local um", "Data um", "Horário um");
		Evento ev2 = new Evento(null, "Evento dois", "local dois", "Data dois", "Horário dois");
		Evento ev3 = new Evento(null, "Evento três", "local três", "Data três", "Horário três");
		
		eventoRepository.save(ev1);
		eventoRepository.save(ev2);
		eventoRepository.save(ev3);
		
		return eventoRepository.findAll();
	}
}
