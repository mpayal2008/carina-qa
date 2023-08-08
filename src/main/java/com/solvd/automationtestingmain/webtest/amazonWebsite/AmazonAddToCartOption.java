package com.solvd.automationtestingmain.webtest.amazonWebsite;


import com.solvd.automationtestingmain.webtest.ParentPage;
import com.solvd.automationtestingmain.webtest.components.WebpageComponents;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonAddToCartOption extends ParentPage {

    @FindBy(xpath = "//div[@data-index='4']")
    private ExtendedWebElement firstSearchResult;
    @FindBy(id="#add-to-cart-button")
    private ExtendedWebElement addToCartButton;

    @FindBy(id= "twotabsearchtextbox")
    private ExtendedWebElement searchField;
    @FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
    public WebpageComponents searchButton;

    public AmazonAddToCartOption(WebDriver driver) {
        super(driver);
    }

    public void enterSearchData(String data){

        searchField.type(data);
    }
    public void clickSearchButton(){

        searchButton.clickButton();
    }
    public void selectItemToAddToCart(){
        firstSearchResult.click();
    }
    public void addToCart(){
        addToCartButton.click();
    }
}


