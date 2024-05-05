package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/src/main/java/Features/features.feature",
        glue = {"/src/main/java/StepDefinition/StepDefinitionClass.java" , "/src/main/java/Utilities/ReadProperties.java"}
)
public class TestRunner {

}
