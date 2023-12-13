package com.rental.beans;

public class UserBean {

	/*
	 * @author : ARUN
	 * @Date : 11-12-2023
	 * @Version : 1.0
	 * @Purpose : Bean / Model for login table
	 */
	
	private int userId;
	private String userName;
	private String userPass;
	private String userType;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
}
