package br.com.qualqrum.math;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SumTest {

    @Test
    public void sum_test() {
        double[] numbers = { 1.0, -1.01, 2.0003 };
        double result = new Sum().calculate(numbers);
        assertTrue("", result == 1.9903000000000002);
    }

    @Test
    public void sum_string_test() {
        String[] numbers = { "1.0", "-1.01", "2.0003" };
        double result = new Sum().calculate(numbers);
        assertTrue("", result == 1.9903000000000002);
    }
}
