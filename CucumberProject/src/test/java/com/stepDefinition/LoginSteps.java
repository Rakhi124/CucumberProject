package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step1:User is on login page");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Step2:User enters username and Password");
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Step3:User is clicking on login button");
		driver.findElement(By.id("login-button")).click();
	
	}

	@Then("user should land on login page")
	public void user_should_land_on_login_page() {
		System.out.println("Step 4:User lands on homepage");
		driver.close();
		
	}

}
