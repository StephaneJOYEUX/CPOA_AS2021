package com.iut.as2021.tools;

import static com.iut.as2021.tools.IutTools.countChars;
import static com.iut.as2021.tools.IutTools.getLeftExpression;
import static com.iut.as2021.tools.IutTools.getRightExpression;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @description : Test de la classe {@link IutTools}.
 * 
 * @author : stephane.joyeux.
 * 
 * @date : Mai 2021.
 *
 */
public class IutToolsTest {

	private static final String EXPRESSION = "(((2 + 3)) * (4 + 5) + 2)";
	
	@Test
	public void testGetLeftExpression() {
		assertEquals(getLeftExpression(EXPRESSION, 10), "(((2 + 3))");
	}
	
	@Test
	public void testGetRightExpression() {
		assertEquals(getRightExpression(EXPRESSION, 11), "(4 + 5) + 2)");
	}
	
	@Test
	public void testCountChars() {
		assertEquals(countChars(EXPRESSION, '('), 4);
	}
}
