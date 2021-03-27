package fr.iut.td1.vue;

import fr.iut.td1.interfaces.IObserver;
import fr.iut.td1.miscs.Observable;

public class UIWindowsGraphe implements IObserver {

	private int num;

	public int getNum() {
		return num;
	}

	public UIWindowsGraphe(int num) {
		System.out.println("Je suis un écran de type Windows");
		this.num = num;
	}

	@Override
	public void update(Observable obj) {
		System.out.println("dans methode update du graphe N° " + num);
	}
}
