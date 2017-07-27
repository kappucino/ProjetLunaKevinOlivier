package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/luna_sarl"; 
		String user = "root";
		String password = "";
		String MyRequest = "SELECT * FROM `client` WHERE id_client = 1";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement req1 = con.createStatement();
					System.out.println("Connecté");
					
					
					// TEST
//					ResultSet result = req1.executeQuery(
//							"SELECT * FROM `client` " + "WHERE 1 = 1");
//							System.out.println("Hey !");
//							while(result.next()){
//								System.out.println(result.getString("nom_client") + " - " + result.getString("prenom_client") + " - " + result.getString("code_client"));
//							}

					con.close();
					
			} catch (SQLException ex) {
				System.out.print("Error :" + ex);
			}
	}
}
