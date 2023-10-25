package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee 
{
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int emp_Id;
	@Column(name="name")
	private String emp_name;
	@Column(name="salary")
	private String emp_sallary;
	public int getEmpId() {
	   return emp_Id;
	      
	}

	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_sallary() {
		return emp_sallary;
	}
	public void setEmp_sallary(String emp_sallary) {
		this.emp_sallary = emp_sallary;
	}
	
	public Employee(int emp_Id, String emp_name, String emp_sallary) {
		super();
		this.emp_Id = emp_Id;
		this.emp_name = emp_name;
		this.emp_sallary = emp_sallary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + emp_Id + ", empname=" + emp_name + ", empsallary=" + emp_sallary + "]";
	}
}
