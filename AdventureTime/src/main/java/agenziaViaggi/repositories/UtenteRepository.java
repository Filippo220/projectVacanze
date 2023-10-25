package agenziaViaggi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import agenziaViaggi.models.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long>{

    public Utente findByEmail(String email);
}
