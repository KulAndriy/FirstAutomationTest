package com.rozetka.test;

import com.rozetka.pages.MainPage;
import com.rozetka.settings.FireFoxSettings;
import org.testng.annotations.Test;

    public class RozetkaTest extends FireFoxSettings {

    @Test
    public void searchMacBook() {
        MainPage mainPage = new MainPage(driver1);
        mainPage.clickUAButton();
        mainPage.clickSignInButton();
        mainPage.typeEmail(userEmail);
        mainPage.typePassword(userPassword);
        mainPage.clickLoginButton();
        mainPage.clickCloseButton();
    }
}
