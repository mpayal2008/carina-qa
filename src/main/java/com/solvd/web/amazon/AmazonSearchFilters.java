package com.solvd.web.amazon;

import com.solvd.web.amazon.components.SearchFilterComponents;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchFilters extends ParentPage {
    @FindBy(id="p_36/1253550011")
    ExtendedWebElement searchFilterPrice;
    @FindBy(id = "twotabsearchtextbox")
    ExtendedWebElement searchTextField ;
    @FindBy(xpath = "//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div[1]/div/div")
    ExtendedWebElement selectSearchOption;
 //   @FindBy(xpath = " //*[@id=\"nav-search-submit-button\"]")
    @FindBy(xpath = "//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div[1]/div/div")
    public SearchFilterComponents searchButton;
    public AmazonSearchFilters(WebDriver driver) {
        super(driver);
    }
    public void enterSearchData(String data){
        searchTextField.type(data);
      //  selectSearchOption.click();
    }
    public void selectSearchPriceFilter(){
        searchFilterPrice.click();
    }
}
