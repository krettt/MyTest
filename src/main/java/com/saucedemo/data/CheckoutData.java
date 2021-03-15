package com.saucedemo.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CheckoutData {
    FIRST_NAME("Oleh"),
    LAST_NAME("Kret"),
    POSTAL_CODE("79052");

    @Getter
    private String name;
}
