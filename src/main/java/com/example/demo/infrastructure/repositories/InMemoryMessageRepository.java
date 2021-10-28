package com.example.demo.infrastructure.repositories;

import com.example.demo.domain.Message;
import com.example.demo.domain.MessageRepository;

public class InMemoryMessageRepository implements MessageRepository {

    @Override
    public Message findByCode(String code) {
        return new Message("Welcome to TZebra");
    }

}
