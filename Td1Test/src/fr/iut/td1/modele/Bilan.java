package fr.iut.td1.modele;

import fr.iut.td1.miscs.Observable;

public class Bilan extends Observable {

	public Bilan() {
		super();
		System.out.println("dans constructeur bilan");
	}

	public void setChange() {
		System.out.println("dans m�thode setChange .. le bilan est � jour ...");
		this.notify1();
	}

}
