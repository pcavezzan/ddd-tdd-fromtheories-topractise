package com.example.demo.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MessageServiceTest {

    private final MessageService messageService = new MessageService();

    @Test
    void shouldReturnWelcomeMessage() {
        final var welcomeMessage = messageService.getWelcomeMessage();

        assertThat(welcomeMessage).isEqualTo(new Message("Welcome to TZebra"));
    }
}