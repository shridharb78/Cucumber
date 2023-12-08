package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Actittime {
	WebDriver driver;
	@Given("The user is in the Actitime Login page")
	public void the_user_is_in_the_actitime_login_page() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
				
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

	@Then("Home page should be displayed.")
	public void home_page_should_be_displayed() {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		String title=driver.getTitle();
		String eTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(title, eTitle);
	}
}
