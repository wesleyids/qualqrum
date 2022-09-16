package br.com.qualqrum.math;

import java.math.BigDecimal;

public class Divide {

    // public MathResponse calculate(double number, double divider) {

    // if (divider <= 0) {
    // return new MathResponse("Não é possível dividir por zero", 0);
    // }

    // return new MathResponse(number / divider);
    // }

    public Object calculate(double number, double divider) {

        if (divider <= 0) {
            return "Não é possível dividir por zero";
        }

        return number / divider;
    }

    // public Object calculate(double number, double divider) {

    // if (divider <= 0) {
    // return "Não é possível dividir por zero";
    // }

    // return new BigDecimal(number).divide(new BigDecimal(number), 2,
    // BigDecimal.ROUND_FLOOR);
    // }
}
