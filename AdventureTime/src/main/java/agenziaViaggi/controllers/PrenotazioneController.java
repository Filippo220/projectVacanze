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
    public Prenotazione prenotazione(@RequestBody PrenotazioneDto dto){
        return this.prenotazioneService.create(dto)
    }
	    


	
	
}