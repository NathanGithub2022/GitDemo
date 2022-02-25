package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)

@CucumberOptions(
        features ="src/test/java/Features",
        glue = "stepDefinitions")


public class testRunner extends AbstractTestNGCucumberTests {

}
