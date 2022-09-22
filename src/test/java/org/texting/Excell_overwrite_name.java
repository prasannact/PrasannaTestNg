package org.texting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell_overwrite_name {
public static void main(String[] args) throws IOException {
	
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
		
		if(value.equals("dabiplab")) {
			
			cl.setCellValue("dass");
			
			
		FileOutputStream flout = new FileOutputStream(f);
		w.write(flout);
			
			System.out.println("Okkk");
			System.out.println("Donee -");
			
			
		}
		
	}
	}
}
}

}



