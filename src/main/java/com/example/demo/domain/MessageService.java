package com.example.demo.domain;

public class MessageService implements MessagePort {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message getWelcomeMessage() {
        return messageRepository.findByCode("Welcome");
    }

}
