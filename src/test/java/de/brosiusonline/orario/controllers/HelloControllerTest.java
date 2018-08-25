package de.brosiusonline.orario.controllers;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.reactive.server.WebTestClient;

public class HelloControllerTest {

    WebTestClient webTestClient;
    HelloController helloController;

    @Before
    public void setUp() {
        helloController = new HelloController();
        webTestClient = WebTestClient.bindToController(helloController).build();
    }

    @Test
    public void sayHello() {
        webTestClient.get().uri("/api/v1/hello").exchange()
                .expectBody(String.class)
                .isEqualTo("Hello World!");
    }
}