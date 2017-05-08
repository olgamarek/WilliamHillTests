package williamhill;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Class which run tests
 * @author Olga Marek
 * 
 */
@RunWith(Cucumber.class) 
@CucumberOptions(
	      plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"}
	)
public class runTest { }




