package com.solvd.automationtestingmain.mobiletesting.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WelcomePageBase extends AbstractPage {
    protected WelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginPageBase clickNextBtn();
}
