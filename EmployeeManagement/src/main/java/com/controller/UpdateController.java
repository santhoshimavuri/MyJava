package com.controller;

import java.io.IOException;

import com.employeeDAO.EmployeeDAO;
import com.employeedto.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String empname=request.getParameter("empname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		Employee e=new Employee();
		e.setId(id);
		e.setEmpname(empname);
		e.setEmail(email);
		e.setPassword(password);
		
		EmployeeDAO ed=new EmployeeDAO();
		String status=ed.updateEmployee(e);
		if(status.equals("success")) {
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);
		}
	}

}
