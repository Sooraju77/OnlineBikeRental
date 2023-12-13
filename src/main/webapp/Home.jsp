<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.rental.beans.BikeBeans"%>
<%@page import="com.rental.dao.BikeDAO"%>
<%@ page language="java" import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="css/home.css" />
</head>
<body>
	<h1>rUN BIKE rENtALS</h1>
	<hr color= #F2771A>
	<div class="grid-container">
	
		<%
			ArrayList<BikeBeans> avaBikes = BikeDAO.getAvalaibleBikes();
			for(BikeBeans bikes : avaBikes){%>
				<div class="grid-item">
					<img src="<%=bikes.getImage()%>" alt="Bike Image" width="200" height="250"/><br>
					Brand : <%=bikes.getBrand() %><br>
					Model : <%=bikes.getModel() %><br>
					Rent : <%=bikes.getRent() %><br>
					<a href='RentBike.jsp?bikeID=<%=bikes.getBikeId() %>'>RENT</a>
				</div>
		<%}%>
	</div>

</body>
</html>