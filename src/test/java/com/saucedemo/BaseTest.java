package com.saucedemo;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private static final String URL ="https://www.saucedemo.com/";

    @BeforeTest
    public void setUp(){
        Configuration.timeout =6000;
        Configuration.pageLoadTimeout=30000;
    }
    @BeforeMethod
    public void startDriver(){
        open(URL);
    }

    @AfterTest
    public void closeDriver(){
        closeWebDriver();
    }
}
