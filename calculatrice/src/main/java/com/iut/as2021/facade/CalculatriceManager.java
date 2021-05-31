package com.iut.as2021.facade;

import com.iut.as2021.dao.IDaoMathResult;
import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.metier.MathResultat;

/**
 * Pattern facade : cacher la compléxité d'un code .. Permette sa réutilisation
 * aux autres classes sans avoir à dupliquer le code ..
 * 
 */

public class CalculatriceManager {

	private IDaoMathResult dao;

	private MathResultat calculatrice;

	public CalculatriceManager(IDaoMathResult dao) {
		this.dao = dao;
	}

	// Pattern facade : on va cacher la complexité d'implémentation du code */
	public String calculer(String expression) throws MathsExceptions {
		try {
			this.calculatrice = new MathResultat(expression);
			return String.valueOf(calculatrice.calculate());
		} catch (Exception e) {
			throw new MathsExceptions(e.getMessage());
		}
	}

	public boolean saveResult() {
		// prévoir gestion des exceptions ..
		return dao.create(calculatrice);
	}
}
