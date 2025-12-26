package com.employeeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.employeedto.Employee;
import com.employeedto.EmployeeDelete;
import com.employeedto.EmployeeLogin;
import com.utility.ConnectionClass;

public class EmployeeDAO implements EmployeeInterface {
	Connection con;
	String status = "failure";

	@Override
	public String insertEmployee(Employee e) {
		try {
			con=ConnectionClass.getConnection();
			PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?,?)");
			pst.setInt(1, e.getId());
			pst.setString(2, e.getEmpname());
			pst.setString(3, e.getEmail());
			pst.setString(4, e.getPassword());
			int i = pst.executeUpdate();
			if (i > 0) {
				status = "success";
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}

	@Override
	public String selectEmployee(EmployeeLogin el) {
		try {
			con=ConnectionClass.getConnection();
			PreparedStatement pst = con.prepareStatement("select * from emp where id=? and password=?");
			pst.setInt(1, el.getId());
			pst.setString(2, el.getPassword());
			ResultSet rs = pst.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}
			if (count > 0) {
				status = "success";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String updateEmployee(Employee e) {
		try {
			con=ConnectionClass.getConnection();
			PreparedStatement pst=con.prepareStatement("update emp set empname=?,email=?,password=? where id=?");
			pst.setString(1, e.getEmpname());
			pst.setString(2, e.getEmail());
			pst.setString(3, e.getPassword());
			pst.setInt(4, e.getId());
			
			int i=pst.executeUpdate();
			if(i>0) {
				status="success";
			}
			
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		return status;
	}

	@Override
	public String deleteEmployee(EmployeeDelete ed) {
		try {
			con=ConnectionClass.getConnection();
			PreparedStatement pst=con.prepareStatement("delete from emp where id=?");
			pst.setInt(1, ed.getId());
			
			int i=pst.executeUpdate();
			if(i>0) {
				status="success";
			}
			
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> li=new ArrayList<Employee>();
		try {
			con=ConnectionClass.getConnection();
			PreparedStatement pst=con.prepareStatement("select * from emp");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Employee e= new Employee();
				e.setId(rs.getInt(1));
				e.setEmpname(rs.getString(2));
				e.setEmail(rs.getString(3));
				li.add(e);
			}

		}catch(Exception e1) {
			e1.printStackTrace();
		}
		return li;
	}

}
