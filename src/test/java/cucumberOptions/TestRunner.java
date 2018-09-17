package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", //---features = "src/test/java/features/Login.feature" -- for one feature only
						glue = "stepDefinition" , 
						tags = "@PortalTest",  //-- tags = "@SmokeTest,@RegTest,@Sanity", //--- optional
						dryRun=true,  //---optional, checks only whether the TCs are mapped with stepDefinitions, but will skip TCs
						monochrome = true, //---optional, gives readable output in Console report
						strict = true,  //---optional, shows unmapped  
						plugin = {"pretty",  //---optional, for readable report
								"html:target/cucumber",		 //---optional, for HTML report
								"json:target/cucumber.json",  //---optional, for json report for developers
								"junit:target/cukes.xml"})	  //---optional, for xml report	for Jenkins

public class TestRunner {

}
