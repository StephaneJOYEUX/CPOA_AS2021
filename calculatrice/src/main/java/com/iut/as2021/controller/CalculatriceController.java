package com.iut.as2021.controller;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.facade.CalculatriceManager;
import com.opensymphony.xwork2.ActionSupport;

public class CalculatriceController extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String expression;

	private String resultat;

	private String message;

	private static final String APPLICATION_CONTEXT_FILE = "applicationContext.xml";

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

	public CalculatriceController() {
		// on va préparer l'injection ...
		ClassPathResource cp = new ClassPathResource(APPLICATION_CONTEXT_FILE);
		XmlBeanFactory factory = new XmlBeanFactory(cp);

		this.manager = (CalculatriceManager) factory.getBean("calculatriceManager");
	}

	public String calculer() {
		System.out.println("expression " + expression);
		try {
			resultat = manager.calculer(expression);
			manager.saveResult();
			// Dispatch la bonne page en fonction du résultat ..
			return "SUCCESS";
		} catch (MathsExceptions e) {
			System.out.println("Il y a une erreur ..");
			message = e.getMessage();
			return "ERROR";
		}
	}

	private String getMessage() {
		return message;
	}

	private void setMessage(String message) {
		this.message = message;
	}

}
