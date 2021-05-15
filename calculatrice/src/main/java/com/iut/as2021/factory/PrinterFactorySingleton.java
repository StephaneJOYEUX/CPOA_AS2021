package com.iut.as2021.factory;

import com.iut.as2021.metier.Printer;

public class PrinterFactorySingleton {

	private static Printer printer;

	public static synchronized Printer getInstance() {
		// la factory a pour rôle de construite un objet imprimante.
		// doit renseigner les paramètres lui permettant de construire l'objet.
		if (printer == null) {
			printer = new Printer("dfsdf", "dfsds");
		}
		return printer;
	}
}
