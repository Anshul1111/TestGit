package StepDefinations;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//Hi Anshul
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "StepDefinations",
		plugin = {
					"pretty",
					"html:target/cucumber",
				}
		)

public class RunCukeTest {

	/*public static void main(String[] args) {

	}*/

}
