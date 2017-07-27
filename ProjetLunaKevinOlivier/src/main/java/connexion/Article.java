package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import dialog.FArticle;

public class Article {
	private int code_article;
	private String categorie;
	private String designation;
	private int quantite;
	private double prix_unitaire;
	
	String url = "jdbc:mysql://localhost:3306/luna_sarl"; 
	String user = "root";
	String password = "";
	
	public Article(){
		
	}
	
	public void NewArticle(int code_article, String categorie, String designation, int quantite, double prix_unitaire) {
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement req1 = con.createStatement();
			
			req1.executeUpdate(
//			"INSERT INTO articles (code_article, categorie, designation, quantite, prix_unitaire) VALUES ( 6, 'nourriture', 'schzesuansauce', 50, 13.00)");
			"INSERT INTO articles (code_article, categorie, designation, quantite, prix_unitaire) VALUES (" + code_article + ", " + "'" + categorie + "'" + ", " + "'" + designation + "'" + ", " + 50 + ", " + prix_unitaire + ")");
			System.out.println("Hey !");


	con.close();
	
} catch (SQLException ex) {
System.out.print("Error :" + ex + "\n");
FArticle frame = new FArticle();

JOptionPane.showMessageDialog(frame, "Error :" + ex);
System.out.println("INSERT INTO articles (code_article, categorie, designation, quantite, prix_unitaire) VALUES ( " + code_article + ", " + categorie + ", " + designation + ", " + 50 + ", " + prix_unitaire + ")");
}
		}
	
	public void ModifArticle(int code_article, String categorie, String designation, double prix_unitaire){
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement req1 = con.createStatement();
			
			req1.executeUpdate(
			"UPDATE articles SET categorie = "+ "'" + categorie + "'" + ", designation = " + "'" 
				+ designation + "' , prix_unitaire = " + prix_unitaire + " WHERE code_article = " + code_article);
			System.out.println("Hey !");


	con.close();
	
} catch (SQLException ex) {
System.out.print("Error :" + ex + "\n");
FArticle frame = new FArticle();

JOptionPane.showMessageDialog(frame, "Error :" + ex);
}
	}
	
	
	public void GetArticle(JTable table){
		
		   for (int i = 0; i < table.getRowCount(); i++) {
			      for(int j = 0; j < table.getColumnCount(); j++) {
			          table.setValueAt("", i, j);
			      }
			   }
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement req1 = con.createStatement();
			
			ResultSet result = req1.executeQuery(
					"SELECT * FROM `articles` ");
					int i = 0;
					while(result.next()){

						System.out.println(result.getString("code_article") + " - " + result.getString("categorie") + " - " + result.getString("designation") + " - " + result.getString("quantite") + " - " + result.getString("prix_unitaire"));
						table.setValueAt(result.getString("code_article"), i, 0);
						table.setValueAt(result.getString("categorie"), i, 1);
						table.setValueAt(result.getString("designation"), i, 2);
						table.setValueAt(result.getString("quantite"), i, 3);
						table.setValueAt(result.getString("prix_unitaire"), i, 4);
						i++;
					}
					
					con.close();
	
} catch (SQLException ex) {
System.out.print("Error :" + ex + "\n");
FArticle frame = new FArticle();
JOptionPane.showMessageDialog(frame, "Error :" + ex);
	}
	}
	
	
	public void GetArticle(JTable table, String method){
		   for (int i = 0; i < table.getRowCount(); i++) {
			      for(int j = 0; j < table.getColumnCount(); j++) {
			          table.setValueAt("", i, j);
			      }
			   }
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement req1 = con.createStatement();
			
			ResultSet result = req1.executeQuery(
					"SELECT * FROM `articles` ORDER BY " + method + ";");
					int i = 0;
					while(result.next()){

						System.out.println(result.getString("code_article") + " - " + result.getString("categorie") + " - " + result.getString("designation") + " - " + result.getString("quantite") + " - " + result.getString("prix_unitaire"));
						table.setValueAt(result.getString("code_article"), i, 0);
						table.setValueAt(result.getString("categorie"), i, 1);
						table.setValueAt(result.getString("designation"), i, 2);
						table.setValueAt(result.getString("quantite"), i, 3);
						table.setValueAt(result.getString("prix_unitaire"), i, 4);
						i++;
					}
					
					con.close();
	
} catch (SQLException ex) {
System.out.print("Error :" + ex + "\n");
FArticle frame = new FArticle();
JOptionPane.showMessageDialog(frame, "Error :" + ex);
	}
	}
	
	
	
	public void SupprArticle(int code_article) {
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement req1 = con.createStatement();
			
			int result = req1.executeUpdate(
					"DELETE FROM `articles` WHERE code_article = " + code_article);
					
					con.close();
	
} catch (SQLException ex) {
System.out.print("Error :" + ex + "\n");
FArticle frame = new FArticle();
JOptionPane.showMessageDialog(frame, "Error :" + ex);
	}
	}
}
	
