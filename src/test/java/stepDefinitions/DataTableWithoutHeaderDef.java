package stepDefinitions;

import PageObject.Pom;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class DataTableWithoutHeaderDef {
WebDriver driver;

    @Given("You are in login page")
    public void you_are_in_login_page() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("You entered the below valid credentials")
    public void you_entered_the_below_valid_credentials(DataTable dataTable) { //dataTable
    List<String> credentials = dataTable.asList(String.class);
    String username =credentials.get(0);
   String password= credentials.get(1);
        // For other transformations you can register a DataTableType.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        Pom.UserName(driver).sendKeys(username);
        Pom.Password(driver).sendKeys(password);
    }

    @When("clicking on the login button")
    public void clicks_on_the_login_button() {
        Pom.LoginButton(driver).click();

    }

}