package com.example.demo.domain;

public class MessageService implements MessagePort {

    private MessageRepository messageRepository;

    @Override
    public Message getWelcomeMessage() {
        return messageRepository.findByCode("Welcome");
    }

}
