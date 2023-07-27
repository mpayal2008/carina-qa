package com.solvd.web.amazon;

import com.zebrunner.carina.core.IAbstractTest;
import io.appium.java_client.gecko.options.GeckoOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


@Test
public class AmazonTest implements IAbstractTest {
   String site_url= "https://www.amazon.com";

    @Test
    public void signInWithValidCredentials(){
        WebDriver driver = getDriver();
        driver.get(site_url);
        AmazonSignIn amazonSignIn = new AmazonSignIn(driver);
        amazonSignIn.open();
        Assert.assertTrue(amazonSignIn.isPageOpened(), "Amazon HomePage is not opened");
        amazonSignIn.signInOption();
        amazonSignIn.enterEmailOrPhoneNo("payalppatil.2008@gmail.com");
        amazonSignIn.clickContinue();
        amazonSignIn.enterPassword("PayalPatil");
        amazonSignIn.clickSignInButton();
        Assert.assertTrue(driver.getTitle().contains("Amazon"), "unsuccessful attempt ");
       // Assert.assertTrue(amazonSignIn.checkError(),"There is problem");
        driver.close();
    }


    @Test
    public void amazonSearch() {
        WebDriver driver = getDriver();
        driver.get(site_url);
        AmazonSearch amazonSearch= new AmazonSearch(driver);
        amazonSearch.open();
        Assert.assertTrue(amazonSearch.isPageOpened(), "Amazon HomePage is not opened");
        String data= "set of 4 notebooks";
        amazonSearch.enterSearchData(data);
        amazonSearch.clickSearchButton();
        Assert.assertTrue(driver.getTitle().contains(data), "Search page is not loading");

    }
}
