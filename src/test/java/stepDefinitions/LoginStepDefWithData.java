package stepDefinitions;

import PageObject.Pom;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginStepDefWithData {
WebDriver driver;
    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @When("^user enters valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_valid_credentials_and(String username, String password) throws Throwable {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        Pom.UserName(driver).sendKeys(username);
        Pom.Password(driver).sendKeys(password);

    }

    @When("^clicks on login button$")
    public void clicks_on_login_button() throws Throwable {
        Pom.LoginButton(driver).click();

    }

    @Then("^user should be navigated to home page$")
    public void user_should_be_navigated_to_home_page() throws Throwable {
        boolean status= Pom.Dashboardtext(driver).isDisplayed();
        System.out.println("User is on the home page "+status);
      //  driver.quit();

    }

}
