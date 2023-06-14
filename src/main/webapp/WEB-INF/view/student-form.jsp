<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName" /><br>
        this will call firstNamegetter method when form will load and seetter method when form will get submitted

        Last Name: <form:input path="lastName" /><br>

        <br>
        Country :
        <form:select path="country">
                    <form:options items="${student.countryOptions}" />
                 </form:select>

         <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
