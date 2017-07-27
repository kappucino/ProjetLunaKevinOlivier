package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin {
	
	private String login;
	private String password;
	
	public Admin(){
		
	}
	
	public Admin(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		
		try {
			GlobalConnecxion.getInstance();
			String str = "select * from admin";

			Statement req1 = GlobalConnecxion.getInstance().createStatement();
			ResultSet rs = req1.executeQuery(str);
			while (rs.next()) {

				
				System.out.println(rs.getString("nom_admin"));
				

			}
			rs.close();
			req1.close();
			GlobalConnecxion.getInstance().close();
		} catch (SQLException esql) {
			System.out.println("une exception s'est produite");
		}
		
		
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void verifLogin(String login){
		
	}

}
