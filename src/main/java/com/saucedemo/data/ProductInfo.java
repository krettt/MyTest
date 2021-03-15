package com.saucedemo.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ProductInfo {
    SAUCE_LABS_BACKPACK("Sauce Labs Backpack"),
    SAUCE_LABS_Bike_Light("Sauce Labs Bike Light"),
    SAUCE_LABS_BOLT_T_SHIRT("Sauce Labs Bolt T-Shirt"),
    SAUCE_LABS_FLEECE_JACKET("Sauce Labs Fleece Jacket"),
    SAUCE_LABS_ONESIE("Sauce Labs Onesie"),
    RED_T_SHIRT("Test.allTheThings() T-Shirt (Red)");

    @Getter
    private String name;
}
