package br.com.tests.connection;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import br.com.connection.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test(expected=SQLException.class)
	public void getConnection() throws SQLException{
		 try {
			 ConnectionFactory factory = new ConnectionFactory();
			 factory.getConnection();
			 Assert.fail("Expected SQL Exception was not thrown");
		    } catch (SQLException e) {
		    	Assert.assertEquals(21, e.getErrorCode());
		    }
	}
}
