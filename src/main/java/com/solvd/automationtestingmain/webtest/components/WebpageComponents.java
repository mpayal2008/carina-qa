package com.solvd.automationtestingmain.webtest.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WebpageComponents extends AbstractUIObject {

    @FindBy(xpath = "//input[@type='submit']")
    private ExtendedWebElement button;
    @FindAll({
            @FindBy(xpath = "//*[contains(@id, 'ap_')]"),
            @FindBy(id= "twotabsearchtextbox")
    })
    public ExtendedWebElement textBox;
    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    public ExtendedWebElement cart;
    public WebpageComponents(WebDriver driver, SearchContext searchContext) {

        super(driver, searchContext);
    }
    public void clickButton(){
        button.click();
    }
    public void enterData(String data){
 //     textBox.findExtendedWebElement(By.xpath("//*[contains(@id, 'ap_')]")).getElement().clear();
        textBox.type(data);
    }
    public void openCart(){
        cart.click();
    }
}
