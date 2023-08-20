package ppack;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.loginpage;
import objectrepository.myaccountpage;

public class loginTest {
	WebDriver driver;
	
	
	@Test
	public void login() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		loginpage loginpage = new loginpage(driver);
		loginpage.emialfield().sendKeys("987@gmail.com");
		Thread.sleep(2000);

		loginpage.passwordfield().sendKeys("12345");
		Thread.sleep(2000);

		loginpage.loginbutton().click();
		Thread.sleep(2000);


     myaccountpage  myaccountpage = new myaccountpage(driver);
     
     Assert.assertTrue(myaccountpage.account().isDisplayed());
		Thread.sleep(2000);


   	
	}
	
	@AfterMethod
	public void closure() {
		driver.close();
		
	}

}
