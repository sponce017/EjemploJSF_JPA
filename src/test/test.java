package test;

import java.util.List;

import model.Employee;
import dao.EmployeeDAO;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO empdao = new EmployeeDAO(); 		
		Employee emp = new Employee();
		emp.setIdemployee(4);
		emp.setApellido("Ponce");
		emp.setNombre("Hernand");
					
		//empdao.add(emp);
		
		//empdao.edit(emp);
		//empdao.del(emp);
		
		List<Employee> empl = empdao.find();
		
		for (Employee object : empl) {
			System.out.println(object.getNombre());
		}
	}

}
