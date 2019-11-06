package com.katta.suma;


import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/**
 * A very simple program that writes some data to an Excel file
 * using the Apache POI library.
 * @author www.codejava.net
 *
 */
public class SimpleExcelWriterExample {
 
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books");
         
       
        Row row1 = sheet.createRow(0);
        for(int columnCount = 0;columnCount<300;columnCount++)
        {
        	Cell cell = row1.createCell(columnCount);
            cell.setCellValue("Column "+columnCount);	
        }
        
        for(int rowCount = 1;rowCount<10000;rowCount++)
        {
            Row row = sheet.createRow(rowCount);
             System.out.println(rowCount);
             
            for(int columnCount = 0;columnCount<300;columnCount++)
            {
                Cell cell = row.createCell(columnCount);
                    cell.setCellValue("Row-"+rowCount+"Column-"+columnCount);
            }
             
        }
         
         
        try (FileOutputStream outputStream = new FileOutputStream("/home/sahana/BulkData.xlsx")) {
            workbook.write(outputStream);
            System.out.println("sucess");
        }
    }
 
}
