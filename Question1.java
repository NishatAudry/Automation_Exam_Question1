package com.bd.WebAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Question1 extends BaseDriver2{
	@Test(priority = 0)
	public void startWebSite() {
		driver.get(url1);
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1)
	public void fillUp() throws InterruptedException {
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Nishat");
		Thread.sleep(2000);
		WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='phone']"));
		mobileNumber.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id='email']"));
		emailAddress.sendKeys("test1@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("222222");
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("Khilgaon");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(5000);
		//name="submit"
	}

}
