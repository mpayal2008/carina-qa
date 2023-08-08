package com.solvd.practice.web.amazon.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchFilterComponents extends AbstractUIObject {

    @FindBy(id="1")
    private ExtendedWebElement searchButton;

    public SearchFilterComponents(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

}
