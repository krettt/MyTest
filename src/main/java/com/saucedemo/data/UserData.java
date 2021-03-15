package com.saucedemo.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum UserData {
    EMAIL("performance_glitch_user"),
    PASS("secret_sauce");

    @Getter
    private String name;
}
