package ing.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/nandinimallap.prasa/workspace/FirstCry/src/test/resources/Features/BangaloreCenters.feature",
		glue={"glueStepdef"},
		plugin = {"pretty","html:target/sample.html" },
		strict = false
		//monochrome=true
		//,tags = {"@Regression"}
		)
public class TestRunner {
	
	}
