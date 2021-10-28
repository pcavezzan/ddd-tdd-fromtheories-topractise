package com.example.demo.infrastructure.api;

import com.example.demo.domain.MessagePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageApiRestController {

    @Autowired
    private MessagePort messagePort;

    @GetMapping("/welcome")
    public MessageView getWelcomeMessage() {
        final var welcomeMessage = messagePort.getWelcomeMessage();
        return MessageView.of(welcomeMessage);
    }

}
