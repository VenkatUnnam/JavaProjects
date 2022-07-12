package com.appname.empvalidation;
import java.util.regex.*;

public class EmployeeValidation 
{
	public static boolean validateEmployee(String employeeName)
	{
		
	
boolean status=Pattern.compile("[A-Za-z]+").matcher(employeeName).matches();
return status;
}
	public static boolean validateEmpOccupation(String employeeOccupation )
	{
		boolean status=Pattern.compile("[A-Za-z]+").matcher(employeeOccupation).matches();
		return status;
	}
	public static boolean validateRegNumber(int registerationNumber )

	{
		if(registerationNumber>0 && registerationNumber<10001) 
		
		return true;
	
		else
			return false;
	}
	public static boolean validateEmployeeSalary(double salary)
	{
		boolean status=(salary>=100 && salary<=1000000)?true:false;
		return status;
	}
}
	
