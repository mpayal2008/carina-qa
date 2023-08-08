package com.solvd.automationtestingmain.webtest.amazonWebsite;


import com.solvd.automationtestingmain.webtest.ParentPage;
import com.solvd.automationtestingmain.webtest.components.WebpageComponents;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonCartPage extends ParentPage {
    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    public WebpageComponents openCartLink;
    @FindBy(xpath = "//*[@id=\"deselect-all\"]")
    private ExtendedWebElement deselectAll;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    private ExtendedWebElement  signInSelector;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    private ExtendedWebElement passwordField;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    public WebpageComponents signInTextField;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    public WebpageComponents continueButton;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    public WebpageComponents signInButton;
    @FindBy(xpath = "//*[@id=\"sc-subtotal-label-buybox\"]")
    private WebElement message1;
    public AmazonCartPage(WebDriver driver) {
        super(driver);
    }
    public void clickSignInOption(){
        signInSelector.click();
    }
    public void enterEmailOrPhoneNo(String Data){
        signInTextField.enterData(Data);
    }
    public void clickContinue(){
        continueButton.clickButton();
    }
    public void enterPassword(String Data){
        passwordField.type(Data);
    }
    public void clickSignInButton(){
        signInButton.clickButton();
    }
    public void openCartLink(){
        openCartLink.clickButton();
    }
    public void deselectAllCartItems(){
        deselectAll.click();
    }
}
