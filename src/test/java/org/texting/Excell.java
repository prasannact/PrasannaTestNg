package org.texting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Excell {
public static void main(String[] args) throws IOException {
	

//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
	
	File f = new File("C:\\Users\\prsannt\\eclipse-workspace\\FrameWorkAug\\src\\test\\resources\\Excel file\\sample 11.xlsx");
	
	FileInputStream fl = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fl);
	
	Sheet s = w.getSheet("sheet1");
	
	
  for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
	
	Row r = s.getRow(i);


  for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
	
	 Cell cl = r.getCell(j);
	 
	int cellType = cl.getCellType();
	if(cellType==1) {
		String value = cl.getStringCellValue();
		System.out.println(value);
		
	}
	
	else if (DateUtil.isCellDateFormatted(cl)) {
		Date d = cl.getDateCellValue();
		
		SimpleDateFormat datety = new SimpleDateFormat("dd,mmm,yyyy");
		String value = datety.format(d);
		
	}
	else {
		double dou = cl.getNumericCellValue();
		long l=(long)dou;
		
		String value = String.valueOf(l);
		System.out.println(value);
		
			
		}
	}

 }
}
}

// Row ro= s.getRow(2);

//Cell c = ro.getCell(3);
//System.out.println(c);

//int phrow = s.getPhysicalNumberOfRows();
//System.out.println("total rows:  "+ phrow);

//Row row = s.getRow(3);

//int phcell = row.getPhysicalNumberOfCells();

//System.out.println("phcell:      "+ phcell);


