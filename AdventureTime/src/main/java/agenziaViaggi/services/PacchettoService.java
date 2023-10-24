package agenziaViaggi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import agenziaViaggi.models.Pacchetto;
import agenziaViaggi.repositories.PacchettoRepository;

@Service
public class PacchettoService {

	@Autowired
	public PacchettoRepository pacchettoRepository;
	
	public Pacchetto findById(Long id) {
		return this.pacchettoRepository.findById(id).orElseThrow(() -> new
		ResponseStatusException(HttpStatus.NOT_FOUND));
		}
	
	public Pacchetto create(Pacchetto dto) {
		Pacchetto p = new Pacchetto();
		p.setNome(dto.getNome());
		p.setDescrizione(dto.getDescrizione());
		p.setCosto(dto.getCosto());
		p.setDisponibilita(dto.getDisponibilita());
		p.setGiornoPartenza(dto.getGiornoPartenza());
		p.setGiornoRitorno(dto.getGiornoRitorno());
		p.setMeta(dto.getMeta());
		p.setAssicurazione(dto.isAssicurazione());
		p.setPassaporto(dto.isPassaporto());
		p.setVaccino(dto.isVaccino());
		return this.pacchettoRepository.save(p);
		}

	public List<Pacchetto> findAll() {
		return pacchettoRepository.findAll();
	}
}
