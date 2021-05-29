package com.iut.as2021.dao.controleur;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.metier.MathResultat;
import com.opensymphony.xwork2.ActionSupport;

public class MathControleur extends ActionSupport {

	/* expression qui provient de la page jsp */
	private String expression;

	private MathResultat manager;

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String runCalcul() throws MathsExceptions {
		// code horrible !!
		manager = new MathResultat(expression);
		return String.valueOf(manager.getValue());
	}

}
