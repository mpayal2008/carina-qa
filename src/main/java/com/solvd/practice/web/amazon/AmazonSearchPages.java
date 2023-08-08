package com.solvd.practice.web.amazon;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchPages extends AbstractPage {

    @FindBy(id = "twotabsearchtextbox")
    private ExtendedWebElement searchTextField;
    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    private ExtendedWebElement searchButton;
    public void enterSearchData(String data){
        searchTextField.type(data);
    }

    public AmazonSearchPages(WebDriver driver) {
        super(driver);
    }
    public void enterSearchContent(String data){
        searchTextField.type(data);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
}
