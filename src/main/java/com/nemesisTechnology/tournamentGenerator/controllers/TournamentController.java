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
        try {
            tournamentRepository.addTournament(tournament);
            return new ResponseEntity<String>(tournament.id, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("{id}")
    public Tournament findTournament(@PathVariable String id) {
        return tournamentRepository.findTournamentById(id);
    }
}
