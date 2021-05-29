package com.iut.as2021.controller;

import com.iut.as2021.metier.MathResultat;
import com.opensymphony.xwork2.ActionSupport;

public class CalculatriceController extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String expression;
	
	private String resultat;

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	// IT's TERRIBLE !!!!
	private MathResultat calculatrice;

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public CalculatriceController() {

	}

	public String calculer() {
		System.out.println("Je suis bien dans la méthode calculer");
		System.out.println("expression " + expression);
		// on est dans de la 'tut'
		try {
			this.calculatrice = new MathResultat(expression);
			resultat = String.valueOf(calculatrice.calculate());
			System.out.println("resultat calculé " + resultat);
			return "SUCCESS";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("C'est une catastrophe !");
			return "ERROR";
		}
	}

}
