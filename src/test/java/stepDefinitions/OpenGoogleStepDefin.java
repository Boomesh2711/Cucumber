package stepDefinitions;

import PageObject.Pom;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenGoogleStepDefin {

    //  WebDriverManager.edgedriver().setup();
    WebDriver driver;

    @Given("^user is entering google\\.com$")
    public void user_is_entering_google_com() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new EdgeDriver();
        driver.get("https://www.google.co.in");

    }

    @When("^user is typing the search term \"([^\"]*)\"$")
    public void user_is_typing_the_search_term(String searchterm) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Pom.BrowserElement(driver).sendKeys(searchterm);
    }

    @When("^user is pressing the search button$")
    public void user_is_pressing_the_search_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Pom.BrowserElement(driver).sendKeys(Keys.RETURN);

    }

    @Then("^I should see \"([^\"]*)\" in search results$")
    public void i_should_see_in_search_results(String searchterm) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean result = driver.findElement(By.partialLinkText("Cucumber")).isDisplayed();
        if (result) {
            System.out.println("Test Passed" + result);
            System.out.println("Cucumber is displayed in search results");

        }

    }
}
