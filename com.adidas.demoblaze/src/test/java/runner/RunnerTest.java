package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
				"pretty",
				"html:target/cucumber-reports",
				"json:target/cucumber.json",

		},
		features = {"src/test/resources/features" },
		glue = { "stepdefinitions" },
		tags = { "@Regression" }
		
)
public class RunnerTest {
		
}
