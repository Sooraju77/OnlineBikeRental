<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.rental.beans.BikeBeans"%>
<%@page import="com.rental.dao.BikeDAO"%>
<%@ page language="java" import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/home.css" />
</head>
<body>
	<% 
		int bikeID = Integer.parseInt(request.getParameter("bikeID"));
		String result = BikeDAO.rentBike(bikeID);
	%>
	<h1><%=result %></h1>
</body>
</html>