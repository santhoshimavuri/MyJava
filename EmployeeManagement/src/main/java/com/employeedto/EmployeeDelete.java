package com.employeedto;

public class EmployeeDelete {
	private int id;
    public EmployeeDelete() {
    	
    }
	public EmployeeDelete(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EmployeeDelete [id=" + id + "]";
	}
	
	

}
