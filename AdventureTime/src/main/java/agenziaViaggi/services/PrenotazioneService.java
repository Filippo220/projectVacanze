package agenziaViaggi.services;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import agenziaViaggi.dto.PrenotazioneDto;
import agenziaViaggi.models.Pacchetto;
import agenziaViaggi.models.Prenotazione;
import agenziaViaggi.models.Utente;
import agenziaViaggi.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	@Autowired
	public PrenotazioneRepository prenotazioneRepository;
	@Autowired
	public ModelMapper modelMapper;

	// PropertyMapper map = PropertyMapper.get();
	//  map.from(UtenteDto.nome).to(Utente.nome);

	
	public Prenotazione findById(Long id) {
		return this.prenotazioneRepository.findById(id).orElseThrow(() -> new
		ResponseStatusException(HttpStatus.NOT_FOUND));
		}

	public Prenotazione create(PrenotazioneDto dto) {
		modelMapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		Prenotazione p = new Prenotazione();
		p = modelMapper.map(dto, Prenotazione.class);
		if(p.getUtente().getPromoCounter() == 10){
			p.setPrezzoFinale(p.getPrezzoFinale()-p.getUtente().calcolaPromo());
			p.getUtente().setPromoCounter(0);
		} else{
		p.getUtente().prenota();}
		return this.prenotazioneRepository.save(p);
		}

	public List<Prenotazione> findByUtente(Utente u){
		return this.prenotazioneRepository.findByUtente(u);
	}
	public List<Prenotazione> findByPacchetto(Pacchetto pack){
		return this.prenotazioneRepository.findByPacchetto(pack);
	}
}
