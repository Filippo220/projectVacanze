package agenziaViaggi.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agenziaViaggi.dto.PrenotazioneDto;

import agenziaViaggi.models.Prenotazione;

import agenziaViaggi.services.PrenotazioneService;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

	@Autowired
	private PrenotazioneService prenotazioneService;

	@GetMapping("/{id}")
	 public Prenotazione getPrenotazioneById(@PathVariable Long id) {
        return prenotazioneService.findById(id);

}
	  @PostMapping
	    public PrenotazioneDto createPrenotazione(@RequestBody PrenotazioneDto prenotazioneDto) {
	        Prenotazione prenotazione = new Prenotazione();
	        prenotazione.setNumPartecipanti(prenotazioneDto.getNumPartecipanti());
	        prenotazione.setConvalida(prenotazioneDto.isConvalida());
	        prenotazione.setPrezzoFinale(prenotazioneDto.getPrezzoFinale());

	        Prenotazione createdPrenotazione = prenotazioneService.create(prenotazione);
	        
	        PrenotazioneDto createdPrenotazioneDto = new PrenotazioneDto();
	        createdPrenotazioneDto.setNumPartecipanti(createdPrenotazione.getNumPartecipanti());
	        createdPrenotazioneDto.setConvalida(createdPrenotazione.isConvalida());
	        createdPrenotazioneDto.setPrezzoFinale(createdPrenotazione.getPrezzoFinale());

	        return createdPrenotazioneDto;
	    }
	    


	
	
}