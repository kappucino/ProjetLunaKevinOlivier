package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GlobalConnecxion {

	
	private String url = "jdbc:mysql://localhost:3306/luna_sarl";
	String user = "root";
	String password = "";
	
	private static Connection connect;
	
	private GlobalConnecxion(){
		try {
			connect = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public static Connection getInstance(){
		if(connect == null ){
			
			new GlobalConnecxion();
		}
		return connect;
	}
	
}