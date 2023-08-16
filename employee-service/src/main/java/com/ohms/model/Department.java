package com.ohms.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("Department")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	@Id
	private int departmentId;
	private String departmentName;
	private int nunmberOfEmployee;
	private double averageSalary;
	public int getDepartmentId() {
		return departmentId;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int departmentId, String departmentName, int nunmberOfEmployee, double averageSalary) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.nunmberOfEmployee = nunmberOfEmployee;
		this.averageSalary = averageSalary;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNunmberOfEmployee() {
		return nunmberOfEmployee;
	}
	public void setNunmberOfEmployee(int nunmberOfEmployee) {
		this.nunmberOfEmployee = nunmberOfEmployee;
	}
	public double getAverageSalary() {
		return averageSalary;
	}
	public void setAverageSalary(double averageSalary) {
		this.averageSalary = averageSalary;
	}
}
