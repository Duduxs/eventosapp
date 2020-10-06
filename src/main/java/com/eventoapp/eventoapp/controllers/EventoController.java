package com.eventoapp.eventoapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventoapp.eventoapp.models.Evento;
import com.eventoapp.eventoapp.services.EventoService;

@RestController
@RequestMapping("/eventos")
public class EventoController {

	@Autowired
	private EventoService eventoService;
	
	@GetMapping
	public List<Evento> form() {
		return eventoService.findAll();
	}
}
