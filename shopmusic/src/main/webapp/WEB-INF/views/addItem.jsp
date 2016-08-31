<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@include file="ahead.jsp" %>
<style>
body
{
background-image: url(resources/images/112.jpg);
background-size:100% 100%;
background-repeat:no repeat;
}
</style>
<form:form action="addProduct" commandName="item" enctype="multipart/form-data">
<table align="center">
<tr><td>Name</td><td><form:input path="itemName"></form:input>
<form:errors path="itemName"></form:errors></td><br>

<tr><td>Description</td><td> <form:input  path="description"/> 
<form:errors path="description"></form:errors></td><br>

<tr><td>Price</td><td><form:input path="price"></form:input></td><br>

<tr><td>Category :</td><td><form:select path="category"> 
<form:option value="guitar">guitar</form:option>
<form:option value="piano">piano</form:option>
<form:option value="tabela">tabela</form:option>
</form:select></td>
<br>
<tr><td>Image : </td><td><input type="file" name="file"></td><br>

<tr><td><input type="submit" value="addproducts"></td></tr><br>
</table>
</form:form>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="footer.jsp"%>