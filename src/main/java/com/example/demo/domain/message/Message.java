package com.example.demo.domain.message;

public record Message(String value) {
    public static Message of(String value) {
        return new Message(value);
    }
}
