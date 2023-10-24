package com.example.vacanze1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vacanze1.entity.Utente;
import com.example.vacanze1.services.UtenteService;

@RestController
@RequestMapping("/utenti")
public class UtenteController {

    @Autowired
    private UtenteService utenteService;

    @GetMapping("/all")
    public List<Utente> findAll() {
        return utenteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Utente> utente(@PathVariable String id) {
        try {
            Long userId = Long.parseLong(id);
            Utente utente = utenteService.findById(userId);
            return ResponseEntity.ok(utente);
        } catch (NumberFormatException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // @PostMapping
}
