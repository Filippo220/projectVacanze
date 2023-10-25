package agenziaViaggi.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import agenziaViaggi.dto.UtenteDto;
import agenziaViaggi.models.Utente;
import agenziaViaggi.repositories.UtenteRepository;

	public class UtenteService {

		@Autowired
		public UtenteRepository utenteRepository;
		@Autowired
		public ModelMapper modelMapper;

		public Utente findById(Long id) {
		return this.utenteRepository.findById(id).orElseThrow(() -> new
		ResponseStatusException(HttpStatus.NOT_FOUND));
		}
		
		public Utente create(UtenteDto dto) {
			modelMapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		Utente u = new Utente();
		u = modelMapper.map(dto, Utente.class);
		return this.utenteRepository.save(u);
		}

		public List<Utente> findAll() {
			return utenteRepository.findAll();
		}

		public <Optional>Utente findByEmail(String email) {
			return this.utenteRepository.findByEmail(email);
	}
}

