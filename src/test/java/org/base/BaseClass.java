package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	    public static WebDriver driver;
	    public static  Actions a;

	    public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}

	    public static void maxx() {
		driver.manage().window().maximize();
	
	}
	    public static void loadurl(String url ) {
			driver.get(url);
	    }
	    
	    public static void getti() {
		System.out.println(driver.getTitle());
		
		
	}
	    public static void search(WebElement ser , String value ) { 
	   ser.sendKeys(value);
	
	}
	  
	    public static void btclick(WebElement ok ) {
		ok.click();
	}
	
	    public static  void curll() {
			System.out.println(driver.getCurrentUrl());

		}
	    public static void downn() {
			driver.close();

		}
	    
	    public static void rcli(WebElement ref) {
	    	
	     a = new Actions(driver);
	 
	     a.contextClick(ref).perform();
      }
	    public static void dcli(WebElement ref) {
			a.doubleClick(ref).perform();
		}
	    public static void moveee(WebElement ref) {
			a.moveToElement(ref).perform();
			
		}
	    
	    public static String dataexce(int rownumber,int cellnumber) throws IOException {
	    	File f = new File("C:\\Users\\prsannt\\eclipse-workspace\\FrameWorkAug\\src\\test\\resources\\Excel file\\sample 11.xlsx");
	    	
	    	FileInputStream fl = new FileInputStream(f);
	    	
	    	Workbook w = new XSSFWorkbook(fl);
	    	
	    	Sheet  s= w.getSheet("sheet1");
	    	
	    	Row row = s.getRow(rownumber);
	    	Cell cell = row.getCell(cellnumber);
	    	
	    	String value="";
	    	
	    	int cellType = cell.getCellType();
	    	if( cellType==1) {
	    		value = cell.getStringCellValue();
	    	}
	    	
	    	else if (DateUtil.isCellDateFormatted(cell)) {
	    		Date d = cell.getDateCellValue();
	    		
	    		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy,mmm,dd,z");
	    		value = DateFormat.format(d);
	    		
			}
	    	else {
				double d = cell.getNumericCellValue();
				long l =(long)d;
				
				 value = String.valueOf(l);
				 
			}
	    	return value;
	    	
	    	
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
		
		


		
	   
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

