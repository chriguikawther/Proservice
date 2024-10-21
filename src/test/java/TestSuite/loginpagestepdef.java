package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.LoginPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpagestepdef {
	@Given("admin is in login page")
	public void admin_is_in_login_page() {
		Config.driver= new EdgeDriver();
		Config.edge();
		Config.maximizeWindow();
		String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
	   
	}
	@When("admin enter correct username {string} and correct password {string}")
	public void admin_enter_correct_username_and_correct_password(String name, String pwd) {
	   
		LoginPages page =new LoginPages();
		page.connect(name, pwd);
	} 
	

	@Then("admin is directed to the home page")
	public void admin_is_directed_to_the_home_page() {
	 
	}
	@When("admin enter incorrect username {string} and incorrect password {string}")
	public void admin_enter_incorrect_username_and_incorrect_password(String name, String pwd) {
		LoginPages page =new LoginPages();
		page.connect(name, pwd);
	    
	}

	@Then("admin in the login page that contenes message {string}")
	public void admin_in_the_login_page_that_contenes_message(String expectedText) {
		LoginPages text= new LoginPages();
		Assert.assertEquals(expectedText, text.verifMessage());
	    
	}

	

}
