package com.qa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class DBConnection {
	
	public static WebDriver driver;

	// public Robot robot = null ;
	Logger log = (Logger) LogManager.getLogger("DBConnection.java");
	
	public DBConnection(WebDriver driver) {
		this.driver = driver;
	}
	
	private static String db_url = "jdbc:postgresql://10.53.97.200:5432/ehubdb?currentSchema=ehub&stringtype=unspecified";
	private static String username = "ehubdb";
	private static String pass = "ehubdb";
	private static Statement statement;
	
	private static Connection openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(db_url, username, pass);
	}
	
	
	public boolean executeUpdate(String query) throws SQLException, ClassNotFoundException {
		log.info("Opening database connection..");
		boolean flag = false;
		Connection con = openConnection();
		log.info("Connection succeessfull..");
		if(query != null && con != null) {
			try {
				statement = con.createStatement();
				statement.executeUpdate(query);
				log.info("Query executed..");
				flag = true;
			} catch (SQLException e) {
				e.printStackTrace();
				log.info("Exception occured");
				flag = false;
			} finally {
				con.close();
				log.info("Connection closed..");
			}
		}
		return flag;
	}
	}

