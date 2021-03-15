package com.saucedemo.pages;

import com.saucedemo.data.UserData;
import com.saucedemo.interfaces.Login;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage implements Login {
    private UserData name;
    private UserData pass;

    public LoginPage(UserData name, UserData pass) {
        this.name = name;
        this.pass = pass;
    }

    @Override
    public void SignIn() {
        $x("//input[@id='user-name']").val(name.getName());
        $x("//input[@id='password']").val(pass.getName());
        $x("//input[@id='login-button']").click();
    }
}
