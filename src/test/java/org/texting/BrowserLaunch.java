package org.texting;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.base.BaseClass;
import org.base.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch extends BaseClass{
	public static void main(String[] args) throws InterruptedException, IOException {
		
  browserlaunch();
  maxx();
  loadurl("https://www.amazon.com/");
  getti();
  
  LoginPojo l = new LoginPojo();
  
 // 1 method like this or, --
  
  WebElement ser = l.getSer();
   search(ser, dataexce(1, 1));
   
   
   WebElement ok = l.getOk();
   btclick(ok);  
	}
}
  
  
  // 2 method - single line --
  
  /*  search(l.getSer(), "samsung");
   
  // to refresh the page - new login pojo needed 
   driver.navigate().refresh();
   
   LoginPojo li = new LoginPojo();
   
   search(li.getSer(), "nokia");
   btclick(li.getOk());*/
   
   
	
  
 
   // multi login pojo , execute
  
 /*WebElement pro = driver.findElement(By.id("twotabsearchtextbox"));
  search(pro,dataexce(3, 5));

  WebElement go = driver.findElement(By.id("nav-search-submit-button"));
   btclick(go);*/
   
 
   
  /* String parttab = driver.getWindowHandle();
  Set<String> allwin = driver.getWindowHandles();
   
  for(String each:allwin) {
	   if(!parttab.equals(each));
	   driver.switchTo().window(each);
	   
   }*/
	
  // WebElement mov = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
  // rcli(mov);
   


	

	/* WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://amazon.com");
	driver.manage().window().maximize();
	
   String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	String title = driver.getTitle();
	System.out.println(title); */
	
	



