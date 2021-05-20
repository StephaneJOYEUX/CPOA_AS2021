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

	public void _00_testExpressionEstVide() throws MathsExceptions {
		resultat = new MathResultat("");
		assertEquals(resultat.calculate(), 0, 0);
	}

	public void _01_testExpressionEstNull() throws MathsExceptions {
		resultat = new MathResultat(null);
		assertEquals(resultat.calculate(), 0, 0);
	}
	
	@Test
	public void _02_testExpressionSimpleAddition() throws MathsExceptions {
		resultat = new MathResultat("2 + 3");
		assertEquals(resultat.calculate(), 5, 0);
	}

	@Test
	public void _03_testExpressionSimpleSoustraction() throws MathsExceptions {
		resultat = new MathResultat("2 - 3");
		assertEquals(resultat.calculate(), -1, 0);
	}

	@Test
	public void testExpressionWithBracketSimple() throws MathsExceptions {
		resultat = new MathResultat("(2 + 3) * 7");
		assertEquals(resultat.calculate(), 35, 0);
	}

	@Test
	public void testExpressionWithBracketSimples2() throws MathsExceptions {
		resultat = new MathResultat("(2 + 3) + 7");
		assertEquals(resultat.calculate(), 12, 0);
	}

	@Test
	public void testExpressionWithBracketSimples3() throws MathsExceptions {
		resultat = new MathResultat("(8 + 4) / 3");
		assertEquals(resultat.calculate(), 4, 0);
	}

	@Test
	public void testExpressionWithBracketSimples4() throws MathsExceptions {
		resultat = new MathResultat("(8 + 4) - 3");
		assertEquals(resultat.calculate(), 9, 0);
	}

	@Test
	public void testExpressionSimpleAdditionMultiple() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 - 1 + 7 + 8");
		assertEquals(resultat.calculate(), 19, 0);
	}

	@Test
	public void testExpressionSimpleSoustractionMultiple() throws MathsExceptions {
		resultat = new MathResultat("7 - 3 + 1");
		assertEquals(resultat.calculate(), 5, 0);
	}

	@Test
	public void testExpressionSimpleAvecMultiplication() throws MathsExceptions {
		resultat = new MathResultat("7 + 1 * 3 + 1");
		assertEquals(resultat.calculate(), 11, 0);
	}

	@Test
	public void testExpressionComplexe() throws MathsExceptions {
		resultat = new MathResultat("7 + 4 * 3 * 4 + 1");
		assertEquals(resultat.calculate(), 56, 0);
	}

	@Test
	public void testExpressionSimpleMultiplication() throws MathsExceptions {
		resultat = new MathResultat("9 * 8");
		assertEquals(resultat.calculate(), 72, 0);
	}

	@Test
	public void testExpressionSimpleDivision() throws MathsExceptions {
		resultat = new MathResultat("8 / 2");
		assertEquals(resultat.calculate(), 4, 0);
	}

	@Test
	public void testExpressionSimpleAdditionExpressionErronnee() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 + ");
		assertEquals(resultat.calculate(), 5, 0);
	}

	@Test
	public void testExpressionPriorityToMultiply() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 * 5 - 1 + 2");
		assertEquals(resultat.calculate(), 18, 0);
	}

	@Test
	public void testExpressionPriorityToSeveralMultiply() throws MathsExceptions {
		resultat = new MathResultat("2 + 3 * 5 * 2 + 7");
		assertEquals(resultat.calculate(), 39, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithBracket() throws MathsExceptions {
		resultat = new MathResultat("(2 + 3) + 11");
		assertEquals(resultat.calculate(), 16, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithTwoBrackets() throws MathsExceptions {
		resultat = new MathResultat("(2 + 5) + (1 * 5)");
		assertEquals(resultat.calculate(), 12, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithSeveralBrackets() throws MathsExceptions {
		resultat = new MathResultat("((((2 + 3)) * ((4 + 5))))");
		assertEquals(resultat.calculate(), 45, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithTwoBracketsAndMultiply() throws MathsExceptions {
		resultat = new MathResultat("(2 + 5) * (1 + 3)");
		assertEquals(resultat.calculate(), 28, 0);
	}

	@Test
	public void testExpressionMultiplicationAndAddition() throws MathsExceptions {
		resultat = new MathResultat("7 + 4 * 3 + 2 + 1");
		assertEquals(resultat.calculate(), 22, 0);
	}

	@Test
	public void testExpressionSimpleAdditionWithSeveralBracketsPlus() throws MathsExceptions {
		resultat = new MathResultat("(((2 + 3)) * (4 + 5) + 2)");
		assertEquals(resultat.calculate(), 47, 0);
	}
}
