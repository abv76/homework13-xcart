package com.xcart.mobile.homepage;

import com.xcart.mobile.Testbase.TestBase;
import com.xcart.mobile.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage=new HomePage();
    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        String expectedResult="Shipping";
        Assert.assertEquals(expectedResult,homePage.setVerifyPage(),"You are not on Expected Page");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewLink();
        String expectedResult="New arrivals";
        Assert.assertEquals(expectedResult,homePage.setVerifyPage(),"You are not on Expected Page");
    }
    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){
        homePage.clickOnComingSoonLink();
        String expectedResult="Coming soon";
        Assert.assertEquals(expectedResult,homePage.setVerifyPage(),"You are not on Expected Page");
    }
    @Test
    public void  verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsPage();
        String expectedResult="Contact us";
        Assert.assertEquals(expectedResult,homePage.setVerifyPage(),"You are not on Expected Page");
    }
}
