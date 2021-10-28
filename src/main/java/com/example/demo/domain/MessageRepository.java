package com.example.demo.domain;

public interface MessageRepository {
    Message findByCode(String welcome);
}
