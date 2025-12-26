<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.employeedto.Employee"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Employees</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
        }
        .page-title {
            margin: 20px 0;
            text-align: center;
            font-weight: 600;
        }
        .card {
            margin-top: 20px;
            border-radius: 12px;
        }
        .table thead th {
            background-color: #343a40;
            color: #fff;
        }
        .no-data {
            text-align: center;
            padding: 20px;
            font-style: italic;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Employee Management</a>
    </div>
</nav>

<div class="container">
    <h2 class="page-title">Employee List</h2>

    <div class="card shadow-sm">
        <div class="card-body">

            <%
                // Getting list of employees from request attribute
                List<Employee> empList = (List<Employee>) session.getAttribute("allemployees");
            %>

            <%
                if (empList == null || empList.isEmpty()) {
            %>
                <div class="no-data">No employees found.</div>
            <%
                } else {
            %>
                <div class="table-responsive">
                    <table class="table table-striped table-hover align-middle mb-0">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Employee ID</th>
                                <th>Emp Name</th>
                                <th>Email</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                int index = 1;
                                for (Employee emp : empList) {
                            %>
                                <tr>
                                    <td><%= index++ %></td>
                                    <td><%= emp.getId() %></td>
                                    <td><%= emp.getEmpname() %></td>
                                    <td><%= emp.getEmail() %></td>
                                </tr>
                            <%
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            <%
                }
            %>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>