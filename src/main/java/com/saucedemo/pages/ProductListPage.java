package com.saucedemo.pages;

import com.codeborne.selenide.ElementsCollection;
import com.saucedemo.data.ProductInfo;
import com.saucedemo.interfaces.Add;
import com.saucedemo.interfaces.Collect;
import com.saucedemo.interfaces.OpenCartPage;
import com.saucedemo.model.Product;
import io.qameta.allure.Step;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProductListPage implements Collect, Add, OpenCartPage {
    private ProductInfo productName;
    @Getter
    List<Product> allProductListPageProducts = new ArrayList<>();


    @Step
    @Override
    public void collectProducts() {
        ElementsCollection productListPageItems = $$x("//div[@class='inventory_item']");
        productListPageItems.forEach(p ->
                allProductListPageProducts.add(Product.buildProduct(
                        p.$x("descendant::div[@class='inventory_item_name']"),
                        p.$x("descendant::div[@class='inventory_item_desc']"))));
    }

    @Override
    public void addProduct() {
        $x("//div[contains(text(),'" + productName.getName() + "')]" +
                "/ancestor::div[@class='inventory_item']" +
                "/descendant::button[@class='btn_primary btn_inventory']").click();
    }
    @Override
    public void openCartPage() {
        $x("//a[@class='shopping_cart_link fa-layers fa-fw']").click();
    }
    public void setProductName(ProductInfo productName) {
        this.productName = productName;
    }
}
