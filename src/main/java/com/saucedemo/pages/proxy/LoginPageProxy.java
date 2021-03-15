package com.saucedemo.pages.proxy;

import com.saucedemo.data.UserData;
import com.saucedemo.interfaces.Login;
import com.saucedemo.pages.LoginPage;

public class LoginPageProxy implements Login {
    LoginPage loginPage;

    @Override

    public void SignIn() {
        if (loginPage == null) {
            loginPage = new LoginPage(UserData.EMAIL, UserData.PASS);
        }
        loginPage.SignIn();
    }

}
