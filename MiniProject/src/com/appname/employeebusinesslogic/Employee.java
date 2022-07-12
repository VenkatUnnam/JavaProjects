package com.appname.employeebusinesslogic;

public class Employee
{
	private String employeeName;
    private String employeeOccupation;

    private int registerationNumber;
     private double salary;
public Employee(String employeeName,String employeeOccupation,double salary,int registerationNumber)
{
	super();
	this.employeeName = employeeName;
	this.employeeOccupation = employeeOccupation;
	this.salary = salary;
	this.registerationNumber=registerationNumber;
}
public String getEmployeeName()
{
	return employeeName;
}
public void setEmployeeName(String employeeName) 
{
	this.employeeName = employeeName;
}
public String getEmployeeOccupation() 
{
	return employeeOccupation;
}
public void setEmployeeOccupation(String employeeOccupation)
{
	this.employeeOccupation = employeeOccupation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getRegisterationNumber() {
	return registerationNumber;
}
public void setRegisterationNumber(int registerationNumber) 
{
	this.registerationNumber = registerationNumber;
}
@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeOccupation=" + employeeOccupation + ", salary="
			+ salary + ", registrationNumber=" + registerationNumber + "]";
}
public boolean equals(Object o1)
{
	Employee emp=(Employee)o1;
	return (this.registerationNumber==emp.registerationNumber);
	
}

}
