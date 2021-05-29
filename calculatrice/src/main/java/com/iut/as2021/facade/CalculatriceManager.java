package com.iut.as2021.facade;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.iut.as2021.dao.IDaoMathResult;
import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.metier.MathResultat;

/**
 * Pattern facade : cacher la compléxité d'un code .. Permette sa réutilisation
 * aux autres classes sans avoir à duplique le code ..
 * 
 */

public class CalculatriceManager {

	private IDaoMathResult dao;

	private MathResultat calculatrice;

	private Double resultat;

	private static final String APPLICATION_CONTEXT_FILE = "applicationContext.xml";

	public CalculatriceManager(IDaoMathResult dao) {
		// On va prépare l'injection ..
		// on continue à préparer l'injection ..
//		ClassPathResource cp = new ClassPathResource(APPLICATION_CONTEXT_FILE);
//		XmlBeanFactory factory = new XmlBeanFactory(cp);
//		dao = (IDaoMathResult) factory.getBean("dao");
//		System.out.println("dao is null" + dao == null);
		this.dao = dao;
		// dao = (IDaoMathResult) getDAOFactory(MYSQL);
	}

	// Pattern facade : on va cacher la complexité d'implémentation du code */
	public String calculer(String expression) throws MathsExceptions {
		try {
			this.calculatrice = new MathResultat(expression);
			return String.valueOf(calculatrice.calculate());
		} catch (Exception e) {
			throw new MathsExceptions(e.getMessage());
		}
	}

	public boolean saveResult() {
		// prévoir gestion des exceptions ..
		return dao.create(calculatrice);
	}
}
