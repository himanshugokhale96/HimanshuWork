package com.katta.suma;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadXLSX {
	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/test";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "password";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Creating table in given database...");
	      stmt = conn.createStatement();
	      
	      FileInputStream fis = new FileInputStream(new File("/home/sahana/JavaBooks.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook (fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int i= 1,x =1;
			Iterator ite = sheet.rowIterator();
			while(ite.hasNext()){
				if(i==1)
				{
					i++;
					Row row = (Row) ite.next();
					continue;
				}
				String sql = "INSERT INTO BulkEmployeesUpLoad VALUES(";
				sql = sql +x+",";
				x++;
				Row row = (Row) ite.next();
				Iterator<Cell> cite = row.cellIterator();
				while(cite.hasNext()){
					
					Cell c = cite.next();
					sql = sql +"'"+c.toString()+"'"+",";
					System.out.print(c.toString() +"  ");
				}
				System.out.println();
				sql = sql.substring(0, sql.length()-1)+")";
				stmt.executeLargeUpdate(sql);
			}
			fis.close();

	    /*  String sql = "CREATE TABLE BulkEmployeesUpLoad(Id INT," ;
	      
	      for(int i = 1;i<=300;i++)
	      {
	    	  sql = sql+"column"+i+" VARCHAR(20),";
	      }
	      sql = sql.substring(0, sql.length()-1);
	      sql = sql +",PRIMARY KEY (Id) )ENGINE = InnoDB";
//	                   "(id INTEGER not NULL, " +
//	                   " first VARCHAR(255), " + 
//	                   " last VARCHAR(255), " + 
//	                   " age INTEGER, " + 
//	                   " PRIMARY KEY ( id ))";  */

	      
	      System.out.println("Created table in given database...");
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	}//end JDBCExample


