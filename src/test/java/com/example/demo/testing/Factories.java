package com.example.demo.testing;

import com.example.demo.domain.Message;
import com.example.demo.infrastructure.api.MessageView;

public class Factories {
    public static Message aWelcomeMessage() {
        return Message.of("Welcome to TZebra");
    }

    public static MessageView aWelcomeMessageView() {
        return new MessageView("Welcome to TZebra");
    }

    public static Message aMessage() {
        return Message.of(aMessageValue());
    }

    public static String aMessageValue() {
        return "This is a test";
    }

    public static String aCode() {
        return "Test";
    }
}
