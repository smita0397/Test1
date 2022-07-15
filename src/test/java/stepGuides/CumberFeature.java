package stepGuides;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CumberFeature {
	
	@Given("application is online")
	public void application_is_online() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Application is deployed on server");
	}

	@When("application url {string} opens")
	public void application_url_opens(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Application launched by url: "+string);
	}

	@When("user able to search product.")
	public void user_able_to_search_product() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is able to search products");
	}


}
