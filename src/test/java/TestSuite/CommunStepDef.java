package TestSuite;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.LoginPages;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	@Given("utilisateur est  connecte avec le bon username {string} et le bon password {string}")
	public void utilisateur_est_connecte_avec_le_bon_username_et_le_bon_password(String username, String pwd) {
	    Config.driver= new EdgeDriver();
	    Config.edge();
	    Config.maximizeWindow();
	    String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    Config.driver.get(url);
	    
	    LoginPages page= new LoginPages();
	    page.connect(username, pwd);
	}

}
