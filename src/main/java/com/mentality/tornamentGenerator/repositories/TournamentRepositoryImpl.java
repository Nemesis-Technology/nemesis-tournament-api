package com.mentality.tornamentGenerator.repositories;
import com.mentality.tornamentGenerator.models.Tournament;
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
        return tournaments.get(id);
    }

}
