package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("This is Given Statement");
	    }

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("This is When Statement");
	    
	    }

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("This is Then Statement");
	    
	    }

}