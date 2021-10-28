package com.example.demo.infrastructure.api;

import com.example.demo.domain.Message;
import com.example.demo.domain.MessagePort;

public class MessagePortAdapter implements MessagePort {

    private final MessagePort messagePort;

    public MessagePortAdapter(MessagePort messagePort) {
        this.messagePort = messagePort;
    }

    @Override
    public Message getWelcomeMessage() {
        return messagePort.getWelcomeMessage();
    }
}
