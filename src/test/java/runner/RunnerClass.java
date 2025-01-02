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
// for git hub create a new repository to push the code
    // it should combine the features and step definitions
    // it should run the tests

}
