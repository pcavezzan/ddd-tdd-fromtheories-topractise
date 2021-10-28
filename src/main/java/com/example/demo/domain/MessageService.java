package com.example.demo.domain;

public class MessageService implements MessagePort {

    @Override
    public Message getWelcomeMessage() {
        return new Message("Welcome to TZebra");
    }

}
