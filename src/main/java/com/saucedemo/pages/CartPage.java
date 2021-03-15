package com.saucedemo.pages;

import com.codeborne.selenide.ElementsCollection;
import com.saucedemo.interfaces.Collect;
import com.saucedemo.model.Product;
import io.qameta.allure.Step;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage implements Collect{
    ElementsCollection cartPageProductItems = $$x("//div[@class='cart_item']");
    @Getter
    List<Product> allCartPageProducts = new ArrayList<>();

    @Step
    @Override
    public void collectProducts() {
        cartPageProductItems.forEach(p ->
                allCartPageProducts.add(Product.buildProduct(
                        p.$x("descendant::div[@class='inventory_item_name']"),
                        p.$x("descendant::div[@class='inventory_item_desc']"))));
    }

    @Step
    public void openLogCheckoutPage() {
        $x("//a[@class='btn_action checkout_button']").click();
    }
}
