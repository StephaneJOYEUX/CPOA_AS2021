package com.iut.as2021.factory;

import com.iut.as2021.metier.Printer;

public class PrinterFactory {

	private static Printer printer;

	public static Printer getInstance() {
		// la factory a pour rôle de construite un objet imprimante.
		// doit renseigner les paramètres lui permettant de construire l'objet.
		printer = new Printer("dfsdf", "dfsds");
		return printer;
	}

}
