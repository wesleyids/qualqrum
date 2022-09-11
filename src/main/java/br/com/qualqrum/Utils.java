package br.com.qualqrum;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe utilitária
 *
 * @author Wesley Inacio
 *
 */
public class Utils {

    public static int randomiza(int n, int x, boolean isDocumento) {

        if (isDocumento) {

            int ranNum = (int) (Math.random() * n);
            return ranNum;
        }

        double a = Math.random();
        int b = (int) (Math.floor(a * (x - n)) + n);
        return b;
    }

    public static int mod(int dividendo, int divisor) {
        return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
    }

    /**
     * Retorna um numero aleatorio dentro do range de valores.
     *
     * @param max Representa o numero maximo do range.
     * @return int
     */
    public static int random(int max) {
        return random(0, max);
    }

    /**
     * Retorna um numero aleatorio dentro do range de valores.
     *
     * @param min Representa o numero minimo do range.
     * @param max Representa o numero maximo do range.
     * @return int
     */
    public static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    /**
     * Verifica se o valor tem alguma sequencia de numeros iguais.
     *
     * @param value String
     * @return boolean
     */
    public static boolean isSequenciaNumerosIguais(String value) {
        if (value.equals("00000000000") ||
                value.equals("11111111111") ||
                value.equals("22222222222") || value.equals("33333333333") ||
                value.equals("44444444444") || value.equals("55555555555") ||
                value.equals("66666666666") || value.equals("77777777777") ||
                value.equals("88888888888") || value.equals("99999999999")) {
            return true;
        }
        return false;
    }

    /**
     * Retorna a String sem caracteres especiais e apenas numeros.
     *
     * @param value Representa o numero minimo do range.
     * @return string
     */
    public static String removerCaracteresEspeciais(String value) {
        if (value == null) {
            return "";
        }
        return value.replaceAll("[^0-9]", "");
    }

    /**
     * Verifica se o object tem valor preenchido
     *
     * @param object
     * @return
     */
    public static boolean isBlank(Object object) {
        if (object == null) {
            return true;
        }

        if (object instanceof CharSequence) {
            return (((CharSequence) object).length() == 0);
        }

        if (object instanceof Number) {
            return (((Number) object).longValue() == 0);
        }

        return false;
    }

    /**
     * Remover espacos em branco
     *
     * @param value
     * @return String sem espacos em branco
     */
    public static String removerEspacos(String value) {
        return value.replaceAll(" ", "");
    }
}
