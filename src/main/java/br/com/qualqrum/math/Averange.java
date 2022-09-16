package br.com.qualqrum.math;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Averange {
    public double calculate(double[] numbers) {
        OptionalDouble d = DoubleStream.of(numbers).average();
        if (d.isPresent()) {
            return d.getAsDouble();
        }
        return 0;
    }
}
