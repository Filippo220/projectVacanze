package com.example.vacanze1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vacanze1.entity.Pacchetto;
import com.example.vacanze1.services.PacchettoService;

@RestController
@RequestMapping("/pacchetti")
public class PacchettoController {

	
	@Autowired
	private PacchettoService pacchettoService;
	
	  @GetMapping("/all")
	    public List<Pacchetto> findAll() {
	        return pacchettoService.findAll();

	  }
	        @GetMapping("/{id}")
	        public ResponseEntity<Pacchetto> pacchetto (@PathVariable String id) {
	            try {
	                Long userId = Long.parseLong(id);
	                Pacchetto pacchetto = pacchettoService.findById(userId);
	                return ResponseEntity.ok(pacchetto);
	            } catch (NumberFormatException e) {
	                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	            }
	        }
	  
}
