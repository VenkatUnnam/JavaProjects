package com.appname.employeedao;



import com.appname.employeebusinesslogic.Employee;

public interface EmployeeDAO 
{
Employee addEmployee(Employee rv);
Employee searchEmployeeBasedOnRegNumber(int registerationNumber);
void dispalyEmployeeDetails();
int numberOfEmployees();

}
