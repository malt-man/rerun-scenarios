package glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static org.testng.Assert.*;


public class MyStepsDefinitions {

    private int total;

    @Given("{int} cucumber")
    public void numberofCucumbers(int cucumbers) {

        System.out.println("Starting count of cucumbers");
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
