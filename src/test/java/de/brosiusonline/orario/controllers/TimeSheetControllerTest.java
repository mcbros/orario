package de.brosiusonline.orario.controllers;

import de.brosiusonline.orario.domain.Day;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.ArrayList;
import java.util.List;

public class TimeSheetControllerTest {

    WebTestClient webTestClient;
    TimeSheetController timeSheetController;

    @Before
    public void setUp() {
        timeSheetController = new TimeSheetController();
        webTestClient = WebTestClient.bindToController(timeSheetController).build();
    }

    @Test
    public void testGetDays() {
        List<Day> expectedDays = new ArrayList<>();

        webTestClient.get().uri("/api/v1/days").exchange().expectBody(List.class).isEqualTo(expectedDays);
    }
}
