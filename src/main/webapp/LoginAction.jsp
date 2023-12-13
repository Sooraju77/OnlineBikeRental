<%@page import="com.rental.beans.UserBean"%>
<%@page import="com.rental.dao.LoginDAO"%>
<%@ page language="java" import="java.sql.*,java.util.*"%>

<%
	String userName = request.getParameter("username");
	String userPass = request.getParameter("password");
	
	UserBean userBean = new UserBean();
	userBean.setUserName(userName);
	userBean.setUserPass(userPass);
	
	String userType	= LoginDAO.checkLogin(userBean);
	if(userType.equals("admin")){
		response.sendRedirect("AdminHome.jsp");
	}else if(userType.equals("customer")){
		response.sendRedirect("Home.jsp");
	}else{
		response.sendRedirect("Login.jsp");
	}

%>