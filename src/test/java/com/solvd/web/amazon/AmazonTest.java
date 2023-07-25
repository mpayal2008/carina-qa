package com.solvd.web.amazon;

import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test
public class AmazonTest implements IAbstractTest {
   String site_url= "https://www.amazon.com";
    @Test
    public void signInWithValidCredentials(){
     //   AmazonSignIn amazonSignIn= initPage(getDriver(), AmazonSignIn.class);
        WebDriver driver=getDriver();
        driver.get(site_url);
        AmazonSignIn amazonSignIn= new AmazonSignIn(driver);
        amazonSignIn.open();
        Assert.assertTrue(amazonSignIn.isPageOpened(), "Amazon HomePage is not opened");
        amazonSignIn.signInOption();
        amazonSignIn.enterEmailOrPhoneNo("payalppatil.2008@gmail.com");
        amazonSignIn.clickContinue();
        amazonSignIn.enterPassword("PayalPatil");
        amazonSignIn.clickSignInButton();
        Assert.assertTrue(driver.getTitle().contains("Amazon"), "unsuccessful attempt ");
       // Assert.assertTrue(amazonSignIn.checkError(),"There is problem");
    }
}
