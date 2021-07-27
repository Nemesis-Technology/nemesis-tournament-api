package com.nemesisTechnology.tournamentGenerator.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Tournament {
    public String id;
    public List<Player> players;
    public Integer maxPlayers;
}
