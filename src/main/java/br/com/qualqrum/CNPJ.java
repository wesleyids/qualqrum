package br.com.qualqrum;

import java.util.InputMismatchException;

/**
 * Essa classe representa um Cnpj
 *
 * @author Wesley Inacio
 *
 */
class CNPJ {

    private String value;

    public CNPJ() {
        init();
    }

    public CNPJ(String cnpj) {
        value = cnpj;
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
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 1;

        int d1 = n12 * 2 + n11 * 3 + n10 * 4 + n9 * 5 + n8 * 6 + n7 * 7 + n6 * 8 + n5 * 9 + n4 * 2 + n3 * 3 + n2 * 4 + n1 * 5;
        d1 = 11 - (Utils.mod(d1, 11));
        if (d1 >= 10)
            d1 = 0;

        int d2 = d1 * 2 + n12 * 3 + n11 * 4 + n10 * 5 + n9 * 6 + n8 * 7 + n7 * 8 + n6 * 9 + n5 * 2 + n4 * 3 + n3 * 4 + n2 * 5 + n1 * 6;
        d2 = 11 - (Utils.mod(d2, 11));
        if (d2 >= 10)
            d2 = 0;

        value = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + d1 + d2;

        value = setMask();
    }

    /**
     * Adiciona mascara padrao de Cnpj
     *
     * @return String 00.000.000/0001-01
     */
    private String setMask() {
        return String.format("%s.%s.%s/%s-%s", value.substring(0, 2), value.substring(2, 5), value.substring(5, 8), value.substring(8, 12), value.substring(12, 14));
    }

    public String getValue() {
        return value;
    }

    public boolean isValid() {
        if (Utils.isBlank(value)) {
            return false;
        }

        String cnpj = value;
        cnpj = Utils.removerCaracteresEspeciais(cnpj);

        try{
            Long.parseLong(cnpj);
        } catch(NumberFormatException e){
            return false;
        }

        if (Utils.isSequenciaNumerosIguais(cnpj) || cnpj.length() != 14) {
            return false;
        }

        char dig13, dig14;
        int sm, i, r, num, peso;


        try {
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
                num = (int) (cnpj.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (cnpj.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;

            if ((r == 0) || (r == 1))
                dig14 = '0';
            else
                dig14 = (char) ((11 - r) + 48);

            if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13)))
                return true;
            else
                return false;
        } catch (InputMismatchException erro) {
            return false;
        }
    }


}
