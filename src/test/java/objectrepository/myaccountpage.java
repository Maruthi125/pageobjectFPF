package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccountpage {
	
	WebDriver driver;
	
	public myaccountpage(WebDriver driver) {
		this.driver  = driver;
		PageFactory.initElements(driver, this);

		
	}

	@FindBy(xpath="//body/div[@id='account-account']/ul[1]/li[2]/a[1]")
	private WebElement account;
	
	
	
	 
	 public WebElement account () {
		 
		 return account;
		 
	 }

}
