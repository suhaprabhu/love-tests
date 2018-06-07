package com.loveholidays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage extends BasePage {

    public static String hotelNameString;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how=How.CSS, using=".return-to-offer-large__details__name")
    public static WebElement hotelName;

    @FindBy(how=How.CSS, using="a.custom-button__link.custom-button__link--semantic-primary.custom-button__link--garnish-forward.custom-button__link--size-large")
    public static WebElement hotelButton;

    @FindBy(how=How.CSS, using="div.return-to-offer-large__cta")
    public static WebElement hotelSection;

    @FindBy(how=How.ID, using="searchUnitDestinationInput")
    public static WebElement destinationInput;

    @FindBy(how=How.CSS, using="li.select-list__list__element")
    public static List<WebElement> destinationList;


    @FindBy(how=How.CLASS_NAME, using="autocomplete__input")
    public static WebElement autoInput;

    @FindBy(how=How.CLASS_NAME, using="link-input")
    public static WebElement dateInput;

    // FIXME: Move this to utils and should be straightforward to compose this date format string
    @FindBy(how=How.CSS, using="time[datetime='2018-6-8']")
    public static WebElement aDate;

    @FindBy(how=How.CSS, using="a.custom-button__link.custom-button__link--semantic-primary.custom-button__link--garnish-forward.custom-button__link--size-large")
    public static WebElement search;

}
