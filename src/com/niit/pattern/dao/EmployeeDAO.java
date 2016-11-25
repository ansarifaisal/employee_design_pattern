package com.niit.pattern.dao;

import java.util.List;

import com.niit.pattern.entity.Employee;

public interface EmployeeDAO {
	//Method to get ID
	Employee getId(int id);
	//all employee list
	List<Employee> employeeList();
	//list by designation
	List<Employee> getByDesignation(String designation);
	//List by address
	List<Employee> getByAddress(String address);
	//To add Employee
	boolean add(Employee employee);
	//To update employee
	boolean update(Employee employee);
	//To delete employee
	boolean delete(Employee employee);
}
