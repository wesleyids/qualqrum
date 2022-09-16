package br.com.qualqrum.math;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultiplyTest {

    @Test
    public void sum_test() {
        double[] numbers = { 1.0, 1.01, 2.0003 };
        double result = new Multiply().calculate(numbers);
        assertTrue("", result == 2.020303);
    }
}
