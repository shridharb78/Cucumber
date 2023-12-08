package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllLinks {
	WebDriver driver;
	List<WebElement> allLinks;
	
	@Given("The user is in the amazon home page")
	public void the_user_is_in_the_amazon_home_page() {
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in");
	}

	@When("finds all the links using tagname locator")
	public void finds_all_the_links_using_tagname_locator() {
		 allLinks = driver.findElements(By.tagName("a"));
	}

	@Then("print all links")
	public void print_all_links() {
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
			
		}
	}
}
