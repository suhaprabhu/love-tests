package stepDefinitions;

import com.loveholidays.actions.HomePageAction;
import com.loveholidays.actions.StartPageAction;
import com.loveholidays.methods.BaseTest;
import com.loveholidays.methods.TestCaseFailed;
import com.loveholidays.pages.HomePage;
import com.loveholidays.pages.StartPage;
import cucumber.api.TestCase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import env.DriverUtil;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePageSteps implements BaseTest {
    private WebDriver driver = DriverUtil.getDefaultDriver();

    public HomePageSteps() {
        PageFactory.initElements(driver, HomePage.class);
    }

    @And("I check still interested section for {string}")
    public void loadPage(String hotelName) throws TestCaseFailed {
        HomePageAction.setHotelName(hotelName);
    }

    @And("^I book the room$")
    public void bookRoom() throws TestCaseFailed {
        HomePageAction.bookRoom();
    }

    @And("I select destination {string}")
    public void selectDestination(String dest) throws TestCaseFailed {
        HomePageAction.selectDestination();
    }

    @Given("^I visit the home page$")
    public void navigateTo() throws TestCaseFailed {
        HomePageAction.navigateHome();
    }

}
