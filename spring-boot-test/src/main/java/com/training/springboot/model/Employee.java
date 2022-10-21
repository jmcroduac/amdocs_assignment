//package com.training.springboot.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="Employees_New")
//public class Employee {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="emp_id")
//	private int empId;
//	
//	@Column(name="emp_name")
//	private String empName;
//	
//	@Column(name="emp_salary")
//	private int empSal;
//	
//
//	public Employee() {
//		
//	}
//	
//	public Employee(int empId, String empName, int salary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empSal = salary;
//	}
//
//	public int getEmpId() {
//		return empId;
//	}
//
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//
//	public String getEmpName() {
//		return empName;
//	}
//
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//
//	public double getSalary() {
//		return empSal;
//	}
//
//
//	public void setSalary(int salary) {
//		this.empSal = salary;
//	}
//
//	
//}
