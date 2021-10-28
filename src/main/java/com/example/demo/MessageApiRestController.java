package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageApiRestController {

    @GetMapping("/welcome")
    public MessageView getWelcomeMessage() {
        return new MessageView("Welcome to TZebra");
    }

}
