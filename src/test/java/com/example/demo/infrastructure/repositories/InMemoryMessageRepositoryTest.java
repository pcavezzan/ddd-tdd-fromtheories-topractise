package com.example.demo.infrastructure.repositories;

import com.example.demo.domain.Message;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class InMemoryMessageRepositoryTest {

    private final InMemoryMessageRepository inMemoryMessageRepository = new InMemoryMessageRepository();

    @Test
    void shouldReturnMessageForCode() {
        final var test = inMemoryMessageRepository.findByCode("Test");

        assertThat(test).isEqualTo(new Message("This is a test"));
    }
}