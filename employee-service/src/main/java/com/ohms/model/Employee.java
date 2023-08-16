package com.ohms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("Employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeName;
	private int employeeAge;
	private double employeeSalary;
	private String department;
	private String address;
	private long employeePhoneNumber;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, int employeeAge, double employeeSalary, String department,
			String address, long employeePhoneNumber) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
		this.department = department;
		this.address = address;
		this.employeePhoneNumber = employeePhoneNumber;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}
	public void setEmployeePhoneNumber(long employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}

}
