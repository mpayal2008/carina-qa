package com.solvd.practice.web.amazon;

import com.solvd.practice.web.amazon.components.SearchFilterComponents;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


@Test
public class AmazonTest implements IAbstractTest {
    String data = "set of 4 notebooks";
    WebDriver driver = getDriver();
    @Test
    public void testsignInWithValidCredentials() throws InterruptedException {

        AmazonSignInPages amazonSignIn = new AmazonSignInPages(driver);
        amazonSignIn.open();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        amazonSignIn.signInOption();
        amazonSignIn.enterEmailOrPhoneNo("payalppatil.2008@gmail.com");
        amazonSignIn.clickContinue();
        amazonSignIn.enterPassword("PayalPatil");
        amazonSignIn.clickSignInButton();
        Assert.assertTrue(driver.getTitle().contains("Amazon"), "unsuccessful attempt ");

    }
    @Test
    public void testAmazonSearch() throws InterruptedException {
        AmazonSearchPages amazonSearch = new AmazonSearchPages(driver);
        amazonSearch.open();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        amazonSearch.enterSearchData(data);
        amazonSearch.clickSearchButton();
        Assert.assertTrue(driver.getTitle().contains(data), "Search page is not loading");
    }
    @Test
    public void testSearchFilter() throws InterruptedException {
        AmazonSearchFilters amazonSearchFilters= new AmazonSearchFilters(driver);
        amazonSearchFilters.open();
        Thread.sleep(10000);
        SearchFilterComponents searchFilterComponents= amazonSearchFilters.getSearchFilterComponents();
        amazonSearchFilters.enterSearchData(data);
        searchFilterComponents.clickSearchButton();
        amazonSearchFilters.selectSearchPriceFilter();
    }

}
