package br.com.qualqrum.math;

public class Multiply {

    public double calculate(double[] numbers) {

        double result = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            double number = numbers[i];
            if (i == 0) {
                result = number;
            } else {
                result *= number;
            }
        }

        return result;
    }
}
