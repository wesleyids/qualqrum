package br.com.qualqrum.math;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SubtractTest {

    @Test
    public void subtract_test() {
        // double[] numbers = { 1.0, 1.01, 2.0003 };
        double result = new Subtract().calculate(1, 1.01);
        assertTrue("", result == -0.010000);
    }

}
