package model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idemployee;
	private String apellido;
	private int area;
	private String nombre;

	public Employee() {
	}
	
	public Employee(int idemployee, String apellido, int area, String nombre) {
		super();
		this.idemployee = idemployee;
		this.apellido = apellido;
		this.area = area;
		this.nombre = nombre;
	}

	public int getIdemployee() {
		return this.idemployee;
	}

	public void setIdemployee(int idemployee) {
		this.idemployee = idemployee;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getArea() {
		return this.area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}