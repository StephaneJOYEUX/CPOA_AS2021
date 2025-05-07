package com.iut.as2021.mathematics;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathsTests2 {

    private IMaths maths;

    @Before
    public void setUp() {
        // Init contexte :
        maths = new Maths();
    }

    @Test
    public void testDivisionCasNominal() throws MathsExceptions {
        Assert.assertEquals(2d, this.maths.division(4,2),0);
    }

    @Test
    public void testDivisionParZeroInterdit() throws MathsExceptions {
        try {
            this.maths.division(4, 0);
        }
        catch (MathsExceptions e) {
            Assert.assertEquals("Division par zero impossible", e.getMessage());
        }
    }

    @Test
    public void testMultiplicationToutPositif() {
        Assert.assertEquals(8, this.maths.multiplication(4, 2));
    }

    @Test
    public void testMultiplicationToutNegatif() {
        Assert.assertEquals(8, this.maths.multiplication(-4, -2));
    }

    @Test
    public void testMultiplicationAvecZero() {
        Assert.assertEquals(0, this.maths.multiplication(4, 0));
    }
}
