<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bean" class="bean.EmployeeDispBean" scope="request" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  java.util.List<bean.Employee> employeeList= bean.getEmployeeList();%>
<% for( bean.Employee employeeData : employeeList ) { %>
------------------------------------------<br>
<%= employeeData.getId() %>   <br>
<%= employeeData.getName() %> <br>
<%= employeeData.getHeight() %> <br>
<%= employeeData.geteMail() %> <br>
<%= employeeData.getWeight() %> <br>
<%= employeeData.getHireFiscalYear() %> <br>
<%= employeeData.getBirthday() %> <br>
<%= employeeData.getBloodType() %> <br>
<%} %>

</body>
</html>