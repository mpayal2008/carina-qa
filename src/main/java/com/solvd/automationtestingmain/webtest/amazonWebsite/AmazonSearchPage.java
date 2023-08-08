package com.solvd.automationtestingmain.webtest.amazonWebsite;


import com.solvd.automationtestingmain.webtest.ParentPage;
import com.solvd.automationtestingmain.webtest.components.WebpageComponents;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchPage extends ParentPage {
    @FindBy(css = ".a-dropdown-label")
    private ExtendedWebElement sortByDropDown;
    @FindBy(xpath = "//*[@id=\"s-result-sort-select_3\"]")
    private ExtendedWebElement selectSortOption;
    @FindBy(id= "twotabsearchtextbox")
    private ExtendedWebElement searchField;
    @FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
    public WebpageComponents searchButton;

    public AmazonSearchPage(WebDriver driver) {
        super(driver);
    }
    public void enterSearchData(String data){
        searchField.type(data);
    }
    public void clickSearchButton(){
        searchButton.clickButton();
    }
    public void setSelectSortOption(){
        sortByDropDown.click();
        selectSortOption.click();
    }
}
