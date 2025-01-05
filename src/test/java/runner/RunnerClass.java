package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "featureFiles",
        glue = "stepDefinitions",
        dryRun = true,
        format = {"html:target/cucumber-reports", "json:target/cucumber.json"}
)
public class RunnerClass {
    // This is the runner class
    // it should combine the features and step definitions
    // it should run the tests
}
