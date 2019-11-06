package com.google.cloud;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SplittingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String json = "[{\"checkinDate\":\"2017-12-14\",\"checkInId\":6408,\"employeeId\":\"2B1\",\"employeeName\":\"Field 2\",\"agentId\":\"10\",\"agentName\":\"cust10\",\"checkInDateTime\":\"2017-12-14T11:34:10Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4410956,78.3899865\",\"checkInDistanceFromAgent\":18082,\"checkOutDateTime\":\"2017-12-14T11:40:43Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413287,78.3926832\",\"checkOutDistanceFromAgent\":18083,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-14\",\"checkInId\":6409,\"employeeId\":\"1C4\",\"employeeName\":\"Manager 1\",\"agentId\":\"13\",\"agentName\":\"cust13\",\"checkInDateTime\":\"2017-12-14T12:00:17Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413392,78.3926523\",\"checkInDistanceFromAgent\":7481,\"checkOutDateTime\":\"2017-12-14T12:01:23Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413293,78.3926429\",\"checkOutDistanceFromAgent\":7481,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-14\",\"checkInId\":6410,\"employeeId\":null,\"employeeName\":\"sandhya neethipudi\",\"agentId\":null,\"agentName\":\"A\",\"checkInDateTime\":\"2017-12-14T12:33:47Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.441312,78.3926538\",\"checkInDistanceFromAgent\":null,\"checkOutDateTime\":null,\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":null,\"checkOutDistanceFromAgent\":null,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6411,\"employeeId\":\"1A2\",\"employeeName\":\"Field 1\",\"agentId\":\"5\",\"agentName\":\"cust5\",\"checkInDateTime\":\"2017-12-15T04:28:36Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.441411,78.3927866\",\"checkInDistanceFromAgent\":11,\"checkOutDateTime\":\"2017-12-15T04:30:15Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413265,78.3926397\",\"checkOutDistanceFromAgent\":11,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6412,\"employeeId\":\"1A2\",\"employeeName\":\"Field 1\",\"agentId\":\"1\",\"agentName\":\"cust1\",\"checkInDateTime\":\"2017-12-15T04:30:23Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413223,78.3926405\",\"checkInDistanceFromAgent\":11,\"checkOutDateTime\":\"2017-12-15T04:31:03Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.441328,78.3926431\",\"checkOutDistanceFromAgent\":11,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6413,\"employeeId\":\"1A2\",\"employeeName\":\"Field 1\",\"agentId\":\"1\",\"agentName\":\"cust1\",\"checkInDateTime\":\"2017-12-15T04:31:09Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.441328,78.3926431\",\"checkInDistanceFromAgent\":11,\"checkOutDateTime\":\"2017-12-15T04:31:11Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413262,78.3926402\",\"checkOutDistanceFromAgent\":11,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6414,\"employeeId\":\"dont use\",\"employeeName\":\"sample emp\",\"agentId\":\"456\",\"agentName\":\"adddd None\",\"checkInDateTime\":\"2017-12-15T04:34:11Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413182,78.3926863\",\"checkInDistanceFromAgent\":null,\"checkOutDateTime\":null,\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":null,\"checkOutDistanceFromAgent\":null,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6415,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"1\",\"agentName\":\"cust1\",\"checkInDateTime\":\"2017-12-15T05:09:49Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413798,78.3926954\",\"checkInDistanceFromAgent\":11,\"checkOutDateTime\":\"2017-12-15T05:09:51Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413798,78.3926954\",\"checkOutDistanceFromAgent\":11,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6416,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"10\",\"agentName\":\"cust10\",\"checkInDateTime\":\"2017-12-15T05:09:51Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413798,78.3926954\",\"checkInDistanceFromAgent\":18083,\"checkOutDateTime\":\"2017-12-15T05:09:55Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413798,78.3926954\",\"checkOutDistanceFromAgent\":18083,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6417,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"11\",\"agentName\":\"cust11\",\"checkInDateTime\":\"2017-12-15T05:09:55Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413798,78.3926954\",\"checkInDistanceFromAgent\":7481,\"checkOutDateTime\":\"2017-12-15T05:09:59Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413798,78.3926954\",\"checkOutDistanceFromAgent\":7481,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6418,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"12\",\"agentName\":\"cust12\",\"checkInDateTime\":\"2017-12-15T05:09:59Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413798,78.3926954\",\"checkInDistanceFromAgent\":7481,\"checkOutDateTime\":\"2017-12-15T05:10:05Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413304,78.3926637\",\"checkOutDistanceFromAgent\":7481,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6419,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"13\",\"agentName\":\"cust13\",\"checkInDateTime\":\"2017-12-15T05:10:05Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413304,78.3926637\",\"checkInDistanceFromAgent\":7481,\"checkOutDateTime\":\"2017-12-15T05:10:08Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413304,78.3926637\",\"checkOutDistanceFromAgent\":7481,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6420,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"14\",\"agentName\":\"cust14\",\"checkInDateTime\":\"2017-12-15T05:10:08Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413304,78.3926637\",\"checkInDistanceFromAgent\":7481,\"checkOutDateTime\":\"2017-12-15T05:10:12Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413304,78.3926637\",\"checkOutDistanceFromAgent\":7481,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6421,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"15\",\"agentName\":\"cust15\",\"checkInDateTime\":\"2017-12-15T05:10:13Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413304,78.3926637\",\"checkInDistanceFromAgent\":7481,\"checkOutDateTime\":\"2017-12-15T05:10:16Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413302,78.3926655\",\"checkOutDistanceFromAgent\":7481,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6422,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"16\",\"agentName\":\"cust16\",\"checkInDateTime\":\"2017-12-15T05:10:16Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413302,78.3926655\",\"checkInDistanceFromAgent\":8330,\"checkOutDateTime\":\"2017-12-15T05:10:19Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413302,78.3926655\",\"checkOutDistanceFromAgent\":8330,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6423,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"17\",\"agentName\":\"cust17\",\"checkInDateTime\":\"2017-12-15T05:10:19Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413302,78.3926655\",\"checkInDistanceFromAgent\":8330,\"checkOutDateTime\":\"2017-12-15T05:10:22Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.4413302,78.3926655\",\"checkOutDistanceFromAgent\":8330,\"entityType\":\"Customer\",\"agentAddress\":null}{\"checkinDate\":\"2017-12-15\",\"checkInId\":6424,\"employeeId\":null,\"employeeName\":\"Manager 2\",\"agentId\":\"18\",\"agentName\":\"cust18\",\"checkInDateTime\":\"2017-12-15T05:10:22Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":\"17.4413302,78.3926655\",\"checkInDistanceFromAgent\":8330,\"checkOutDateTime\":\"2017-12-15T05:11:32Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":\"17.441327,78.392643\",\"checkOutDistanceFromAgent\":8330,\"entityType\":\"Customer\",\"agentAddress\":null}]";
		json = json.replace(" ", "\n");
		String[] splitJson = json.split("\"}");
		String[] newJson =new String[5];
		
		for(int x = 0;x<newJson.length;x++)
		{
			newJson[x] = "";
		}
		
		int i=0;
		for(String st: splitJson)
		{
			String temp = newJson[i]+st+"}"+"\n";
			if(temp.getBytes().length<10000)
			{
				newJson[i] = newJson[i]+st+"}"+"\n";
			}
			else
			{
			i++;
			newJson[i] = newJson[i]+st+"}"+"\n";
			}
			
		}
		
		
		System.out.println(json.getBytes().length);
		
		int z=0;
		for(String s : newJson)
		{
			
			if(s!="")
			{
				z++;
				File file = new File("/home/sahana/Desktop/_"+z);
				writeStringToFile(s,file);
				System.out.println(s+" "+s.getBytes().length);
			}
		}

	}
	public static String writeStringToFile(String value,File file){
        String jsonPrettyPrintString = "{}";
        try {
                  BufferedWriter out = new BufferedWriter(new FileWriter(file));
                  out.write(value);
                  out.close();
      } catch (IOException je) {
          System.out.println(je.toString());
      }
        return jsonPrettyPrintString;
	}
}
