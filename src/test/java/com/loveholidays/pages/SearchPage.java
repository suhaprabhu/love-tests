package com.loveholidays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.CSS, using="a.custom-button__link custom-button__link--semantic-primary  custom-button__link--garnish-forward custom-button__link--size-small")
    public static WebElement checkAvail;

}
