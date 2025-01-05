package stepDefinitions;
import PageObject.Pom;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Map;
public class DataTableWithExample {
WebDriver driver;
    @Given("^Using Example to login$")
    public void using_Example_to_login() throws Throwable {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String username, String password) throws Throwable {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        Pom.UserName(driver).sendKeys(username);
        Pom.Password(driver).sendKeys(password);

    }

    @Then("^Login should be when i click signin$")
    public void login_should_be_when_i_click_signin() throws Throwable {
        Pom.LoginButton(driver).click();

    }



}
