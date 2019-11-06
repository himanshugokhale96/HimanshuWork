package com.katta.suma;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.protobuf.TextFormat.ParseException;

public class UnixTimeFormat {
	
 public static void main(String[] args) throws java.text.ParseException{
		      System.out.println(tsToSec8601("2016-01-01T00:00:00Z.000-0000"));
		  }
	
public static Integer tsToSec8601(String timestamp) throws java.text.ParseException{
	  if(timestamp == null) return null;
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'.SSSZ");
	Date dt = sdf.parse(timestamp);
	long epoch = dt.getTime();
	return (int)(epoch/1000);
	 
}
}
