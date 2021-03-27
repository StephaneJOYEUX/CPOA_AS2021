package fr.iut.td1.vue;

import fr.iut.td1.interfaces.IObserver;
import fr.iut.td1.miscs.Observable;

public class UIPhoneGraphe implements IObserver {

	private int num;

	public int getNum() {
		return num;
	}

	public UIPhoneGraphe(int num) {
		System.out.println("Je suis un écran de type IPhone");
		this.num = num;
	}

	@Override
	public void update(Observable obj) {
		System.out.println("dans methode update de IPhone N° " + num);
	}
}
