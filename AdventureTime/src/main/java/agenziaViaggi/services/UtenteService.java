package agenziaViaggi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import agenziaViaggi.dto.UtenteDto;
import agenziaViaggi.models.Utente;
import agenziaViaggi.repositories.UtenteRepository;

	public class UtenteService {

		@Autowired
		public UtenteRepository utenteRepository;

		public Utente findById(Long id) {
		return this.utenteRepository.findById(id).orElseThrow(() -> new
		ResponseStatusException(HttpStatus.NOT_FOUND));
		}
		
		public Utente create(UtenteDto dto) {
			Utente u = new Utente();
			u.setNome(dto.getNome());
			u.setCognome(dto.getCognome());
			u.setEta(dto.getEta());
			u.setEmailAddress(dto.getEmailAddress());
			u.changePassword(dto.getPassword());
			u.setPhoneNumber(dto.getPhoneNumber());
			return this.utenteRepository.save(u);
			}

		public List<Utente> findAll() {
			return utenteRepository.findAll();
		}

		public List<Utente> findByCognome(String name) {
			List<Utente> clienti = new ArrayList<>();
			List<Utente> a = utenteRepository.findAll();
			for(Utente u : a) {
				if (u.getCognome().equals(name))
					clienti.add(u);
			}
			return clienti;
		}
	}

