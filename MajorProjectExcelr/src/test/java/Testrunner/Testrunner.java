package Testrunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/Featurefiles"}
		,glue={"Stepdefinitions"}
		,plugin= {"pretty", "html:Extentreport/index.html"}
		,tags= "@Buynewitem"
		,monochrome=true
		)

public class Testrunner {

}
