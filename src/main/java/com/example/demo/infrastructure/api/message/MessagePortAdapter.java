package com.example.demo.infrastructure.api.message;

import com.example.demo.domain.message.Message;
import com.example.demo.domain.message.MessagePort;

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
