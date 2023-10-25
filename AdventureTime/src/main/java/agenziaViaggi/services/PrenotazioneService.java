package agenziaViaggi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import agenziaViaggi.models.Pacchetto;
import agenziaViaggi.models.Prenotazione;
import agenziaViaggi.models.Utente;
import agenziaViaggi.repositories.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	@Autowired
	public PrenotazioneRepository prenotazioneRepository;
	
	public Prenotazione findById(Long id) {
		return this.prenotazioneRepository.findById(id).orElseThrow(() -> new
		ResponseStatusException(HttpStatus.NOT_FOUND));
		}
	public Prenotazione create(Prenotazione dto) {
		Prenotazione p = new Prenotazione();
		p.setUtente(dto.getUtente());
		p.setPacchetto(dto.getPacchetto());
		p.setNumPartecipanti(dto.getNumPartecipanti());
		p.setConvalida(dto.isConvalida());
		p.calcolaPrezzo();
		return this.prenotazioneRepository.save(p);
		}
	public List<Prenotazione> findByUtente(Long id){
		List<Prenotazione> prenotazioni = new ArrayList<>();
		List<Prenotazione> pren = prenotazioneRepository.findAll();
		for (Prenotazione p : pren) {
			if (p.getUtente().getId == id){
				prenotazioni.add(p);
			}
		} return prenotazioni;
	}
	public List<Prenotazione> findByPacchetto(Pacchetto pack){
		List<Prenotazione> prenotazioni = new ArrayList<>();
		List<Prenotazione> pren = prenotazioneRepository.findAll();
		for (Prenotazione p : pren) {
			if (p.getPacchetto().equals(pack)){
				prenotazioni.add(p);
			}
		} return prenotazioni;
	}
}
