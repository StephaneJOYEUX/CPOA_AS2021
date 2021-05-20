package com.iut.as2021.metier;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.iut.as2021.exceptions.MathsExceptions;

/***
 * https://web2.0calc.fr/
 * 
 * @author stephane.joyeux
 *
 */
public class MathResultatTest {

	private MathResultat resultat;

	@Test
	public void _00_testExpressionEstVide() throws MathsExceptions {
		resultat = new MathResultat("");
		assertEquals(resultat.getValue(), 0, 0);
	}

	@Test
	public void _01_testExpressionEstNull() throws MathsExceptions {
		resultat = new MathResultat(null);
		assertEquals(resultat.getValue(), 0, 0);
	}

	@Test
	public void _02_testExpressionSimpleAddition() throws MathsExceptions {
		resultat = new MathResultat("2 + 3");
		assertEquals(resultat.getValue(), 5, 0);
	}

	@Test
	public void _03_testExpressionSimpleSoustraction() throws MathsExceptions {
		resultat = new MathResultat("2 - 3");
		assertEquals(resultat.getValue(), -1, 0);
	}

	@Test
	public void _04_testExpressionSimpleMultiplication() throws MathsExceptions {
		resultat = new MathResultat("9 * 8");
		assertEquals(resultat.getValue(), 72, 0);
	}

	@Test
	public void _05_testExpressionSimpleDivision() throws MathsExceptions {
		resultat = new MathResultat("8 / 2");
		assertEquals(resultat.getValue(), 4, 0);
	}
	
	@Test
	public void _06_testExpressionWithBracketSimpleMultiplication() throws MathsExceptions {
		resultat = new MathResultat("(2 + 3) * 7");
		assertEquals(resultat.getValue(), 35, 0);
	}

	@Test
	public void _07_testExpressionWithBracketSimpleAddition() throws MathsExceptions {
		resultat = new MathResultat("(2 + 3) + 7");
		assertEquals(resultat.getValue(), 12, 0);
	}

	@Test
	public void _08_testExpressionWithBracketSimpleDivision() throws MathsExceptions {
		resultat = new MathResultat("(8 + 4) / 3");
		assertEquals(resultat.getValue(), 4, 0);
	}

	@Test
	public void _09_testExpressionWithBracketSimpleSoustraction() throws MathsExceptions {
		resultat = new MathResultat("(8 + 4) - 3");
		assertEquals(resultat.getValue(), 9, 0);
	}

	@Test
	public void _10_testExpressionSimpleAdditionMultiples() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 - 1 + 7 + 8");
		assertEquals(resultat.getValue(), 19, 0);
	}

	@Test
	public void testExpressionSimpleSoustractionMultiple() throws MathsExceptions {
		resultat = new MathResultat("7 - 3 + 1");
		assertEquals(resultat.getValue(), 5, 0);
	}

	@Test
	public void testExpressionSimpleAvecMultiplication() throws MathsExceptions {
		resultat = new MathResultat("7 + 1 * 3 + 1");
		assertEquals(resultat.getValue(), 11, 0);
	}

	@Test
	public void testExpressionComplexe() throws MathsExceptions {
		resultat = new MathResultat("7 + 4 * 3 * 4 + 1");
		assertEquals(resultat.getValue(), 56, 0);
	}

	@Test
	public void testExpressionSimpleAdditionExpressionErronnee() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 + ");
		assertEquals(resultat.getValue(), 5, 0);
	}

	@Test
	public void testExpressionPriorityToMultiply() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 * 5 - 1 + 2");
		assertEquals(resultat.getValue(), 18, 0);
	}

	@Test
	public void testExpressionPriorityToSeveralMultiply() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 * 5 * 2 + 7");
		assertEquals(resultat.getValue(), 39, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithBracket() throws MathsExceptions {
		resultat = new MathResultat("(2 + 3) + 11");
		assertEquals(resultat.getValue(), 16, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithTwoBrackets() throws MathsExceptions {
		resultat = new MathResultat("(2 + 5) + (1 * 5)");
		assertEquals(resultat.getValue(), 12, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithSeveralBrackets() throws MathsExceptions {
		resultat = new MathResultat("((((2 + 3)) * ((4 + 5))))");
		assertEquals(resultat.getValue(), 45, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithTwoBracketsAndMultiply() throws MathsExceptions {
		resultat = new MathResultat("(2 + 5) * (1 + 3)");
		assertEquals(resultat.getValue(), 28, 0);
	}

	@Test
	public void testExpressionMultiplicationAndAddition() throws MathsExceptions {
		resultat = new MathResultat("7 + 4 * 3 + 2 + 1");
		assertEquals(resultat.getValue(), 22, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithSeveralBracketsPlus() throws MathsExceptions {
		resultat = new MathResultat("(((2 + 3)) * (4 + 5) + 2)");
		assertEquals(resultat.getValue(), 47, 0);
	}
	
	@Test
	public void testExpressionComplexWithSeveralBrackets() throws MathsExceptions {
		resultat = new MathResultat("(((((2 + 3)) * ((4 + 5)) + 2)))");
		assertEquals(resultat.getValue(), 47, 0);
	}
	
//	@Test
//	public void testExpressionComplexWithSeveralBrackets2() throws MathsExceptions {
//		resultat = new MathResultat("(((((2 + 3)) * ((4 + 5)) + 2))) + 3 * 2");
//		assertEquals(resultat.getValue(), 100, 0);
//	}
}
