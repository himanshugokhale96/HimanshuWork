package com.google.cloud;

public class TypeOfVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Float str = (float) 3.5;
		if(! str.getClass().getSimpleName().equals("Float"))
		{
		System.out.println("float");	
		}
		String type = str.getClass().getSimpleName();
        System.out.println(type);	
        
        /*String sql = "CREATE TABLE BulkEmployeesUpLoad(Id INT," ;
        
        for(int i = 1;i<=70;i++)
        {
      	  sql = sql+"column"+i+" VARCHAR(100),";
        }
        sql = sql.substring(0, sql.length()-1);
        sql = sql +",PRIMARY KEY (Id) )ENGINE = InnoDB";
        //sql = sql+")"; */
        String sql = "INSERT INTO BulkEmployeesUpLoad(";
        		
        		for(int i = 1;i<=300;i++)
                {
              	  sql = sql+"column"+i+",";
                }
        	sql = sql +") VALUES(";
        	for(int i = 1;i<=300;i++)
            {
          	  sql = sql+"?,";
            }
        	sql = sql.substring(0, sql.length()-1);
        	sql = sql +")";
        	
        System.out.println(sql);
}

}
