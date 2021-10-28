package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GetWelcomeMessageRestApiIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldReturnWelcomeMessage() {
        final var forObject = restTemplate.getForObject(format("http://localhost:%d/welcome", port), String.class);

        assertThat(forObject).isEqualTo("{\"message\":\"Welcome to TZebra\"}");
    }
}
