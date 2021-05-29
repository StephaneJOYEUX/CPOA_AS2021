package com.iut.as.modele;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String numeroClient;

	private String nom;
	private String adresse;

	// 1 Client possède 1 ou plusieurs comptes :
	// 1 client 'estTitulaire' de 1 ou plusieurs comptes.
	private List<Compte> comptes;

	public List<Compte> getComptes() {
		return comptes;
	}

	public Client(String numeroClient, String nom, String adresse) {
		super();
		this.numeroClient = numeroClient;
		this.nom = nom;
		this.adresse = adresse;
		this.comptes = new ArrayList<>();
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumeroClient() {
		return numeroClient;
	}

	public String getNom() {
		return nom;
	}

	/* Fonction qui permet d'ajouter un compte à un client. */
	public boolean addCompte(Compte compte) {
		if (compte != null) {
			this.comptes.add(compte);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String ret = "Client N° " + numeroClient + " / nom " + nom + " / adresse " + adresse + "\n";
		if (comptes != null && !comptes.isEmpty()) {
			for (Compte compte : comptes) {
				ret += compte.toString();
			}

		}
		return ret;
	}
}
