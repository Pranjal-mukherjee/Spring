<!DOCTYPE html>
<html>
<body>
Hello World Of Spring
<br><%
           String studentName = request.getParameter("studentName");
    %>
        <h2>Student name: <%= studentName %></h2>
        <br>
      The message: <%= request.getAttribute("message") %>
</body>
</html>
