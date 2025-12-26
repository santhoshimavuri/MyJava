<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>HOME</title>
	</head>
	<body>
		<div class="container-fluid">
	            <div class="row">
	     	       <div class="col-md-3">
	    
	    
	                </div>
	                <div class="col-md-6">
	                <ul>
	                <li><a href="update.jsp">update</a> |<a href="delete.jsp">delete</a>|<a href="delete.jsp">DELETE</a>|<a href="SelectController" class="btn btn-primary">View All Employees</a>|<a href="login.jsp">logout</a>
	                </li>
	                
	                </ul>
	                </div>
	                <div class="col-md-3">
	                
	                </div>
	             </div>
	     </div>
		Welcome employee with user id : <%= session.getAttribute("id") %>
	</body>
	</html>