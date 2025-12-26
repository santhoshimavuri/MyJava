package com.controller;

import java.io.IOException;

import com.employeeDAO.EmployeeDAO;
import com.employeedto.EmployeeLogin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		EmployeeLogin el=new EmployeeLogin();
		el.setId(id);
		el.setPassword(password);
		
		EmployeeDAO ed=new EmployeeDAO();
		String status=ed.selectEmployee(el);
		if(status.equals("success")) {
			HttpSession session=request.getSession();
			session.setAttribute("id", id);
//			request.setAttribute("id", id);
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		}
	}

}
