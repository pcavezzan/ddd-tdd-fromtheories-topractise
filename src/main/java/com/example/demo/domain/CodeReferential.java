package com.example.demo.domain;

public enum CodeReferential {
    WELCOME("Welcome");

    private final String code;

    CodeReferential(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
