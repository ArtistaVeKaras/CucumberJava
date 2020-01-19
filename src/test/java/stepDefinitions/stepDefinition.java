package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(Cucumber.class)
public class stepDefinition {
	
    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Validate the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered!");

    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Browser is started!");

    }

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    		System.out.println("Navigating to the Url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
		System.out.println("Logged in sucess ");

    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
		System.out.println("Validated Home page");

    }
    
    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username);
        System.out.println(password);
    }


    @Then("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) throws Throwable {
    	System.out.println(arg1);
    }

  //Extra data from a Datatable when you have many arguments
    @When("^User sign in with the following details$")
    public void user_sign_in_with_the_following_details(DataTable data) throws Throwable {
    	
    	//this object will get the first obj in each row
    	List<List<String>> obj=data.raw();
    	
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));

    }
    
    @When("^User login in to the application with (.+) and (.+)$")
    public void user_login_in_to_the_application_with_and(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);

    
    }

}