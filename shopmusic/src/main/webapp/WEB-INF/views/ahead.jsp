<!DOCTYPE html>
<html lang="en">
<head>
 <% 
 response.setHeader("pragma", "no-cache");
 response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
 response.setHeader("Expires", "0");
 %>
  <title>Shopmusic</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <head>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script>document.write('<base href="' + document.location + '" />');</script>
    <link href="./resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="./resources/css/style.css" rel="stylesheet" media="screen">
    <script data-require="angular.js@1.0.x" src="http://code.angularjs.org/1.0.7/angular.min.js" data-semver="1.0.7"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    <!--   <a class="navbar-brand" href="/shopmuic/"><span class="glyphicon glyphicon-home"></span></a> -->
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
       <li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">PRODUCTS <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="category?category=piano">Piano</a></li>
					<li><a href="category?category=guitar">Guitar</a></li>
					<li><a href="category?category=tabela">Tabela</a></li>
				</ul></li>
       <li class="active"><a href="/shopmusic/">Home</a></li>
			<!-- <li><a href="ViewCustomer">View Users</a></li>
			<li><a href="ViewItem">View Item</a></li>
			<li><a href="AddItem">AddProducts</a></li> -->
		  
      </ul>
      <ul class="nav navbar-nav navbar-right">
	<li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
	</ul>
    </div>
  </div>
</nav>