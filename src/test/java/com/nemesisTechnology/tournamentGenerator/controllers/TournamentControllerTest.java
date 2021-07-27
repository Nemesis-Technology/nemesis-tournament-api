package com.nemesisTechnology.tournamentGenerator.controllers;
import com.nemesisTechnology.tournamentGenerator.models.Tournament;
import com.nemesisTechnology.tournamentGenerator.repositories.TournamentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TournamentControllerTest {

    @Autowired
    TournamentController tournamentController;

    @Test
    public void GivenATournament_ShouldReturn200() {
        Tournament tournament = Tournament.builder().id("1").build();

        ResponseEntity<String> response = tournamentController.addTournament(tournament);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
