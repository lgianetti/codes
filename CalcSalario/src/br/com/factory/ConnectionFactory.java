package br.com.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//Cria uma conexao com o banco de dados
	
	private String SERVERNAME = "127.0.0.1";
	private String PORTNUMBER = "1521";
	private String SID = "SW01";
	private String URL = "jdbc:oracle:thin:@"+SERVERNAME+":"+PORTNUMBER+":"+SID;
	
	private String USERNAME = "oracle";
	private String PASSWORD = "oracle$";
	
	static{
		try{
			//Carrega o JDBC driver
			String driverName = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driverName);
		}catch(ClassNotFoundException e ){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		try {
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
