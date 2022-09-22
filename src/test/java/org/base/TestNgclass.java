package org.base;

import java.io.IOException;
import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgclass extends BaseClass{
	
	@BeforeClass
	private void browseropen() {
		browserlaunch();
		maxx();

	}
	
	@AfterClass
	private void browserclose() {
		downn();
		

	}
	@Test(enabled=false)
	private void tc1() throws IOException {
		LoginPojo l = new LoginPojo();
		
		search(l.getSer(), dataexce(3, 5));
		btclick(l.getOk());
		
	}
	@Test(dataProvider="actors")
	private void tc2(String s1) throws IOException{
		
      LoginPojo l = new LoginPojo();
		
		search(l.getSer(), s1);
		
		btclick(l.getOk());
		
		
		

	}
		@BeforeMethod
		private void start() {
			System.out.println(new Date());
			loadurl("https://www.amazon.com");
			
		}
	
         @AfterMethod
         private void dateout() {
			System.out.println(new Date());
		}
         
         @DataProvider(name= "actors")
 		
 		private   Object[][] kamal() {
 			
 			return new  Object[][] {
 				
 				{"kama","kalai"},
 				{"raja","rajnii"},
 			};

	
	
	

	/*
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
	@Test(priority=-5, invocationCount=3) // invocationCount
	private void tc3() {
		System.out.println("3 vikram");

	}
	
	@BeforeMethod
	private void cc() {
		System.out.println("scorcessee");	
		System.out.println(new java.util.Date());
	}
	
	@AfterMethod
	private void dd() {
		System.out.println("leonardo");
		System.out.println(new Date());*/
		
	}
}
	
	

	

