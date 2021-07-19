package com.mentality.tornamentGenerator.repositories;

import com.mentality.tornamentGenerator.models.Tournament;
import org.springframework.stereotype.Repository;


public interface TournamentRepository {

    void addTournament(Tournament tournament);
    Tournament findTournamentById(String id);
}
