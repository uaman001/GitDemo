package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before("@MobileTest")  //!!!!! ---  @Before imported from cucumber
	public void beforeMobileValidation(){
		System.out.print("Hook before MobileTest");
		System.out.print("!!!!");
		System.out.println("!!!!");
	}
	
	@After ("@MobileTest") //!!!!! ---  @After imported from cucumber
	public void afterMobileValidation(){
		System.out.println("Hook after MobileTest");
	}
	@Before("@SmokeTest")  //!!!!! ---  @Before imported from cucumber
	public void beforeSmokeValidation(){
		System.out.println("Hook before SmokeTest");
	}
	
	@After ("@SmokeTest") //!!!!! ---  @After imported from cucumber
	public void afterSmokeValidation(){
		System.out.println("Hook after SmokeTest");
	}
	
}
