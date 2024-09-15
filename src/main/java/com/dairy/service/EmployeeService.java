package com.dairy.service;

import com.dairy.entity.employee;
import java.util.List;

public interface EmployeeService {
	
	public employee saveEmployee(employee emp);
	
	public employee updateEmployee(employee emp);
	
	public employee deleteEmployee(employee emp);
	
	public employee findById(employee emp);
	
	public List<employee> findAll(employee emp);
	
}
