package com.iut.as2021.main;

import com.iut.as2021.factory.PrinterFactorySingleton;
import com.iut.as2021.metier.Printer;

public class StartDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sans factory
		Printer p = new Printer("TOTO", "TypeToto");
		Printer p1 = PrinterFactorySingleton.getInstance();
		p.print("toto");
		p1.print("hello world");
		Printer p2 = PrinterFactorySingleton.getInstance();
		System.out.println(p1 == p2);
	}

}
