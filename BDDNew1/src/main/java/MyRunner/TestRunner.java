package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= "C:\\Users\\shaikh\\eclipse-workspace\\BDDNew1\\src\\main\\java\\features"
		,glue= {"stepDefinations"}
		
	
		)

public class TestRunner {

}
