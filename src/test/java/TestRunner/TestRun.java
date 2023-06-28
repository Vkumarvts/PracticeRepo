package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Vikas\\eclipse-workspace\\BDD_Cucumber\\Features\\Simple\\LoginPage.feature",
		glue = "C:\\Users\\Vikas\\eclipse-workspace\\BDD_Cucumber\\src\\test\\java\\StepDefination"
		)
public class TestRun {
	
	
}