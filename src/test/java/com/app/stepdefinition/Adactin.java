package com.app.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import com.app.pageexe.BookAHotel_PageExe;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin extends BookAHotel_PageExe {
	@Given("Login to the Adactin Application")
	public void login_to_the_adactin_application() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://adactinhotelapp.com/");
		   username();
		   
	}
	

}
