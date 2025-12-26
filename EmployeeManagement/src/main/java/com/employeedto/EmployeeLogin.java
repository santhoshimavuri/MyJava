package com.employeedto;

public class EmployeeLogin {
	private int id;
	private String password;
	
	public EmployeeLogin() {
		
	}
	public EmployeeLogin(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeLogin [id=" + id + "]";
	}
	
	

}
