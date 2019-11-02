package com.itsuccesswin.dao;

import com.itsuccesswin.beans.Employee;

public interface EmployeeDao {
	
	public String insertEmployee(Employee emp);
	public Employee serchEmployee(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployee(int eno);

}
