package com.solvd.web.amazon;

import com.solvd.web.amazon.components.SearchFilterComponents;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ParentPage extends AbstractPage {
    @FindBy(xpath =" ")
    private SearchFilterComponents searchFilterComponents;
    public ParentPage(WebDriver driver) {
        super(driver);
    }
    public SearchFilterComponents getSearchFilterComponents() {
        return searchFilterComponents;
    }
}
