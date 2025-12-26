package com.employeedto;

public class Employee {
	private int id;
	private String empname;
	private String email;
	private String password;
	
	public Employee() {
		
	}
	public Employee(int id, String empname, String email, String password) {
		super();
		this.id = id;
		this.empname = empname;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", email=" + email + "]";
	}
	
	

}
