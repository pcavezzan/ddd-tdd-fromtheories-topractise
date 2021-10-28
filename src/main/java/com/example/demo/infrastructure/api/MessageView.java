package com.example.demo.infrastructure.api;

import com.example.demo.domain.Message;

public record MessageView(String message) {
    public static MessageView of(Message welcomeMessage) {
        return new MessageView(welcomeMessage.value());
    }
}