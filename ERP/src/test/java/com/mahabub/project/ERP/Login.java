package com.mahabub.project.ERP;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BaseDriver{
	
	@Test
	public void login() throws InterruptedException {
		
		driver.get(Config.get("LOGIN_URL"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//============================
		
		driver.findElement(By.name("email")).sendKeys(Config.get("MAIL"));
		driver.findElement(By.name("password")).sendKeys(Config.get("PASSWORD"));
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
		Thread.sleep(5000);
	}

}
