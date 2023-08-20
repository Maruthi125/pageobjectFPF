package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="input-email")
	private WebElement emialfield;
	
	
	@FindBy(id="input-password")
	private WebElement passwordfield;
	
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement loginbutton;
	
	 
	 
	 public WebElement emialfield () {
		 
		 return emialfield;
	 }
	
	
	public WebElement passwordfield() {
		
		return passwordfield;
	}
	
	public WebElement loginbutton(){
		
		return loginbutton;
	}
	
	
	
}
