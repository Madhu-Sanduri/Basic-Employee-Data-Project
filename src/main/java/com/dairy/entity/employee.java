package com.dairy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String designation; 
	private String deptartment;
	private int experience;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDeptartment() {
		return deptartment;
	}
	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
	public employee() {
		super();
	}
	//Constructor
	public employee(long id, String name, String designation, String deptartment, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.deptartment = deptartment;
		this.experience = experience;
	}
	
	// to String
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", designation=" + designation + ", deptartment=" + deptartment
				+ ", experience=" + experience + "]";
	}
	
		
	

}
