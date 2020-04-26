package dao;

import java.util.List;

import model.Employee;

public interface OperacionesBD {

	public String add(Object e);
	public String edit(Object e);
	public String del(Object e);
	public List<Employee> find();
}
