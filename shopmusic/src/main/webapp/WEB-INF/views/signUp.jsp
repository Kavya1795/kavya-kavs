<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body
{
background-image: url(resources/images/114.jpg);
background-size:100% 100%;
background-repeat:no repeat;
}
</style>
</head>
	<%@include file="header.jsp" %>
<body>
<form:form action="register" commandName="cust" method="POST">
<br><br><br><br><br><br><br><br><br><br><br>
<center>
UserName: <form:input path="username"></form:input><form:errors path="username"></form:errors><br><br>

        Password: <form:password path="password"></form:password><form:errors path="password"></form:errors><br><br>
        
        EmailId : <form:input path="emailId"></form:input><form:errors path="emailId"></form:errors><br><br>
        
<input type="submit" value="Register"/>
</center>
</form:form><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="footer.jsp" %>
</body>
</html>