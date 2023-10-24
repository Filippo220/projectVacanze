package agenziaViaggi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import agenziaViaggi.dto.PrenotazioneDto;

public interface PrenotazioneRepository extends JpaRepository<PrenotazioneDto, Long>{

}
