package runner;

import org.testng.annotations.BeforeTest;

import commonMethods.BaseClass1;
import cucumber.api.CucumberOptions;
@CucumberOptions(features="src/main/java/features/Login1.feature",
				 glue="com/pages",
				 monochrome=true)

public class TC01_LoginPage1 extends BaseClass1 {
	@BeforeTest
	public void setData() {
		testcaseName="Login Orange HRM (Cucumber)";
		testcaseDec = "Login and Logout of OrgangeHRM application";
		author="Automation tester";
		category="smoke";
		
	}
	

}
