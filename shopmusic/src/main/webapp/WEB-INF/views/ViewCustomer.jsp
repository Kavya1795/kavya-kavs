<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@include file="ahead.jsp" %>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }

body
{
background-image: url(resources/images/112.jpg);
background-size:100% 100%;
background-repeat:no repeat;
}

	.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
      
  </style>

<div>
<center><img src="resources/images/20.jpg" style="width:300px;height: 300px"></center>
</div>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  Data:${ss}
Enter Name/Email ID: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>id</th>
    <th>username</th>
    <th>emailId</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.customerId}}</td>
            <td>{{ resource.username}}</td>
            <td>{{ resource.emailId}}</td>
           
        </tr>    
    </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${listOfCustomers};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script> 
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="footer.jsp" %>>