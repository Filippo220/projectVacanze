package com.example.vacanze1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vacanze1.entity.Prenotazione;
import com.example.vacanze1.services.PrenotazioneService;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

	@Autowired
	private PrenotazioneService prenotazioneService;

	@GetMapping("/{id}")
	 public Prenotazione getPrenotazioneById(@PathVariable Long id) {
        return prenotazioneService.findById(id);

}

	
	
}