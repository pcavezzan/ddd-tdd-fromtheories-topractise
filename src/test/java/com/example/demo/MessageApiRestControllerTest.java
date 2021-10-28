package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MessageApiRestControllerTest {

    private final MessageApiRestController controller = new MessageApiRestController();

    @Test
    void getWelcomeMessage() {
        final var welcomeMessage = controller.getWelcomeMessage();

        assertThat(welcomeMessage).isEqualTo(new MessageView("Welcome to TZebra"));
    }
}