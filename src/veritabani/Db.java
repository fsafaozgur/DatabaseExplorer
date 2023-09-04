/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veritabani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Almıla Nur Yavru
 */
public class Db {
    
    private String username;
    private String password;
    private String database;
    private ResultSet rs;
    private Connection c;

    
    public Db (String n, String pw, String db){
            username=n;
            password=pw;
            database=db;
    }
    
    public Connection connect() throws SQLException, ClassNotFoundException{
    
                //Loading the required JDBC Driver class
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		//Creating a connection to the database
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName="+database,username,password);
		return conn;
	    
    }
    
    public ResultSet query(Connection conn, String query) throws SQLException{
          
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
    
              
        return rs;
    
    }
}
