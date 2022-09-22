package org.base;

import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Paramet extends BaseClass{
	
	public static void main(String[] args) {
		 browserlaunch();
		  maxx();
		  loadurl("https://www.amazon.com/");
	}
	 LoginPojo l = new LoginPojo();
	 
	@BeforeClass
	private void aa() {
		System.out.println("rajini");
		
	}
	
	@AfterClass
	private void bb() {
		System.out.println("kamal");
	}
	@Test(priority=-3)   //priority here
	private void tc1() {
		System.out.println("1 vijay");		

	}
	
	@Test(priority=-2, enabled=false)  //ignore testcase here
	private void tc2() {
		System.out.println("2 ajith");
		
	}
    @Parameters({"Cinima"})
	@Test(priority=-5, invocationCount=3) // invocationCount
	
	private void tc3(String s1) throws IOException {
    	WebElement ser = l.getSer();
    	   search(ser, s1);
    	   
	}
	
	@BeforeMethod
	private void cc() {
		System.out.println("scorcessee");	
		System.out.println(new java.util.Date());
	}
	
	@AfterMethod
	private void dd() {
		System.out.println("leonardo");
		System.out.println(new Date());
		
	}
	
	
}


