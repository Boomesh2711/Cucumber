package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "featureFiles/LoginWithData.feature",
        glue = "stepDefinitions"
)
public class RunnerClass {

    // it should combine the features and step definitions
    // it should run the tests

}
