package com.katta.suma;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SXSSFexample {


    public static void main(String[] args) throws Exception {
        //FileInputStream inputStream = new FileInputStream("/home/sahana/JavaBooks.xlsx");
        //XSSFWorkbook wb_template = new XSSFWorkbook();
       // inputStream.close();

        SXSSFWorkbook wb = new SXSSFWorkbook(); 
        wb.setCompressTempFiles(true);

        SXSSFSheet sh = (SXSSFSheet) wb.createSheet();//.getSheetAt(0);
        
        Row row1 = sh.createRow(0);
        for(int columnCount = 0;columnCount<300;columnCount++)
        {
        	Cell cell = row1.createCell(columnCount);
            cell.setCellValue("Column "+columnCount);	
        }
        sh.setRandomAccessWindowSize(100);// keep 100 rows in memory, exceeding rows will be flushed to disk
    for(int rownum = 1; rownum < 100000; rownum++){
        Row row = sh.createRow(rownum);
        for(int cellnum = 0; cellnum < 300; cellnum++){
            Cell cell = row.createCell(cellnum);
            String address = new CellReference(cell).formatAsString();
            cell.setCellValue("Row-"+rownum+"Column-"+cellnum);
        }
        System.out.println(rownum);
    }
    FileOutputStream out = null;
try
{
    out = new FileOutputStream("/home/sahana/BulkData2.xlsx");
    wb.write(out);
    out.close();
}
catch(Exception e)
{
	out.close();	
}
}

}