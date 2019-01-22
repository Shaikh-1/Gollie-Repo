package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
WebDriver driver;
	
	@Given("^User is already on the Login Page$")
	public void userInLoginPage() {
		
		System.setProperty("webdriver.chrome.driver",  "C:/Users/shaikh/Desktop\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
	}
		
		@When("^Title of the Login Page is #1 Free CRM software in the cloud for sales and service$")
	public void title_of_login_page() {
			
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
			
		}
		
		@Then("^user enters username and password$")
		public void gets_Login() {
			driver.findElement(By.name("username")).sendKeys("shaikh92");
			driver.findElement(By.name("password")).sendKeys("Test@1234");
		}
		
		@Then("^Click on the Login Button$")
		public void click_loginButton() {
			 WebElement loginBtn =
					 driver.findElement(By.xpath("//input[@type='submit']"));
					 JavascriptExecutor js = (JavascriptExecutor)driver;
					 js.executeScript("arguments[0].click();", loginBtn);
		}
		@Then("^User is on Home Page$")
		public void user_in_HomePage() {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("CRMPRO", title);

}
}
