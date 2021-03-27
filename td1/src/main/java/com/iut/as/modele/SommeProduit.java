package com.iut.as.modele;

import com.iut.as.interfaces.ISommeProduit;

public class SommeProduit implements ISommeProduit {

	@Override
	public int somme(int a, int b) {
		return a + b;
	}

	@Override
	public int produit(int a, int b) {
		return a * b;
	}

}
