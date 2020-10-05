package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/ajitalamsal/Documents/JavaTraining/FreeCRMBDDFramework/src/main/java/Features/login.feature"
		,glue= {"StepDefinations"},
		format= {"pretty","html:test-output"}
		)
		

public class TestRunner {
	

}
