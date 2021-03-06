package com.example.demo.infrastructure.repositories;

import com.example.demo.domain.Message;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.example.demo.testing.Factories.*;
import static org.assertj.core.api.Assertions.assertThat;

class InMemoryMessageRepositoryTest {

    private final InMemoryMessageRepository inMemoryMessageRepository = new InMemoryMessageRepository(
            Map.of(aCode(), aMessageValue())
    );

    @Test
    void shouldReturnMessageForCode() {
        final var test = inMemoryMessageRepository.findByCode(aCode());

        assertThat(test).isEqualTo(aMessage());
    }

    @Test
    void shouldReturnEmptyMessageForNonExistentCode() {
        final var test = inMemoryMessageRepository.findByCode("DOES_NOT_EXIST");

        assertThat(test).isEqualTo(Message.of(""));

    }

}