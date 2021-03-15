package com.saucedemo.pages.proxy;

import com.saucedemo.data.CheckoutData;
import com.saucedemo.interfaces.InputInfo;
import com.saucedemo.pages.LogCheckoutPage;

public class LogCheckoutPageProxy implements InputInfo {
    LogCheckoutPage logCheckoutPage;
    @Override
    public void inputInfo() {

        if (logCheckoutPage ==null){
            logCheckoutPage = new LogCheckoutPage(
                    CheckoutData.FIRST_NAME, CheckoutData.LAST_NAME, CheckoutData.POSTAL_CODE);
        }
        logCheckoutPage.inputInfo();
    }
}
