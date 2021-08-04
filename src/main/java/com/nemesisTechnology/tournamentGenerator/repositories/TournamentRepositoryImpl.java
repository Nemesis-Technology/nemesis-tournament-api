package com.nemesisTechnology.tournamentGenerator.repositories;
import com.nemesisTechnology.tournamentGenerator.exceptions.ItemNotFoundException;
import com.nemesisTechnology.tournamentGenerator.models.Tournament;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class TournamentRepositoryImpl implements TournamentRepository{

    private HashMap<String, Tournament> tournaments = new HashMap<>();

    @Override
    public void addTournament(Tournament tournament) {
        tournaments.put(tournament.id, tournament);
    }

    @Override
    public Tournament findTournamentById(String id) {
        Tournament tournament = tournaments.get(id);
        if (tournament == null) {
            throw new ItemNotFoundException("tournament");
        }
        return tournament;
    }

}
