package com.example.demo.domain.message;

import com.example.demo.domain.core.Code;

public interface MessageRepository {
    Message findByCode(Code code);
}
