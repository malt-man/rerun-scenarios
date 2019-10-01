
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "@target/cucumber/rerun.txt",
        glue = "glue",
        plugin = {"pretty",
                "json:target/cucumber/retries.json"})
public class FailedTestRunner extends AbstractTestNGCucumberTests {
}
