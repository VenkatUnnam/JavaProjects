


package com.appname.employeedao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.appname.empexception.*;
import com.appname.employeebusinesslogic.Employee;




public class EmployeeDAOImplemntation implements EmployeeDAO
{
	public static final ArrayList<Employee> employeeList=new ArrayList<Employee>();
	@Override
	 public Employee addEmployee(Employee rv) 
	{
       employeeList.add(rv);
               return rv;

}
@Override
public Employee searchEmployeeBasedOnRegNumber(int registerationNumber)
{
	Employee e=null;
	int storedRegNumber=0;
	boolean status=false;
	for(int i=0;i<employeeList.size();i++)
	{
		e=employeeList.get(i);
		storedRegNumber=e.getRegisterationNumber();
   status=(registerationNumber==storedRegNumber)?true:false;

      if(status)
		{
			
			break;
		}
	}
 if(status)
	 
 {
	 return e;
 }
 else
 {
	 throw new EmployeeRegNumberNotFoundException();
 }
}

@Override
public void  dispalyEmployeeDetails()
{ 
	 if(employeeList.size()!=0) 
	 for(Employee h:employeeList)
	  {
		  System.out.println(h);
		   
	  }
	 else  
 throw new EmployeeListEmpty();	
	
}
@Override
public int numberOfEmployees()
{
	if(employeeList.size()>0)
	{
	System.out.println("Number Of Employees are "+employeeList.size());
	return employeeList.size();
	}
	else
		 throw new EmployeeListEmpty();
}

}
