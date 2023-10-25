package agenziaViaggi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import agenziaViaggi.models.Prenotazione;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long>{

}
