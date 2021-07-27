package com.nemesisTechnology.tournamentGenerator.repositories;

import com.nemesisTechnology.tournamentGenerator.models.Tournament;


public interface TournamentRepository {

    void addTournament(Tournament tournament);
    Tournament findTournamentById(String id);
}
