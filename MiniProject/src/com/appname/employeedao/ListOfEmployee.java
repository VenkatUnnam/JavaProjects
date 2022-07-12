package com.appname.employeedao;

import com.appname.employeedao.EmployeeDAOImplemntation;

public class ListOfEmployee 
{
public static EmployeeDAO getEmployeeDAO()
{
	
	EmployeeDAO dao=new EmployeeDAOImplemntation();
     return dao;
}
}
