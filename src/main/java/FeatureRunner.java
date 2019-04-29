
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/main/java/",
        glue = "glue",
        plugin = {"pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber/example.json"})
public class FeatureRunner extends AbstractTestNGCucumberTests {
}
