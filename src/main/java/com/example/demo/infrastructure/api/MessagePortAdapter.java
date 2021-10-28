package com.example.demo.infrastructure.api;

import com.example.demo.domain.Message;
import com.example.demo.domain.MessagePort;

public class MessagePortAdapter {

    private final MessagePort messagePort;

    public MessagePortAdapter(MessagePort messagePort) {
        this.messagePort = messagePort;
    }

    public Message getWelcomeMessage() {
        return messagePort.getWelcomeMessage();
    }
}
