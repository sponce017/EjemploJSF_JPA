package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import model.Employee;
import dao.EmployeeDAO;

public class EmployeeBean {

	private EmployeeDAO empdao;
	private Employee emp;
	private List<Employee> lsp;
	
		
	public EmployeeBean(){			
	};
		
	@PostConstruct
	public void init(){
		this.emp = new Employee();
		this.lsp = this.llenarLista();		
	}
	
	public List<Employee> llenarLista(){
		List<Employee> lst = new ArrayList<Employee>();
		//lst.add(new Employee(01,"Ponce",02,"Saul"));
		//lst.add(new Employee(02,"Hernandez",02,"Jose"));
		//lst.add(new Employee(03,"Martinez",02,"Juan"));
		empdao = new EmployeeDAO();
		lst = empdao.find();
		return 	lst;
	}	
	
	public List<Employee>llenarLista2(){
		List<Employee> lst = this.empdao.find();
		return lst;
	}
	
	public EmployeeDAO getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmployeeDAO empdao) {
		this.empdao = empdao;
	}

	public String agregar(){
				
		return "index";
	}
		
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public List<Employee> getLsp() {
		return lsp;
	}

	public void setLsp(List<Employee> lsp) {
		this.lsp = lsp;
	}	
	
}
