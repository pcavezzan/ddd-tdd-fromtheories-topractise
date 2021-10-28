package com.example.demo.domain.core;

public enum CodeReferential {
    WELCOME(new Code("Welcome"));

    private final Code code;

    CodeReferential(Code code) {
        this.code = code;
    }

    public Code getCode() {
        return code;
    }
}
