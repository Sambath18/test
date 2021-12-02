package HCL_Training.HCL_Training;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step1 {

	
	@Given("OpenBrowser")
	public void openbrowser() {
	    System.out.println("browser opened");
	}

	@When("Username&password")
	public void username_password() {
		System.out.println("Enter username & password");
	}

	@Then("I validate output")
	public void i_validate_output() {
		System.out.println("verified");
	}


}
