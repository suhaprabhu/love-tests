package com.loveholidays.actions;

import com.loveholidays.methods.BaseTest;
import com.loveholidays.pages.HomePage;
import com.loveholidays.pages.StartPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;

public class HomePageAction implements BaseTest {

    public static void checkElements() {
        new WebDriverWait(HomePage.driver, 10).until(ExpectedConditions.visibilityOf(HomePage.hotelSection));
        Assert.assertEquals(HomePage.hotelName.getText(), HomePage.hotelNameString);

    }
    public static void goHomeClick(){
        HomePage.hotelButton.click();
    }
    public static void bookRoom() {
        HomePage.hotelButton.click();
    }

    public static void setHotelName(String hotelName) {
        HomePage.hotelNameString = hotelName;
    }

    public static void navigateHome() {
        navigationObj.navigateTo("https://www.loveholidays.com");
    }

    public static void visible(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(HomePage.driver, 30);
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {

        }

    }
    public static void moveToElement(String element) {
        Actions act = new Actions(HomePage.driver);
        act.moveToElement(HomePage.driver.findElement(By.className(element))).click().build().perform();
    }
    public static void selectDestination() {
        HomePage.destinationInput.click();
        List<WebElement> ddDestination = HomePage.destinationList;
        for (int i = 0; i < ddDestination.size(); i++) {
            String dropdowndestination = (ddDestination.get(i)).getText();
            System.out.println("option value :" + dropdowndestination);
            if (dropdowndestination.contentEquals("Spain")) {
                visible(ddDestination.get(i));
                (ddDestination.get(i)).click();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
            }
        }
        WebElement location = HomePage.autoInput;
        moveToElement("autocomplete__input");
        location.click();
    }
}

