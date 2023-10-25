package agenziaViaggi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import agenziaViaggi.models.Pacchetto;
import agenziaViaggi.services.PacchettoService;
@RestController
@RequestMapping("/pacchetti")
public class PacchettoController {

	
	@Autowired
	private PacchettoService pacchettoService;

    @GetMapping("/all")
    public List<Pacchetto> findAllPacchetti() {
        return pacchettoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pacchetto> findPacchettoById(@PathVariable String id) {
        try {
            Long pacchettoId = Long.parseLong(id);
            Pacchetto pacchetto = pacchettoService.findById(pacchettoId);
            return ResponseEntity.ok(pacchetto);
        } catch (NumberFormatException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @PostMapping
    public Pacchetto pacchetto(@RequestBody PacchettoDto dto){
        return this.pacchettoService.create(dto)
    }
}


