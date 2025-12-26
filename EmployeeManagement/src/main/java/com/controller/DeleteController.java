package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.employeeDAO.EmployeeDAO;
import com.employeedto.EmployeeDelete;


@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		EmployeeDelete ed=new EmployeeDelete();
		ed.setId(id);
		
		EmployeeDAO edo=new EmployeeDAO();
		String status=edo.deleteEmployee(ed);
		if(status.equals("success")) {
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("delete.jsp");
			rd.forward(request, response);
		}
		
	}

}
