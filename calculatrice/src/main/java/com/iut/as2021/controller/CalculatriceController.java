package com.iut.as2021.controller;

import com.iut.as2021.config.BeanManager;
import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.facade.CalculatriceManager;
import com.opensymphony.xwork2.ActionSupport;

public class CalculatriceController extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String expression;

	private String resultat;

	private static final String MANAGER_NAME = "calculatriceManager";

	private String message;

	// J'associe le controleur avec le manager ..
	private CalculatriceManager manager;

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CalculatriceController() {
		this.manager = (CalculatriceManager) BeanManager.getNewBean(MANAGER_NAME);
	}

	public String calculer() {
		System.out.println("expression " + expression);
		try {
			resultat = manager.calculer(expression);
			manager.saveResult();
			return "SUCCESS";
		} catch (MathsExceptions e) {
			System.out.println("Il y a une erreur ..");
			message = e.getMessage();
			return "ERROR";
		}
	}
}
