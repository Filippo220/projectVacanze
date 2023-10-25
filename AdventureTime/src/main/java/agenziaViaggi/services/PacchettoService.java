package agenziaViaggi.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import agenziaViaggi.dto.PacchettoDto;
import agenziaViaggi.models.Pacchetto;
import agenziaViaggi.repositories.PacchettoRepository;

@Service
public class PacchettoService {

	@Autowired
	public PacchettoRepository pacchettoRepository;
	@Autowired
	public ModelMapper modelMapper;
	
	public Pacchetto findById(Long id) {
		return this.pacchettoRepository.findById(id).orElseThrow(() -> new
		ResponseStatusException(HttpStatus.NOT_FOUND));
		}
	
	public Pacchetto create(PacchettoDto dto) {
		modelMapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		Pacchetto p = new Pacchetto();
		p = modelMapper.map(dto, Pacchetto.class);
		return this.pacchettoRepository.save(p);
		}

	public List<Pacchetto> findAll() {
		return pacchettoRepository.findAll();
	}
}
