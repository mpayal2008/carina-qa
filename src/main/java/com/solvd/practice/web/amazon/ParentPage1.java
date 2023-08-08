package com.solvd.practice.web.amazon;

import com.solvd.practice.web.amazon.components.SearchFilterComponents;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ParentPage1 extends AbstractPage {
    @FindBy(xpath =" ")
    private SearchFilterComponents searchFilterComponents;
    public ParentPage1(WebDriver driver) {
        super(driver);
    }
    public SearchFilterComponents getSearchFilterComponents() {
        return searchFilterComponents;
    }
}
