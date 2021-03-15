package com.saucedemo.model;

import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
//    private String price;
    private String description;

    public static Product buildProduct(SelenideElement name, SelenideElement description){
        return new Product(name.text(),description.text().replaceAll("\\s",""));
    }
}
