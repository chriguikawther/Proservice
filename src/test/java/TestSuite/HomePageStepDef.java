package TestSuite;

import org.junit.Assert;

import Helper.Config;
import Pages.HomePages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	
	   
	

	@When("utilisateur clique sur le {string}")
	public void utilisateur_clique_sur_le(String menuName) throws Exception {
		HomePages menu= new HomePages();
		menu.clickOnMenuByName(menuName);
	   
	}

	@Then("la page de menu est affichee qui contient le nom de {string}")
	public void la_page_de_menu_est_affichee_qui_contient_le_nom_de(String expectedText) {
		HomePages page= new HomePages();
		Assert.assertEquals(expectedText, page.verifTitle());
		Config.driver.quit();
	    
	}


}
