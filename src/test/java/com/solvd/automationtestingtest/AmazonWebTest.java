package com.solvd.automationtestingtest;


import com.solvd.automationtestingmain.webtest.amazonWebsite.AmazonCartPage;
import com.solvd.automationtestingmain.webtest.amazonWebsite.AmazonSearchPage;
import com.solvd.automationtestingmain.webtest.amazonWebsite.AmazonSignInPage;
import com.solvd.automationtestingmain.webtest.components.WebpageComponents;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

public class AmazonWebTest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    WebDriver driver = getDriver();

    //to test sign in with valid credentials
    @Test
    public void testAmazonSignIn()  {
        AmazonSignInPage amazonSignInPage= new AmazonSignInPage(driver);
        amazonSignInPage.open();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebpageComponents webpageComponents= amazonSignInPage.getWebpageComponents();
        amazonSignInPage.clickSignInOption();
        amazonSignInPage.enterEmailOrPhoneNo("payalppatil.2008@gmail.com");
        amazonSignInPage.clickContinue();
        amazonSignInPage.enterPassword("PayalPatil");
        amazonSignInPage.clickSignInButton();
        Assert.assertTrue(driver.getTitle().contains("Amazon"), "unsuccessful attempt");
    }
    //to test Amazon search field
    @Test
    public void testAmazonSearch() {
        AmazonSearchPage amazonSearchPage = new AmazonSearchPage(driver);
        amazonSearchPage.open();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebpageComponents webpageComponents = amazonSearchPage.getWebpageComponents();
        amazonSearchPage.enterSearchData("notebooks");
        amazonSearchPage.clickSearchButton();
        Assert.assertTrue(driver.getTitle().contains("notebooks"), "test fails");
    }
    //to test sorting search option with sort by avg reviews
    @Test
    public void testAmazonSearchSorting() {
        AmazonSearchPage amazonSearchPage = new AmazonSearchPage(driver);
        amazonSearchPage.open();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebpageComponents webpageComponents = amazonSearchPage.getWebpageComponents();
        amazonSearchPage.enterSearchData("notebooks");
        amazonSearchPage.clickSearchButton();
        amazonSearchPage.setSelectSortOption();
    }
    /*
    //need to work on xpath with data index
    //to test add to cart with first search item in displayed products
    @Test
    public void testAddToCart(){
        AmazonAddToCartOption AmazonAddToCartOption= new AmazonAddToCartOption(driver);
        AmazonAddToCartOption.open();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        AmazonAddToCartOption.enterSearchData("kids headphones for school");
        AmazonAddToCartOption.clickSearchButton();
        AmazonAddToCartOption.selectItemToAddToCart();
        AmazonAddToCartOption.addToCart();
    }
    */
    @Test
    public void testDeselectAllCartItems(){
        AmazonCartPage amazonCartPage =new AmazonCartPage(driver);
        amazonCartPage.open();
        amazonCartPage.clickSignInOption();
        amazonCartPage.enterEmailOrPhoneNo("payalppatil.2008@gmail.com");
        amazonCartPage.clickContinue();
        amazonCartPage.enterPassword("PayalPatil");
        amazonCartPage.clickSignInButton();
        amazonCartPage.openCartLink();
        amazonCartPage.deselectAllCartItems();
        String message= driver.findElement(By.xpath(" \"//*[@id=\\\"sc-subtotal-label-buybox\\\"]\"")).getText();
        Assert.assertEquals(message, "No items selected");
    }

}




