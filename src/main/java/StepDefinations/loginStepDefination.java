package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginStepDefination {
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/ajitalamsal/Downloads/chromedriver");
	 driver=new ChromeDriver();
		
		driver.manage().window().maximize();//maximize window
		driver.manage().deleteAllCookies();//delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com");
	    
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
		
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.name("email")).sendKeys("ajitalamsal1129@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Purplecandy01");
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
       driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();

	    
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage()  {
		String title2=driver.getTitle();
		System.out.println(title2);
		Assert.assertEquals(title2, "Cogmento CRM");
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
		
		
		
	    
	}



}
