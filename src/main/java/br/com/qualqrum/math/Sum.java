package br.com.qualqrum.math;

import java.util.stream.DoubleStream;

public class Sum {

    public double calculate(double[] numbers) {
        return DoubleStream.of(numbers).sum();
    }

    public double calculate(String[] numbers) {

        if (numbers.length <= 0) {
            return 0;
        }

        double result = 0.0;

        for (String number : numbers) {
            result += Double.parseDouble(number);
        }

        return result;
    }
}
