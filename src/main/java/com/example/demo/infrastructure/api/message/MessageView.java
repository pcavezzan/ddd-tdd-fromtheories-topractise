package com.example.demo.infrastructure.api.message;

import com.example.demo.domain.message.Message;

public record MessageView(String message) {
    public static MessageView of(Message welcomeMessage) {
        return new MessageView(welcomeMessage.value());
    }
}