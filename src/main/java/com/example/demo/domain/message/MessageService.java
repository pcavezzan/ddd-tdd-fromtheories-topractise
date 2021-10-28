package com.example.demo.domain.message;

import com.example.demo.domain.core.CodeReferential;

public class MessageService implements MessagePort {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message getWelcomeMessage() {
        return messageRepository.findByCode(CodeReferential.WELCOME.getCode());
    }

}
