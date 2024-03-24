package com.confiedy.app.controllers;

import com.confiedy.app.entities.Championship;
import com.confiedy.app.service.ChampionshipService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/championships")
public class ChampionshipController {

    @Autowired
    private ChampionshipService championshipService;

    @PostMapping
    public ResponseEntity<Championship> createChampionship(@Valid @RequestBody Championship championship) {
        Championship createdChampionship = championshipService.createChampionship(championship);
        return new ResponseEntity<>(createdChampionship, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Championship>> getAllChampionships() {
        List<Championship> championships = championshipService.findAllChampionships();
        return new ResponseEntity<>(championships, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Championship> getChampionshipById(@PathVariable Integer id) {
        Championship championship = championshipService.findChampionshipById(id);
        if (championship == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(championship, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Championship> updateChampionship(@PathVariable Integer id, @Valid @RequestBody Championship championship) {
        championship.setChampionshipId(id); // Ensure ID matches path variable
        Championship updatedChampionship = championshipService.updateChampionship(championship);
        if (updatedChampionship == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedChampionship, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChampionship(@PathVariable Integer id) {
        championshipService.deleteChampionship(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}