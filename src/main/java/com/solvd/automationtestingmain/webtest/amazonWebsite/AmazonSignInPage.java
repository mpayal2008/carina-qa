package com.solvd.automationtestingmain.webtest.amazonWebsite;


import com.solvd.automationtestingmain.webtest.ParentPage;
import com.solvd.automationtestingmain.webtest.components.WebpageComponents;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonSignInPage extends ParentPage {

    @FindBy(xpath = "//*[@id=\"auth-error-message-box\"]")
    private ExtendedWebElement error;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    private ExtendedWebElement  signInSelector;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    private ExtendedWebElement passwordField;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    public WebpageComponents signInTextField;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    public WebpageComponents continueButton;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    public WebpageComponents passwordTextField;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    public WebpageComponents signInButton;

    public AmazonSignInPage(WebDriver driver) {
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

 /*   public void enterPassword(String Data){

        passwordTextField.enterData(Data);
    }
  */
    public void clickSignInButton(){
        signInButton.clickButton();
    }
    public boolean checkError(){
        return error.isPresent();
    }

}
