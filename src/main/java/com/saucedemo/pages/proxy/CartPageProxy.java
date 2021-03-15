package com.saucedemo.pages.proxy;

import com.saucedemo.interfaces.Collect;
import com.saucedemo.interfaces.Compare;
import com.saucedemo.interfaces.OpenLogCheckoutPage;
import com.saucedemo.model.Product;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.ProductListPage;
import lombok.Getter;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CartPageProxy implements Compare, Collect, OpenLogCheckoutPage {
    @Getter
    public static CartPage cartPage;
    List<Product> allCartPageProducts;
    List<Product> allProductListPageProducts;

    public void createCartPage() {
        if (cartPage == null) {
            cartPage = new CartPage();
        }
    }

    public void getProductsFromProductListPage() {
        ProductListPage productListPage = ProductListPageProxy.getProductListPage();
        allProductListPageProducts = productListPage.getAllProductListPageProducts();
    }

    public void getCartPageProducts() {
        allCartPageProducts = cartPage.getAllCartPageProducts();
    }

    @Override
    public void compare() {
        createCartPage();
        getProductsFromProductListPage();
        getCartPageProducts();
        assertThat(allProductListPageProducts).containsAnyElementsOf(allCartPageProducts);
    }

    @Override
    public void collectProducts() {
        createCartPage();
        cartPage.collectProducts();
    }

    @Override
    public void openLogCheckoutPage() {
        createCartPage();
        cartPage.openLogCheckoutPage();
    }
}
