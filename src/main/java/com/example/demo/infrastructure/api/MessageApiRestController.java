package com.example.demo.infrastructure.api;

import com.example.demo.domain.MessagePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageApiRestController {

    @Autowired
    private MessagePort messagePortAdapter;

    @GetMapping("/welcome")
    public MessageView getWelcomeMessage() {
        final var welcomeMessage = messagePortAdapter.getWelcomeMessage();
        return MessageView.of(welcomeMessage);
    }

}
