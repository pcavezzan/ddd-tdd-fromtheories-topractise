package com.example.demo.domain;

public class MessagePort {

    private final MessageRepository messageRepository;

    public MessagePort(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message getWelcomeMessage() {
        return messageRepository.findByCode(CodeReferential.WELCOME.getCode());
    }

}
