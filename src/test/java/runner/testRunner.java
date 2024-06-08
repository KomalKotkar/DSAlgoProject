package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(features = {"C:/Users/sagar/DSAlgoProject/src/test/java/features/test.feature"}, glue = {"stepDefinition"}
               )
    
public class testRunner extends AbstractTestNGCucumberTests {
    
}
      