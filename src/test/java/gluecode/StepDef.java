package gluecode;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	
	RemoteWebDriver driver;
    WebDriverWait wait;
	
	@Given("open browser")
	public void openBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	}
	
	@When("launch site {string}")
	public void launchSite(String url)
	{
		driver.get(url);
	}
	
	@Then("verify page title {string}")
	public void verify_page_title(String expTitle) 
	{
	   String actualTitle= driver.getTitle();
	   
	   if(actualTitle.contains(expTitle))
	   {
		   System.out.println("test passed");
	   }
	   else
	   {
		   System.out.println("test failed");
	   }
	  
	}

	@When("close site")
	public void close_site()
	{
	   driver.quit();
	}

}
