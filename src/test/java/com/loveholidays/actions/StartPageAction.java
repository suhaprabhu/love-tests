package com.loveholidays.actions;

import com.loveholidays.methods.BaseTest;
import com.loveholidays.methods.TestCaseFailed;

public final class StartPageAction implements BaseTest {

    public static void navigateToLH() throws TestCaseFailed {
        navigationObj.navigateTo("https://www.loveholidays.com/book/flight-and-hotel/offer-summary.html?shortref=LA9YVPJH&amp;state=AwoUKFAAIKSCaCeCjLYYEIABgHA");
        assertionObj.checkTitle("Offer Summary | loveholidays",true);
    }

    public static void goHomeClick() {
        // Wait for the data to load
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ie) {

        }
        // This is opening in a new window
        // StartPage.homeLink.click();
        HomePageAction.navigateHome();
    }

    public static void checkPage() throws TestCaseFailed {
        assertionObj.checkTitle("Offer Summary | loveholidays",true);
    }
}
