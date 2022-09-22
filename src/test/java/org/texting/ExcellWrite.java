package org.texting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellWrite {
public static void main(String[] args) throws IOException {
	
 File f = new File("C:\\Users\\prsannt\\eclipse-workspace\\FrameWorkAug\\src\\test\\resources\\Excel file\\writeexcell.xlsx");
 
 boolean nf = f.createNewFile();
 System.out.println(nf);
 
Workbook w = new XSSFWorkbook();

Sheet s = w.createSheet("Amazon");

Row r = s.createRow(2);

Cell cl = r.createCell(2);

cl.setCellValue("CT");

FileOutputStream flout = new FileOutputStream(f);

w.write(flout);

System.out.println("OKKKK");






}
}
