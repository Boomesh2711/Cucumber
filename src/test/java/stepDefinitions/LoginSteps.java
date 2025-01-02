package stepDefinitions;

import PageObject.Pom;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginSteps {
    WebDriver driver;
    @Given("^user is on the login page$")
    public void user_is_on_login_page() throws Throwable {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("^user enters valid username and password$")
    public void user_enters_valid_username_and_password() throws Throwable {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        Pom.UserName(driver).sendKeys("Admin");
        Pom.Password(driver).sendKeys("admin123");

    }

    @When("^clicks on the login button$")
    public void clicks_on_the_login_button() throws Throwable {
        Pom.LoginButton(driver).click();

    }

    @Then("^user should be navigated to the home page$")
    public void user_should_be_navigated_to_the_home_page() throws Throwable {
       boolean status= Pom.Dashboardtext(driver).isDisplayed();
        System.out.println("User is on the home page "+status);
        driver.quit();

    }
}
