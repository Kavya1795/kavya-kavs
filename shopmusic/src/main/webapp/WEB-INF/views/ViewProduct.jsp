<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@include file="ahead.jsp" %>
<br><br><br>
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
	.carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
      }
      body
{
background-image: url(resources/images/27.jpg);
background-size:100% 100%;
background-repeat:no repeat;
}
  </style>

<div>
<center><img src="resources/images/18.jpg" style="width:300px;height: 300px"></center>
</div>
<div>
<div class="container">
  <div ng-app="myApp" ng-controller="dataCtrl">
  Data:${listOfCustomers}
Enter Name/Email ID: <input type="text"  ng-model="search">&nbsp&nbsp<span class="glyphicon glyphicon-search"></span>
    <hr></hr>
    <table class="table table-striped">
    <tr>
    <th>itemId</th>
    <th>itemName</th>
    <th>Description</th>
     <th>Category</th>
     <th>Price</th>
        <th>Images</th>
    </tr>
        <tr ng-repeat="resource in names | filter:search">
             <td>{{resource.itemId}}</td>
            <td>{{ resource.itemName}}</td>
            <td>{{ resource.description}}</td>
             <td>{{ resource.category}}</td>
             <td>{{ resource.price}}</td>
             <td><img src="resources/images/{{resource.itemId}}.jpg" style="width:100px;height:100px"></td>
             
            <td><a href="deleteItem?id={{resource.itemId}}" onclick="return confirm('Do You Want To Delete This Item');">delete</a></td>
        
        <td><a href="updateItem?id={{resource.itemId}}">update</a></td>
        
        </tr>
        
      </table>
</div>

<script>
angular.module('myApp',[]).controller('dataCtrl',function($scope)
		{
	
		$scope.names=${item};
		$scope.orderByMe=function(x)
		{
			$scope.myOrderBy=x;
			}
		});
</script>
<%@include file="footer.jsp" %>
