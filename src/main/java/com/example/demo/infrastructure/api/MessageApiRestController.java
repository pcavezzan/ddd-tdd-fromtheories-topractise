package com.example.demo.infrastructure.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageApiRestController {

    @Autowired
    private MessagePortAdapter messagePortAdapter;

    @GetMapping("/welcome")
    public MessageView getWelcomeMessage() {
        final var welcomeMessage = messagePortAdapter.getWelcomeMessage();
        return MessageView.of(welcomeMessage);
    }

}
