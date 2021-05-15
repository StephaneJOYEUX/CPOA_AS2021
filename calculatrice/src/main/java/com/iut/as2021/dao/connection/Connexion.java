package com.iut.as2021.dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/***
 * @description, : Classe de connection vers la DB.
 * 
 * @author stephane.joyeux
 *
 */
public class Connexion {

	private static Connection connexion;

	private Connexion() {
		// to avoid direct instanciation ..
	}

	/* @return : une instance en singleton de la connection à la db. */
	public static Connection getConnexion() throws SQLException {
		if (connexion == null) {
			connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculatrice_db?serverTimezone=UTC", "root", "root");
		}
		return connexion;
	}
}
