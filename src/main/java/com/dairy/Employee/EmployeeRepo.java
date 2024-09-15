package com.dairy.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairy.entity.employee;

public interface EmployeeRepo extends JpaRepository<employee, Long> {
	
}

