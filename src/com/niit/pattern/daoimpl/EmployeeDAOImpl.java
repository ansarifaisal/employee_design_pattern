package com.niit.pattern.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.niit.pattern.dao.EmployeeDAO;
import com.niit.pattern.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private static EmployeeDAO employeeDAO = null;
	public static EmployeeDAO getEmployeeDAO() {
		if(employeeDAO == null){
			employeeDAO = new EmployeeDAOImpl();
		}
		return employeeDAO;
	}
	List<Employee> employeeList = null;
	List<Employee> designationList = null;
	private EmployeeDAOImpl() {
		employeeList = new ArrayList<>();
		employeeList.add(new Employee(1,"Faisal","Chembur","Manager","Kurla",18000));
		employeeList.add(new Employee(2,"Pavan","Airoli","Developer","Kurla",10000));
		employeeList.add(new Employee(3,"Avadoot","Vashi","Project Manager","Kurla",12000));
		employeeList.add(new Employee(4,"Aqib","Panvel","Tester","Kurla",20000));
		employeeList.add(new Employee(5,"Demo","Parel","Manager","Kurla",21000));
	}

	@Override
	public Employee getId(int id) {
		for (Employee employee : employeeList) {
			if(employee.getId()==id){
				return employee;
			}
		}
		return null;
	}

	@Override
	public Employee getDesignation(String designation) {
		designationList = new ArrayList<>();
		for (Employee employee : employeeList) {
			if(employee.getDesignation() == designation){
				designationList.add(employee);
			}
		}
		return null;
	}

	@Override
	public List<Employee> employeeList() {
		// TODO Auto-generated method stub
		return employeeList;
	}

	@Override
	public List<Employee> desinationList() {
		// TODO Auto-generated method stub
		return designationList;
	}

	@Override
	public boolean add(Employee employee) {
		employeeList.add(employee);
		return true;
	}

	@Override
	public boolean update(Employee employee) {
		Employee original = null;
		for (Employee temp : employeeList) {
			if(employee.getId()==temp.getId()){
				original = temp;
				break;
			}
		}
		original.setName(employee.getName());
		return true;
	}

	@Override
	public boolean delete(Employee employee) {
		employeeList.remove(employee);
		return true;
	}

}
