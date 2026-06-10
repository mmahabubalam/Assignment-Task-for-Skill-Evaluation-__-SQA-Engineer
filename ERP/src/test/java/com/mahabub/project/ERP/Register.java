package com.mahabub.project.ERP;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.github.javafaker.Faker;

public class Register extends BaseDriver{
	
	@Test
	public void Register() throws InterruptedException {
		
		Faker faker = new Faker();
		driver.get(Config.get("REGISTER_URL"));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		//============================
		
		driver.findElement(By.name("first_name")).sendKeys(faker.name().firstName());
		driver.findElement(By.name("last_name")).sendKeys(faker.name().lastName());
		driver.findElement(By.name("email")).sendKeys(faker.internet().emailAddress());
		driver.findElement(By.name("phone")).sendKeys(faker.phoneNumber().phoneNumber());
		
		String password = faker.internet().password();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirm_password")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[normalize-space()='Register'])[1]")).click();
		Thread.sleep(5000);
		
	}

}
