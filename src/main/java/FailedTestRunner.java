
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "glue",
        plugin = {"pretty",
                "json:target/cucumber/retries.json"})
public class FailedTestRunner extends AbstractTestNGCucumberTests {
}
