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

public class DataTableWithHeaderDef {
    WebDriver driver;

    @Given("You are in signin page")
    public void you_are_in_signin_page() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("You entered the below valid cred")
    public void you_entered_the_below_valid_cred(DataTable dataTable) {
        List <Map<String, String> >Keyvalue= dataTable.asMaps(String.class, String.class); //Storing the data in a list of map
        String username=  Keyvalue.get(0).get("username"); //Fetching the value from the map
        String password=    Keyvalue.get(0).get("password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        Pom.UserName(driver).sendKeys(username);
        Pom.Password(driver).sendKeys(password);
    }

    @When("clicking on the signin button")
    public void clicking_on_the_signin_button() {
        Pom.LoginButton(driver).click();

    }

}
