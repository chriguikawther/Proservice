package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePages {
	@FindBy(xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List<WebElement> menus;
	@FindBy(tagName="h6")
	WebElement verifMenu;
	
	public HomePages() {
		PageFactory.initElements(Config.driver, this);
	}
 public void clickOnMenuByName(String MenuName) throws Exception{
	 try {
		 Thread.sleep(3000);
		 for(WebElement menu: menus) {
			 if(menu.getText().contains(MenuName)) {
				 menu.click();
			 }
			 
		 }
		 
	 } catch (Exception e) {
		// TODO: handle exception
	}	
	 
 }
  public String verifTitle() {
	  String actuelText= verifMenu.getText();
	  return actuelText;
  }
 
}
