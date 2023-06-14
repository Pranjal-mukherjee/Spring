<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <!DOCTYPE html>
    <html>
    <head>
    <title>Student Confirmation</title>
    <style>
    .error{
    color : red
    }
    </style>
    </head>
    <body>
    <form:form action= "processForm" modelAttribute = "customer">
    First Name: <form:input path="firstName" /><br>


            Last Name (*): <form:input path="lastName" /><br>
            <form:errors path= "lastName" cssClass = "error"/>

            <br>

             <input type="submit" value="Submit" />
        </form:form>
    </body>
    </html>