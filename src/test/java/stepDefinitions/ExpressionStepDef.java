package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class ExpressionStepDef {
    @Given("^I have (\\d+) laptop$")
    // (\\d+) is a regular expression that captures the number of laptops
    public void I_have_1_laptop(int count) throws Throwable {
        System.out.println("I have 1 laptop"+count);
    }
    @Given("^I have a (\\d+\\.\\d+) CGPA$")
    public void i_have_a_CGPA(float num) throws Throwable {
    System.out.println("CGPA"+num);
    }
    @Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
    // \"(.*?)\" is a regular expression that captures the names of the people
    public void is_elder_to_and(String arg1, String arg2, String arg3) throws Throwable {
        System.out.println(arg1+" is elder to "+arg2+" and "+arg3);
    }
}
