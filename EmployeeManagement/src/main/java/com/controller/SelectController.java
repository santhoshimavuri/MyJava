package com.controller;

import java.io.IOException;
import java.util.List;

import com.employeeDAO.EmployeeDAO;
import com.employeedto.Employee;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/SelectController")
public class SelectController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO e=new EmployeeDAO();
		List<Employee> li=e.getAllEmployees();
		HttpSession session=request.getSession();
		session.setAttribute("allemployees", li);
		RequestDispatcher rd=request.getRequestDispatcher("allemp.jsp");
		rd.forward(request, response);
	}

}
