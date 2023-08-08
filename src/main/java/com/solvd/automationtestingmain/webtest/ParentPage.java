package com.solvd.automationtestingmain.webtest;

import com.solvd.automationtestingmain.webtest.components.WebpageComponents;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ParentPage extends AbstractPage {
   // @FindBy(xpath = " ")
    public WebpageComponents WebpageComponents;

    public WebpageComponents getWebpageComponents() {
        return WebpageComponents;
    }

    public ParentPage(WebDriver driver) {
        super(driver);
    }
}
