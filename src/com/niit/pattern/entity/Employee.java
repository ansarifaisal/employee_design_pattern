package com.niit.pattern.entity;

public class Employee {
	//Private Fields
	private int id;
	private String name;
	private String address;
	private String designation;
	private String branch;
	private int salary;
	public Employee(int id, String name, String address, String designation, String branch, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation = designation;
		this.branch = branch;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", designation=" + designation
				+ ", branch=" + branch + ", salary=" + salary + "]";
	}
	
}
