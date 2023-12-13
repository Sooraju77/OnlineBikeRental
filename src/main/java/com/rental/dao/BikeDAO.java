package com.rental.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.rental.beans.BikeBeans;

public class BikeDAO {

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
	 * @purpose : retrieve data from table
	 * @param : nothing
	 * @see : table data
	 * @return: ArrayList
	 */
	public static ArrayList<BikeBeans> getAvalaibleBikes() throws SQLException{
		con=getDbConnection();
		int bikeId=0;
		String brand="";
		String model="";
		String registration_no="";
		Float rent=0f;
		String avalaibility="";
		String image="";
		
		BikeBeans bikeBeans;
		ArrayList<BikeBeans> avaBikes = new ArrayList<BikeBeans>();
		
		try {
			pst=con.prepareStatement("select * from bikes where avalaibility='avalaible'");
			rs=pst.executeQuery();
			while(rs.next()) {
				bikeId = rs.getInt(1);
				brand = rs.getString(2);
				model = rs.getString(3);
				registration_no = rs.getString(4);
				rent = rs.getFloat(5);
				avalaibility = rs.getString(6);
				image = rs.getString(7);
				bikeBeans = new BikeBeans(bikeId, brand, model, registration_no, rent, avalaibility, image);
				avaBikes.add(bikeBeans);	
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return avaBikes;
	}
	//--------------END------checkLogin---------------
	
	//--------------START------checkLogin---------------
		/**
		 * 
		 * @author ARUN
		 * @Date : 13-12-2023
		 * @version : 1.0
		 * @purpose : update data from table
		 * @param : int
		 * @see : nothing
		 * @return: String 
		 */
		public static String rentBike(int bikeID) throws SQLException{
			con=getDbConnection();
			
			String results="ErrOr UNABLE TO rENt !!";
			try {
				pst=con.prepareStatement("update bikes set avalaibility='rented' where bike_id='"+bikeID+"'");
				int result=pst.executeUpdate();
				if(result>0) {
					results="SUCCESSFULLY rENtED..rIDE CArEFULLY";
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return results;
		}
		//--------------END------checkLogin---------------
}
