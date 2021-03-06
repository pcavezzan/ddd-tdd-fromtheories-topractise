package com.example.demo.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.demo.testing.Factories.aWelcomeMessage;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MessageServiceTest {

    @Mock
    private MessageRepository messageRepository;

    @InjectMocks
    private MessageService messageService;

    @Test
    void shouldReturnWelcomeMessage() {
        when(messageRepository.findByCode("Welcome")).thenReturn(aWelcomeMessage());

        final var welcomeMessage = messageService.getWelcomeMessage();

        assertThat(welcomeMessage).isEqualTo(aWelcomeMessage());
    }

}