package br.com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String SERVER_NAME = "127.0.0.1";
	private String PORT_NUMBER = "1521";
	private String SID = "SW01";
	
	private String URL = "jdbc:oracle:thin:@" + SERVER_NAME + ":" + PORT_NUMBER + ":" + SID;
	
	private String USERNAME = "oracle";
	private String PASSWORD = "dba";
	
	static{
		try {
			//Carrega o driver JDBC
			String driverName = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * @return retorna um objeto do tipo java.sql.Connection
	 * */
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}
}
