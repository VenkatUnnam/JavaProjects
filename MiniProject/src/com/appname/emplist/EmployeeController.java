package com.appname.emplist;
import java.util.*;
import java.util.InputMismatchException;

import com.appname.empexception.*;

import com.appname.employeebusinesslogic.*;
import com.appname.employeedao.*;
import com.appname.empvalidation.*;

public class EmployeeController extends Thread
{
private Scanner scan=new Scanner(System.in);
@Override
public void run()
{
	System.out.println("**------Welcome to the  Employee Managent System--------**");
	int choice=-1;
		
	do
	{  
		System.out.println("press:1 to continue");
		System.out.println("press: 0 to exit");
		System.out.println("---Enter your choice---");
		 try
		 {
			 choice=scan.nextInt();
			 }
		  catch(InputMismatchException a) 
		 {
		  scan.next();
		 }
		 if(choice!=1&&choice!=0)
		 {
			  run();
		 }
	 if(choice==1) 
	  {
	    access();
	  } 
		 
	} while(choice==1); 
	    	
	System.out.println("----*Thank you visit us again*-----");
}

public void access() 
{
	EmployeeDAO employeeAccess=ListOfEmployee.getEmployeeDAO();
	Employee empObj=null;
	String employeeName=null;
	String employeeOccupation=null;
	int registerationNumber=0;
	double salary=0;
	boolean status=false;
	System.out.println(" press-1 to add a employee");
	System.out.println("Press- 2 to search  for employee");
	System.out.println("Press- 3 to know All Employee details");
	System.out.println("Press -4 to know the  number of employees");
	
	System.out.println("------Enter your choice----->");
	
	int option=-1;
	try
	{ 
		option=scan.nextInt();
		}
	catch(InputMismatchException i) 
	{ 
		scan.next();
		}
	
     switch(option)
	{
	case 1:
		System.out.println("-------Enter Employee Details------");
		do {
			  System.out.println("\n......Enter the Employee Name......");
			  employeeName=scan.next();
			  status=EmployeeValidation.validateEmployee(employeeName);
			 
		}while(!status);
		do
		{
			System.out.println("Enter the Occupation of employee");
			employeeOccupation=scan.next();
			status=EmployeeValidation.validateEmployee(employeeOccupation);
		}
		while(!status);
      do
        { 
			  System.out.println("Enter the Registeration number Of an Employee to know the details of an Employee");
		
		try
		{  registerationNumber=scan.nextInt();
		}
		catch(InputMismatchException q)
		{
			scan.next();
		}
		
		
		
		
		status=EmployeeValidation.validateRegNumber(registerationNumber);
            }while(!status);
		do

          { 
			System.out.println("Enter the salary of Employee");
		
			try {	
			    salary=scan.nextDouble();
			     }
			catch(InputMismatchException q) 
			{
				scan.next();
			}
			
		status=EmployeeValidation.validateEmployeeSalary(salary);
          }while(!status);
		
		empObj=new Employee(employeeName,employeeOccupation,salary,registerationNumber);
		
		Employee returnedObject=employeeAccess.addEmployee(empObj);
		
		System.out.println("Employee details are successfully added");  
		
		
	System.out.println(returnedObject);
		
		break;
	case 2:
	
		do
		{
		System.out.println("Enter the Registeration Of an Employee");
			try {
				registerationNumber=scan.nextInt();
			}
			catch(InputMismatchException w)
			{
				scan.next();
			}
			status=EmployeeValidation.validateRegNumber(registerationNumber);
			try {
			 Employee searchEmployee=employeeAccess.searchEmployeeBasedOnRegNumber(registerationNumber);
			 
			 System.out.println("Employee details are found");
			 
			 System.out.println(searchEmployee);
		 }
		 catch ( EmployeeRegNumberNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 
		}while(!status);
		break;
		 
	case 3:
		
		
		   try
		   {
			 employeeAccess.dispalyEmployeeDetails();  /*status */
			 
		   }
		catch(EmployeeListEmpty e )
		 {
			System.out.println(e);
			
		}
		
		
		break;
	case 4:
		try
		{
		employeeAccess.numberOfEmployees();
		}
		catch (EmployeeListEmpty e)
		{
			System.out.println(e);
					
		}
		break;
		
		default:
			System.out.println("Hey User Its invalid Option");
			break;
	
	}
	
	
}
		
		

}
