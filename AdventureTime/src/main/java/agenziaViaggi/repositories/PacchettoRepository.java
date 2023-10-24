package agenziaViaggi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import agenziaViaggi.dto.PacchettoDto;

public interface PacchettoRepository extends JpaRepository<PacchettoDto, Long> {

}
