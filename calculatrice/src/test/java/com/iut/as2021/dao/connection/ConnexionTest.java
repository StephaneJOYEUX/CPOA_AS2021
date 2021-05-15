package com.iut.as2021.dao.connection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

public class ConnexionTest {

	@Test
	public void testConnexionIsValid() throws SQLException {
		assertNotNull(Connexion.getConnexion());
	}

	@Test
	public void testConnexionIsSingleton() throws SQLException {
		Connection connection1 = Connexion.getConnexion();
		Connection connection2 = Connexion.getConnexion();
		assertEquals(connection1, connection2);
	}
}
