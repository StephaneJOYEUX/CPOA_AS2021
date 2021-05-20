package com.iut.as2021.tools;

public class IutTools {

	public static String getLeftExpression(String expression, int pos) {
		return expression.substring(0, pos).trim();
	}

	public static String getRightExpression(String expression, int pos) {
		return expression.substring(pos + 1).trim();
	}

	public static int countChars(String expression, char charToFind) {
		int nb = 0;
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == charToFind)
				nb++;
		}
		return nb;
	}
}
