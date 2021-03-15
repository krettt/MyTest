package com.saucedemo.pages.proxy;

import com.saucedemo.interfaces.Collect;
import com.saucedemo.interfaces.Compare;
import com.saucedemo.model.Product;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutPageProxy implements Compare, Collect {
    CheckoutPage checkoutPage;
    List<Product> allCartPageProducts;
    List<Product> allCheckoutPageProducts;

    public void createCheckoutPage() {
        if (checkoutPage == null) {
            checkoutPage = new CheckoutPage();
        }
    }

    public void getAllCartPageProducts() {
        CartPage cartPage = CartPageProxy.getCartPage();
        allCartPageProducts = cartPage.getAllCartPageProducts();
    }

    public void getAllCheckoutPageProducts() {
        allCheckoutPageProducts = checkoutPage.getAllCheckoutPageProducts();
    }

    @Override
    public void collectProducts() {
        createCheckoutPage();
        checkoutPage.collectProducts();
    }

    @Override
    public void compare() {
        createCheckoutPage();
        getAllCartPageProducts();
        getAllCheckoutPageProducts();
        assertThat(allCartPageProducts).isEqualTo(allCheckoutPageProducts);
    }
}
