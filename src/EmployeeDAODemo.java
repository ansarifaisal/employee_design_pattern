import com.niit.pattern.dao.EmployeeDAO;
import com.niit.pattern.daoimpl.EmployeeDAOImpl;
import com.niit.pattern.entity.Employee;

public class EmployeeDAODemo {
private static EmployeeDAO employeeDAO = EmployeeDAOImpl.getEmployeeDAO();

	public static void main(String[] args) {
		//displaying all employee
		System.out.println("Display All Employee");
		displayAllEmployee();
		
		//adding Employee
		System.out.println("After Adding");
		Employee employee = new Employee(6, "Test", "Chembur", "Manager", "Kurla", 15000);
		employeeDAO.add(employee);
		displayAllEmployee();
		
		//Update Employee
		System.out.println("After Updating");
		employee = employeeDAO.getId(4);
		employee.setName("Sailee");
		employeeDAO.update(employee);
		displayAllEmployee();
		
		//Delete Employee
		System.out.println("After Deleting");
		employee = employeeDAO.getId(5);
		employeeDAO.delete(employee);
		displayAllEmployee();
		
		//get by designation
		System.out.println("Designation");
		displayByDesignation("Manager");
		
		//get by address
		System.out.println("Address");
		displayByAddress("Vashi");
	}

		
	
	private static void displayByAddress(String address) {
		for (Employee employee : employeeDAO.getByAddress(address)) {
			System.out.println(employee);
		}
		
	}



	private static void displayByDesignation(String designation) {
		for (Employee employee : employeeDAO.getByDesignation(designation)) {
			System.out.println(employee);
		}
		
	}



	private static void displayAllEmployee() {
		for (Employee employee : employeeDAO.employeeList()) {
			System.out.println(employee);
		}
		
	}

}
