package com.rental.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rental.beans.UserBean;

public class LoginDAO {

	static Connection con=null;
	static PreparedStatement pst=null;
	static ResultSet rs=null;
	

	//--------------START------get connection---------------
	/**
	 *
	 * @author ARUN
	 * @Date : 11-12-2023
	 * @version : 1.0
	 * @purpose : Initialize database connection
	 * @param : Nothing
	 * @see : Nothing
	 * @return: Connection
	 */
	
	public static Connection getDbConnection()throws SQLException{
	try{
	DBDAO.connect();
	con=DBDAO.getDbCon();
	}catch(ClassNotFoundException ex) {
	ex.printStackTrace();
	}catch(SQLException e){
	e.printStackTrace();
	}
	return con;
	}

	//------------------END-------------database connection---------
	
	//--------------START------checkLogin---------------
	/**
	 * 
	 * @author ARUN
	 * @Date : 11-12-2023
	 * @version : 1.0
	 * @purpose : insert into table
	 * @param : String
	 * @see : Nothing
	 * @return: boolean
	 */
	public static String checkLogin(UserBean userBean) throws SQLException{
		con=getDbConnection();
		String userType="";
		try {
			pst=con.prepareStatement("select user_type from login where username=? and password=?");
			pst.setString(1, userBean.getUserName());
			pst.setString(2, userBean.getUserPass());
			rs=pst.executeQuery();
			while(rs.next()) {
				userType = rs.getString(1);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return userType;
	}
	//--------------END------checkLogin---------------
}
