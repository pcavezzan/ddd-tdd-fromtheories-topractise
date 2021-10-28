package com.example.demo.infrastructure.api;

import com.example.demo.domain.MessagePort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.demo.testing.Factories.aWelcomeMessage;
import static com.example.demo.testing.Factories.aWelcomeMessageView;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MessageApiRestControllerTest {

    @Mock
    private MessagePort messagePort;

    @InjectMocks
    private MessageApiRestController controller;

    @Test
    void getWelcomeMessage() {
        when(messagePort.getWelcomeMessage()).thenReturn(aWelcomeMessage());

        final var welcomeMessage = controller.getWelcomeMessage();

        assertThat(welcomeMessage).isEqualTo(aWelcomeMessageView());
    }

}