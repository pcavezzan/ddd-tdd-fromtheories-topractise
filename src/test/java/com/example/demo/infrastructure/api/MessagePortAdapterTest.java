package com.example.demo.infrastructure.api;

import com.example.demo.domain.message.MessagePort;
import com.example.demo.infrastructure.api.message.MessagePortAdapter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.demo.testing.Factories.aWelcomeMessage;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class MessagePortAdapterTest {

    @Mock
    private MessagePort messagePort;

    @InjectMocks
    private MessagePortAdapter messagePortAdapter;

    @Test
    void shouldReturnWelcomeMessage() {
        when(messagePort.getWelcomeMessage()).thenReturn(aWelcomeMessage());

        final var welcomeMessage = messagePortAdapter.getWelcomeMessage();

        assertThat(welcomeMessage).isEqualTo(aWelcomeMessage());
    }
}