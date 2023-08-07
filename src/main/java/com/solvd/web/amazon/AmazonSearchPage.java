package com.solvd.web.amazon;

import com.solvd.web.amazon.components.SearchFilterComponents;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchPage extends AbstractPage {

    @FindBy(id = "twotabsearchtextbox")
    private ExtendedWebElement searchTextField;
    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    private ExtendedWebElement searchButton;
    public void enterSearchData(String data){
        searchTextField.type(data);
    }

    public AmazonSearchPage(WebDriver driver) {
        super(driver);
    }
    public void enterSearchContent(String data){
        searchTextField.type(data);
    }
    public void clickSearchButton(){
        searchButton.click();
    }
}
