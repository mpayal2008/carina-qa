package com.solvd.web.amazon;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonSignInPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    private ExtendedWebElement signInSelector;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    private ExtendedWebElement emailIdOrPhoneNo;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    private ExtendedWebElement password;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    private ExtendedWebElement continueButton;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    private ExtendedWebElement signInButton;
    @FindBy(xpath = "//*[@id=\"auth-error-message-box\"]")
    private ExtendedWebElement error;

    protected AmazonSignInPage(WebDriver driver) {
        super(driver);

    }

    public void signInOption(){
        signInSelector.click();
    }
    public void enterEmailOrPhoneNo(String input){
        emailIdOrPhoneNo.type(input);
    }
    public void clickContinue(){
        continueButton.click();
    }
    public void enterPassword(String pswd){
        password.type(pswd);
    }
    public void clickSignInButton(){
        signInButton.click();
    }
    public boolean checkError(){
        return error.isPresent();
    }

}
