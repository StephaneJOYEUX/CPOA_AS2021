package com.iut.as2021.metier;

public class Printer {

	private String nom;
	private String type;

	public String getNom() {
		return nom;
	}

	public String getType() {
		return type;
	}

	public Printer(String nom, String type) {
		this.nom = nom;
		this.type = type;
	}

	public void print(String message) {
		// on image qu'on envoie bien le message à l'imprimante ..
		System.out.println("message imprimé " + message);
	}
}
