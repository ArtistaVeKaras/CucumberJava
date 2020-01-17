package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*The first two options (features and glue) are enough to run the cucumber tests!
 * The tags element will run the test associate with the tags
 * Tags is a good way to control what test need to be run
 * The { plugin } element will allow to generate html reports
 * { means to generate a report in pretty format
 * location of the report is located in this location html:target/cucumber
 * if you need to report to be generate in json format add this "html:target/cucumber","json:target/cucumber.json"
*/
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="stepDefinitions",tags="@PortalTest",
		plugin= {"pretty", "html:target/cucumber","json:target/cucumber.json"})

public class TestRunner {

}
