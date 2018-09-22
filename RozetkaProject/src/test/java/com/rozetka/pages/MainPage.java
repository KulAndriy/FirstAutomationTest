package com.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By changeLanguageLocator = By.xpath("//a[@href='https://rozetka.com.ua/ua/']");
    private By signInButtonLocator = By.xpath("//a[@name='signin']");
    private By emailFieldLocator = By.xpath("//input[@name='login'][@type='text']");
    private By passwordFieldLocator = By.xpath("//input[@type='password'][@name='password']");
    private By loginButtonLocator = By.xpath("//button[text()='Увійти']");
    private By closeButtonLocator = By.xpath("//a[contains(text(),'Закрити')][@name='close']");
    private By searchFieldLocator = By.xpath("//input[@type='text'][@placeholder='Пошук']");

    public void clickUAButton(){
        driver.findElement(changeLanguageLocator).click();
        System.out.println("The language is ukrainian");
    }
    public void clickSignInButton(){
        driver.findElement(signInButtonLocator).click();
        System.out.println("Sign In button is clicked");
    }
    public  void typeEmail(String email) {
        WebElement login = driver.findElement(emailFieldLocator);
        login.click();
        login.clear();
        login.sendKeys(email);
        System.out.println("Email is entered");
    }
    public  void typePassword(String password) {
        WebElement login = driver.findElement(passwordFieldLocator);
        login.click();
        login.clear();
        login.sendKeys(password);
        System.out.println("Password is entered");
    }
    public  void clickLoginButton (){
        driver.findElement(loginButtonLocator).click();
    }
    public void clickCloseButton(){
        driver.findElement(closeButtonLocator).click();
    }
}

