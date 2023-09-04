/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veritabani;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



public class Veritabani {

    /**
     * @param args the command line arguments
     * 
     * 
     */
        
        
        public static String username;
        public static String password;
        public static String database;
       
    	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
                login l = new login();
                l.setVisible(true);
            
            
		/*//Loading the required JDBC Driver class
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		
		//Creating a connection to the database
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=veri","safa","590590");
		
		//Executing SQL query and fetching the result
		Statement st = conn.createStatement();
		String sqlStr = "select * from veriler";
		ResultSet rs = st.executeQuery(sqlStr);
		while (rs.next()) {
			System.out.print(rs.getString("id"));
                        System.out.print("   ");
                        System.out.print(rs.getString("isim"));
                        System.out.print("   ");
                        System.out.println(rs.getString("soyad"));
                        
		}*/		
	}
    
}
