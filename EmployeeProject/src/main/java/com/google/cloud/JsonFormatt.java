package com.google.cloud;

public class JsonFormatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String checkInCheckOutJson = "[{\"checkinDate\":\"2019-07-31\",\"checkInId\":912,\"employeeId\":\"T-CTO\",\"employeeName\":\"Tiru CTO\",\"agentId\":\"121\",\"agentName\":\"entity1\",\"checkInDateTime\":\"2019-07-31T09:15:22Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":null,\"checkInDistanceFromAgent\":null,\"checkOutDateTime\":\"2019-07-31T09:15:59Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":null,\"checkOutDistanceFromAgent\":null,\"entityType\":\"custom entity1\",\"agentAddress\":null},{\"checkinDate\":\"2019-07-31\",\"checkInId\":913,\"employeeId\":\"T-CTO\",\"employeeName\":\"Tiru CTO\",\"agentId\":null,\"agentName\":\"IBGRP\",\"checkInDateTime\":\"2019-07-31T09:16:27Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":null,\"checkInDistanceFromAgent\":null,\"checkOutDateTime\":\"2019-07-31T09:16:39Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":null,\"checkOutDistanceFromAgent\":null,\"entityType\":\"custom entity1\",\"agentAddress\":null},{\"checkinDate\":\"2019-07-31\",\"checkInId\":914,\"employeeId\":\"T-CTO\",\"employeeName\":\"Tiru CTO\",\"agentId\":null,\"agentName\":\"entity aa\",\"checkInDateTime\":\"2019-07-31T09:16:56Z\",\"checkInType\":\"NormalCheckIn\",\"checkInLocation\":null,\"checkInDistanceFromAgent\":null,\"checkOutDateTime\":\"2019-07-31T09:17:04Z\",\"checkOutType\":\"NormalCheckOut\",\"checkOutLocation\":null,\"checkOutDistanceFromAgent\":null,\"entityType\":\"custom entity1\",\"agentAddress\":null}]";
		checkInCheckOutJson = checkInCheckOutJson.substring(1, checkInCheckOutJson.length()-1);
		String[] json = checkInCheckOutJson.split("},");
		for(String s:json)
		{
			System.out.println(s+"}");
		}
	}

}
