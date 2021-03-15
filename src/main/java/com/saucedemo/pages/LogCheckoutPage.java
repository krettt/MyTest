package com.saucedemo.pages;

import com.saucedemo.data.CheckoutData;
import com.saucedemo.interfaces.InputInfo;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;

public class LogCheckoutPage implements InputInfo {

    private CheckoutData firstName;
    private CheckoutData lastName;
    private CheckoutData postalCode;

    public LogCheckoutPage(CheckoutData firstName,
                           CheckoutData lastName, CheckoutData postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    @Step
    @Override
    public void inputInfo() {
        $x("//input[@id='first-name']").val(firstName.getName());
        $x("//input[@id='last-name']").val(lastName.getName());
        $x("//input[@id='postal-code']").val(postalCode.getName());
        $x("//input[@value='CONTINUE']").click();
    }
}
