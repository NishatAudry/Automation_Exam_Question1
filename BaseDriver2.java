package com.bd.WebAutomationExam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class BaseDriver2 {
	static String url1 = "https://itera-qa.azurewebsites.net/home/automation";
	static String url2 = "https://www.foodpanda.com.bd/";
	static String url3 = "https://login.yahoo.com/";
	WebDriver driver;
	@BeforeSuite 
	public void start() {
		String browser = System.getProperty("browser", "Chrome");
		if(browser.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.contains("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
	}
	@AfterSuite 
	public void end() {
		driver.quit();
		 
		
	}

}
