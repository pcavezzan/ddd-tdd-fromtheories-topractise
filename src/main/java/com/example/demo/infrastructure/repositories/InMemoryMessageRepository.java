package com.example.demo.infrastructure.repositories;

import com.example.demo.domain.Message;
import com.example.demo.domain.MessageRepository;

import java.util.Map;

public class InMemoryMessageRepository implements MessageRepository {

    private final Map<String, String> inMemoryMessagesByCode;

    public InMemoryMessageRepository(Map<String, String> inMemoryMessagesByCode) {
        this.inMemoryMessagesByCode = inMemoryMessagesByCode;
    }

    @Override
    public Message findByCode(String code) {
        return Message.of(inMemoryMessagesByCode.getOrDefault(code, ""));
    }

}
