<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
</head>
<body>
		<h1> Welcome to index page</h1>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3">
                </div>
                 <div class="col-md-6">
                    <form name="registration" method="post" action="RegisterController" class="form-group">
                        <div class="row">
                            
                            <div class="col-md-6">
                                <input type="number" name="id" id="id" placeholder="Employee Id" 
                        class="form-control" >

                            </div>
                            <div class="col-md-6">
                                <input type="text" name="empname" id="empname" placeholder="Employee Name" 
                        class="form-control" >

                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <input type="text" name="email" id="email" placeholder="Enter Email" 
                        class="form-control" >

                            </div>
                            <div class="col-md-6">
                                <input type="text" name="password" id="password" placeholder="Enter Password" 
                        class="form-control" >

                            </div>
                            
                        </div>
                        <div class="row">
                            <button type="submit" class="btn btn-success"> Register </button>

                        </div>
                    </form>
                </div>
                <div class="col-md-3">

                </div>
            </div>
        </div>
        <h3>Already have an account?<a href="login.jsp">login</a></h3>
        
</body>
</html>