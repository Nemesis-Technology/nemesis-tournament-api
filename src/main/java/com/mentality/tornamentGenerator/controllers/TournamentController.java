package com.mentality.tornamentGenerator.controllers;

import com.mentality.tornamentGenerator.models.Tournament;

import com.mentality.tornamentGenerator.repositories.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tournament")
public class TournamentController {

    @Autowired
    private TournamentRepository tournamentRepository;

    @PostMapping ("/add")
    public void addTournament(@RequestBody Tournament tournament) {
        tournamentRepository.addTournament(tournament);
    }

    @GetMapping("/find/{id}")
    public Tournament findTournament(@PathVariable String id) {
        return tournamentRepository.findTournamentById(id);
    }
}
