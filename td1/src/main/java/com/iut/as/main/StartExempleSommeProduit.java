package com.iut.as.main;

import com.iut.as.interfaces.ISommeProduit;
import com.iut.as.modele.SommeProduit;

public class StartExempleSommeProduit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISommeProduit somme = new SommeProduit();
		System.out.println(somme.produit(2, 3));
	}

}
