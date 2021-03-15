package com.saucedemo;

import com.saucedemo.pages.proxy.CartPageProxy;
import com.saucedemo.pages.proxy.ProductListPageProxy;
import org.testng.annotations.Test;

public class AddedProductTest extends BaseTest {

    @Test
    public void addProduct() {
        LoginTest loginTest = new LoginTest();
        loginTest.logIn();

        ProductListPageProxy productListPage = new ProductListPageProxy();
        productListPage.collectProducts();
        productListPage.addProduct();
        productListPage.openCartPage();

        CartPageProxy cartPage = new CartPageProxy();
        cartPage.collectProducts();
        cartPage.compare();
    }
}
