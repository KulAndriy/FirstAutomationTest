package com.rozetka.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class FireFoxSettings {
    protected WebDriver driver1;
    protected String userEmail = "avtotest@gmail.com";
    protected String userPassword;

    {
        userPassword = "777777A";
    }

    @BeforeTest
    public void setUp(){
        driver1 = new FirefoxDriver();
        driver1.get("https://rozetka.com.ua/");
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

//    @AfterTest
//    public void turnDown(){
//        driver.close();
//    }


}
