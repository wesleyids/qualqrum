package br.com.qualqrum.data;

import java.util.InputMismatchException;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa um Cpf
 *
 * @author Wesley Inacio
 *
 */
public class CPF {

    private String value;

    public CPF() {
        init();
    }

    public CPF(String cpf) {
        value = cpf;
    }

    private void init() {

        int n = 9;
        int x = 0;
        int n1 = Utils.randomiza(n, x, true);
        int n2 = Utils.randomiza(n, x, true);
        int n3 = Utils.randomiza(n, x, true);
        int n4 = Utils.randomiza(n, x, true);
        int n5 = Utils.randomiza(n, x, true);
        int n6 = Utils.randomiza(n, x, true);
        int n7 = Utils.randomiza(n, x, true);
        int n8 = Utils.randomiza(n, x, true);
        int n9 = Utils.randomiza(n, x, true);
        int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;
        d1 = 11 - (Utils.mod(d1, 11));

        if (d1 >= 10)
            d1 = 0;

        int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;
        d2 = 11 - (Utils.mod(d2, 11));

        if (d2 >= 10)
            d2 = 0;

        value = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

        value = setMask();
    }

    /**
     * Adiciona mascara padrao de CPF
     *
     * @return String 123.456.789-01
     */
    private String setMask() {
        return String.format("%s.%s.%s-%s", value.substring(0, 3), value.substring(3, 6), value.substring(6, 9),
                value.substring(9, 11));
    }

    public String getValue() {
        return value;
    }

    public boolean isValid() {
        if (Utils.isBlank(value)) {
            return false;
        }

        String cpf = value;
        cpf = Utils.removerCaracteresEspeciais(cpf);

        if (Utils.isSequenciaNumerosIguais(cpf) || cpf.length() != 11) {
            return false;
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

        try {
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else
                dig10 = (char) (r + 48);

            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else
                dig11 = (char) (r + 48);

            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                return (true);
            else
                return false;

        } catch (InputMismatchException erro) {
            return false;
        }
    }
}
