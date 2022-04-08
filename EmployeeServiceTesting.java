import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbi.emp.Employee;
import com.sbi.emp.EmployeeService;

public class EmployeeServiceTesting {

	@Test
	public void testLoadAllEmployees() {
		System.out.println("testLoadAllEmployees()");

		System.out.println("Trying to create spring's container..with myspring3.xml..");
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("myspring3.xml"); 
		System.out.println("Spring conta0"
				+ "iner created....");

		EmployeeService empService = (EmployeeService) ctx.getBean("myEmpServ");
		List<Employee> empStaff = empService.getEmployees();
		for (Employee employee : empStaff) {
			System.out.println("emp number : "+employee.getEmployeeNumber());
			System.out.println("emp Name: "+employee.getName());
			System.out.println("emp Job: "+employee.getJob());
			System.out.println("emp Manager: "+employee.getManager());
			System.out.println("emp JoiningDate: "+employee.getJoiningDate());
			System.out.println("emp Salary: "+employee.getSalary());
			System.out.println("emp Commission: "+employee.getComm());
			System.out.println("emp Deptno: "+employee.getDeptno());		
			System.out.println("===========================================");		
		
		}



	}


}