package com.appname.empexception;


public class EmployeeRegNumberNotFoundException extends RuntimeException
{
	
@Override

public String toString()
{
	return "Employee number not found in the Employee list";
}
}
