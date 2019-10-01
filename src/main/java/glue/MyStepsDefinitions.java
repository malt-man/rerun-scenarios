package glue;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.testng.Assert.*;


public class MyStepsDefinitions {

    private int total;

    @Before()
    public void setup (Scenario scenario) {
        System.out.println("Starting scenario: " + scenario.getName());
    }

    @Given("{int} cucumber")
    public void numberofCucumbers(int cucumbers) {

        total = cucumbers;
    }

    @When("{int} cucumber(s) are added")
    public void cucumbersAreAdded(int moreCucumbers) {

        total = total + moreCucumbers;
    }

    @Then("number of cucumber(s) is {int}")
    public void totalNumberOfCucumbersIs(int cucumbers) {

        assertEquals(total, cucumbers, "Total number of cucumbers is incorrect!");
    }
}
