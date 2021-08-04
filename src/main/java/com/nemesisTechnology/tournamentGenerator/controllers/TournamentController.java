package com.nemesisTechnology.tournamentGenerator.controllers;

import com.nemesisTechnology.tournamentGenerator.models.Tournament;

import com.nemesisTechnology.tournamentGenerator.repositories.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    @Autowired
    private TournamentRepository tournamentRepository;

    @PostMapping ()
    public ResponseEntity<String> addTournament(@RequestBody Tournament tournament) {
            tournamentRepository.addTournament(tournament);
            return new ResponseEntity<String>(tournament.id, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Tournament> findTournament(@PathVariable String id) {
        Tournament tournament =  tournamentRepository.findTournamentById(id);
        return new ResponseEntity<Tournament>(tournament, HttpStatus.OK);
    }
}
