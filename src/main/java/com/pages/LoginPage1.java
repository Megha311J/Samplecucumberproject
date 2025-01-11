package com.pages;

import org.openqa.selenium.By;

import commonMethods.BaseClass1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage1 extends BaseClass1 {
	@Given ("Enter the username as (.*)")
	public LoginPage1 enterusername(String username) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		return this;
		
	}
	@Given ("Enter the Password as (.*)")
	public LoginPage1 enterpassword(String password) {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		return this;
		
	}
	@When ("Click on Login")
	public DashboardPage1 clickbtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	return new DashboardPage1();
	}
}
