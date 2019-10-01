
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/main/java/Example.feature",
        glue = "glue",
        plugin = {"pretty",
                "json:target/cucumber/firstRunResults.json",
                "rerun:target/cucumber/rerun.txt"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
