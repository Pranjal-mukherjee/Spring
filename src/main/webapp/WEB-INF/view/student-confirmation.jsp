<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
FirstName : ${student.firstName}

LastName : ${student.lastName}

          <%
                   String countryname = request.getParameter("country");
            %>
                <h2>Student Country: <%= countryname %></h2>
</body>
</html>