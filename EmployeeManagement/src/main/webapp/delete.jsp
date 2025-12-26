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
		<h1> Welcome to delete page</h1>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-3">
                </div>
                 <div class="col-md-6">
                    <form name="registration" method="post" action="DeleteController" class="form-group">
                        <div class="row">
                            
                            <div class="col-md-6">
                                <input type="number" name="id" id="id" placeholder="Employee Id" 
                        class="form-control" >

                            </div>
                      
                        </div>
                        <div class="row">
                            
                        </div>
                        <div class="row">
                            <button type="submit" class="btn btn-success"> Delete </button>

                        </div>
                    </form>
                </div>
                <div class="col-md-3">

                </div>
            </div>
        </div>
</body>
</html>