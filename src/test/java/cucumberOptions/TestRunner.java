package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*The first two options (features and glue) are enough to run the cucumber tests!
 features --> is the location folder where the feature files are located
 glue --> attaches the stepdefinition file
 * The tag attribute --> will run the test associate with the tags
 * Tags --> is a good way to control what tests need to be run
 * plugin --> element will allow to generate html reports json reports and junit reports in Jenkins
 * { means to generate a report in pretty format
 * location --> of the report will be located in this location when the test is run html:target/cucumber
 * if you need to report to be generate in json format add this "html:target/cucumber","json:target/cucumber.json"
 * dryrun --> attribute will scan the feature file to check if the tests are implemented
   dryrn --> NOTE: when running the tests don't add the "dryrun" as tests will be skipped!
*/
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue="MyStepDefenition",tags ="@SeleniumTest",strict =true,monochrome =true,
		plugin= {"pretty", "html:target/cucumber","json:target/cucumber.json","junit:target/cuckes.xml"})

public class TestRunner {

}
