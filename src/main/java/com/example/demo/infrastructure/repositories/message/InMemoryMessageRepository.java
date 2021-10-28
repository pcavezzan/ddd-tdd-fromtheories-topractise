package com.example.demo.infrastructure.repositories.message;

import com.example.demo.domain.core.Code;
import com.example.demo.domain.message.Message;
import com.example.demo.domain.message.MessageRepository;

import java.util.Map;

public class InMemoryMessageRepository implements MessageRepository {

    private final Map<String, String> inMemoryMessagesByCode;

    public InMemoryMessageRepository(Map<String, String> inMemoryMessagesByCode) {
        this.inMemoryMessagesByCode = inMemoryMessagesByCode;
    }

    @Override
    public Message findByCode(Code code) {
        return Message.of(inMemoryMessagesByCode.getOrDefault(code.value(), ""));
    }

}
