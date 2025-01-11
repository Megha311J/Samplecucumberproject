package com.pages;

import commonMethods.BaseClass1;
import cucumber.api.java.en.Then;

public class DashboardPage1 extends BaseClass1 {
	
	@Then("Dashboard Page displays")
	public void getdashboardpage() {
		System.out.println(driver.getTitle());
		
	}

}
