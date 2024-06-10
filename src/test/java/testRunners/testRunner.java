package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(features = {"C:/Users/sagar/DSAlgoProject/src/test/resources/features/test.feature"}, glue = {"stepDefinition","appHooks"}
               )
    
public class testRunner extends AbstractTestNGCucumberTests {
    
}
      