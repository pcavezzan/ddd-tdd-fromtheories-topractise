package com.example.demo.infrastructure.repositories;

import com.example.demo.domain.Message;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class InMemoryMessageRepositoryTest {

    private final InMemoryMessageRepository inMemoryMessageRepository = new InMemoryMessageRepository(
            Map.of("Test", "This is a test")
    );

    @Test
    void shouldReturnMessageForCode() {
        final var test = inMemoryMessageRepository.findByCode("Test");

        assertThat(test).isEqualTo(new Message("This is a test"));
    }
}