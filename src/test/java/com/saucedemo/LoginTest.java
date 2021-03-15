package com.saucedemo;

import com.saucedemo.interfaces.Login;
import com.saucedemo.pages.proxy.LoginPageProxy;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void logIn() {
        Login loginPage = new LoginPageProxy();
        loginPage.SignIn();
    }
}
