package com.saucedemo.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
public enum PageHeader {
    PRODUCTS("Products"),
    CHECKOUT_OVERVIEW("Checkout: Overview"),
    CART("Your Cart"),
    CHECKOUT_YOUR_INFO("Checkout: Your Information");

    @Getter
    private String name;
}
