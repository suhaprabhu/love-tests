package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import env.DriverUtil;
import com.loveholidays.actions.StartPageAction;
import com.loveholidays.methods.BaseTest;
import com.loveholidays.methods.TestCaseFailed;
import com.loveholidays.pages.StartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class StartProcessSteps implements BaseTest {

    private WebDriver driver = DriverUtil.getDefaultDriver();

    @Given("^I visit the offer summary page$")
    public void navigateTo() throws TestCaseFailed {
        StartPageAction.navigateToLH();
        PageFactory.initElements(driver, StartPage.class);
    }

    @And("^I go home$")
    public void startProcess ()  {
        StartPageAction.goHomeClick();
    }

    @And("I see the offer summary page again")
    public void checkPage() throws TestCaseFailed {
        StartPageAction.checkPage();
    }
}
