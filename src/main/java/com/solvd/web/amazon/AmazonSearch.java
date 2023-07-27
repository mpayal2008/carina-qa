package com.solvd.web.amazon;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonSearch extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    private ExtendedWebElement searchField;
    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    private ExtendedWebElement searchButton;
    protected AmazonSearch(WebDriver driver) {
        super(driver);
    }
    public void enterSearchData(String data){
        searchField.type(data);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
}
