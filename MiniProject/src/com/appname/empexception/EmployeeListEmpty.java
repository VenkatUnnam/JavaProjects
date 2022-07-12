package com.appname.empexception;

public class EmployeeListEmpty extends RuntimeException
{

	@Override
	public String toString() 
	{
		return "---Hey User------"+" First--Add Employees";
	}

}
