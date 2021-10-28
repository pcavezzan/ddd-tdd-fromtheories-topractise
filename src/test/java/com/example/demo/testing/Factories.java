package com.example.demo.testing;

import com.example.demo.domain.core.Code;
import com.example.demo.domain.message.Message;
import com.example.demo.infrastructure.api.message.MessageView;

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

    public static Code aCode() {
        return aCode(aCodeValue());
    }

    public static Code aCode(String value) {
        return new Code(value);
    }

    public static String aCodeValue() {
        return "Test";
    }
}
