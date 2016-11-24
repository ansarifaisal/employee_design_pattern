import com.niit.pattern.dao.EmployeeDAO;
import com.niit.pattern.daoimpl.EmployeeDAOImpl;
import com.niit.pattern.entity.Employee;

public class EmployeeDAODemo {

	public static void main(String[] args) {
		//displaying all employee
		System.out.println("Display All Employee");
		EmployeeDAO employeeDAO = EmployeeDAOImpl.getEmployeeDAO();
		displayAllEmployee(employeeDAO);
		
		//adding Employee
		System.out.println("After Adding");
		Employee employee = new Employee(6, "Test", "Chembur", "Manager", "Kurla", 15000);
		employeeDAO.add(employee);
		displayAllEmployee(employeeDAO);
		
		//Update Employee
		System.out.println("After Updating");
		employee = employeeDAO.getId(4);
		employee.setName("Sailee");
		employeeDAO.update(employee);
		displayAllEmployee(employeeDAO);
		
		//Delete Employee
		System.out.println("After Deleting");
		employee = employeeDAO.getId(5);
		employeeDAO.delete(employee);
		displayAllEmployee(employeeDAO);
		
		//get by designation
		System.out.println("Designation");
		employee = employeeDAO.getDesignation("Manager");
		displayByDesignation(employeeDAO);
	}

	private static void displayByDesignation(EmployeeDAO employeeDAO) {
		for (Employee employee : employeeDAO.desinationList()) {
			System.out.println(employee);
		}
		
	}

	private static void displayAllEmployee(EmployeeDAO employeeDAO) {
		for (Employee employee : employeeDAO.employeeList()) {
			System.out.println(employee);
		}
		
	}

}
