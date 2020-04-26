package dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Employee;

public class EmployeeDAO implements OperacionesBD{

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploJSF_JPA");
		
	@Override
	public String add(Object e) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Employee emp = (Employee) e;
			tx.begin();
		try {
			em.persist(emp);
			tx.commit();
		} catch (Exception ex) {
			// TODO: handle exception
			tx.rollback();
		}
		return null;
	}

	@Override
	public String edit(Object e) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Employee emp = (Employee) e;
			tx.begin();
		try {
			em.merge(emp);
			tx.commit();
		} catch (Exception ex) {
			// TODO: handle exception
			tx.rollback();
		}
		return null;
		
	}

	@Override
	public String del(Object e) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Employee emp = (Employee) e;
		Employee employee = em.find(Employee.class, emp.getIdemployee());
			tx.begin();
		try {
			em.remove(employee);
			tx.commit();
		} catch (Exception ex) {
			// TODO: handle exception
			tx.rollback();
		}
		return null;
	}

	@Override
	public List<Employee> find() {
		EntityManager em = emf.createEntityManager();	
		Query q = (Query) em.createQuery("select e from Employee e");
		List<Employee> lse = ((javax.persistence.Query) q).getResultList(); 
		return lse;
	}
}
