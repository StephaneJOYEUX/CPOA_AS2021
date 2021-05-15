package com.iut.as2021.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.iut.as2021.dao.connection.Connexion;
import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.metier.MathResultat;

public class MySqlDao implements IDaoMathResult {

	private static IDaoMathResult instance;
	private Connection connection = null;

	private MySqlDao() {
		try {
			connection = Connexion.getConnexion();
		} catch (SQLException e) {
			// beurk ..
			System.out.println("Connection vers la db indispossible ..");
		}
	}

	public static IDaoMathResult getInstance() {
		if (instance == null) {
			return new MySqlDao();
		}
		return instance;
	}

	@Override
	public MathResultat readyById(int i) {
		MathResultat result = null;
		try {
			String sql = "SELECT * FROM Calc WHERE id = ?";
			PreparedStatement query = connection.prepareStatement(sql);
			query.setInt(1, i);
			ResultSet res = query.executeQuery();
			while (res.next()) {
				String expression = res.getString("expression");
				result = new MathResultat(expression);
			}
		} catch (SQLException | MathsExceptions e) {
			// beurk ..
			System.out.println(e.getMessage());
		}
		return result;
	}

	@Override
	public List<MathResultat> getAll() {
		return null;
	}

	@Override
	public boolean update(MathResultat object) {
		return false;
	}

	@Override
	public boolean create(MathResultat object) {
		return false;
	}

	@Override
	public boolean delete(MathResultat object) {
		return false;
	}
}
