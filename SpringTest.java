import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sbi.emp.Employee;
import com.sbi.emp.EmployeeService;

public class SpringTest {

@Test
public void selectEmpSpringTest() {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("mySpring3.xml");
	EmployeeService eService = (EmployeeService) ctx.getBean("myEmpServ");
	List<Employee> employee = eService.getEmployees();
	
	for (Employee e: employee) {
		System.out.println("Employee Name           :"+ e.getName());
		System.out.println("Employee Number         :"+ e.getEmployeeNumber());
		System.out.println("Employee Job            :"+ e.getJob());
		System.out.println("Employee Salary         :"+ e.getSalary());
		System.out.println("Employee Department     :"+ e.getDeptno());
		System.out.println("Employee Manager        :"+ e.getManager());
		System.out.println("Employee Commission     :"+ e.getComm());
		System.out.println("--------------------------------------");
	}
	
}
}