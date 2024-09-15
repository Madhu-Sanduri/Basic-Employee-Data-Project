package com.dairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.dairy.Employee.EmployeeRepo;
import com.dairy.entity.employee;

@RestController
public class diaryController {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("/save")   //Save data in List format
	public ResponseEntity<List<employee>> saveEmployee(@RequestBody List<employee> emp) {
		return new ResponseEntity<>(employeeRepo.saveAll(emp),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get/")  // get by id
	
	public ResponseEntity<employee> getbyId(@RequestBody Long id){
		Optional<employee> optionalem = employeeRepo.findById(id);
		
		if(optionalem.isPresent()) {
			return new ResponseEntity<>(optionalem.get(),HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/getall") //get all
	public ResponseEntity<List<employee>>  getAllEmployee(employee em){
		return new ResponseEntity<>(employeeRepo.findAll(),HttpStatus.OK);
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<employee> deleteEmployeeId(@PathVariable Long id) {
		Optional<employee> optionalem = employeeRepo.findById(id);
		
		if(optionalem.isPresent()) {
			employeeRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	
}
