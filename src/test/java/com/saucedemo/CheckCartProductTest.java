package com.saucedemo;

import com.saucedemo.pages.proxy.CartPageProxy;
import com.saucedemo.pages.proxy.CheckoutPageProxy;
import com.saucedemo.pages.proxy.LogCheckoutPageProxy;
import org.testng.annotations.Test;

public class CheckCartProductTest extends BaseTest {

    @Test
    public void checkCartProduct() {
        AddedProductTest addedProductTest = new AddedProductTest();
        addedProductTest.addProduct();
        CartPageProxy cartPage = new CartPageProxy();
        cartPage.openLogCheckoutPage();

        LogCheckoutPageProxy logCheckoutPage = new LogCheckoutPageProxy();
        logCheckoutPage.inputInfo();

        CheckoutPageProxy checkoutPage = new CheckoutPageProxy();
        checkoutPage.collectProducts();
        checkoutPage.compare();
    }
}
