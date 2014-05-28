package br.com.tests.connection;


import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.connection.ConnectionFactory;




public class ConnectionFactoryTest {

	@BeforeClass
	public static void forName() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    }
	
	 @Test(expected=SQLException.class)
	public void createConnection() throws SQLException {
	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:SW01");
	    conn.close();
	}
	 
	@Test
	public void executeConnection() throws SQLException {
	    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:SW01", "oracle", "dba");
	    conn.close();
	} 
	
	
	@Test
	public void createFactoryConnection() throws SQLException {
	    ConnectionFactory factory = new ConnectionFactory();
	    assertNotNull(factory.getConnection());
	} 
}
