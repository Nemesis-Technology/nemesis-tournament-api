package com.nemesisTechnology.tournamentGenerator.controllers;
import com.nemesisTechnology.tournamentGenerator.models.Tournament;
import com.nemesisTechnology.tournamentGenerator.repositories.TournamentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TournamentControllerTest {

    @Autowired
    protected TestRestTemplate testRestTemplate;

    @Autowired
    TournamentController tournamentController;

    @Test
    public void GivenATournament_WhenAddATournament_ShouldReturn200() {
        Tournament tournament = Tournament.builder().id("1").build();

        ResponseEntity<String> response = testRestTemplate.postForEntity("/tournament/", tournament, String.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void GivenInvalidAlias_WhenTryToGetATournament_ShouldReturn404() {
        String invalidAlias = "invalidAlias";

        ResponseEntity<Tournament> response = testRestTemplate.getForEntity("/tournament/" + invalidAlias, Tournament.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }
}
