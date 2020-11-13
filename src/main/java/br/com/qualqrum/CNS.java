package br.com.qualqrum;

/**
 * Essa classe representa um Cns
 *
 * @author Wesley Inacio
 *
 */
class CNS {

    private String value;
    
    public CNS() {
        init();
    }
    
    private void init() {
        String resultado;
        int resto;
        int dv;
        String pis = geradorNumero();

        int soma = Integer.parseInt(pis.substring(0, 1)) * 15
                + Integer.parseInt(pis.substring(1, 2)) * 14
                + Integer.parseInt(pis.substring(2, 3)) * 13
                + Integer.parseInt(pis.substring(3, 4)) * 12
                + Integer.parseInt(pis.substring(4, 5)) * 11
                + Integer.parseInt(pis.substring(5, 6)) * 10
                + Integer.parseInt(pis.substring(6, 7)) * 9
                + Integer.parseInt(pis.substring(7, 8)) * 8
                + Integer.parseInt(pis.substring(8, 9)) * 7
                + Integer.parseInt(pis.substring(9, 10)) * 6
                + Integer.parseInt(pis.substring(10, 11)) * 5;

        resto = soma % 11;
        dv = 11 - resto;
        if (dv == 11) {
            dv = 0;
        }
        if (dv == 10) {
            soma = Integer.parseInt(pis.substring(0, 1)) * 15
                    + Integer.parseInt(pis.substring(1, 2)) * 14
                    + Integer.parseInt(pis.substring(2, 3)) * 13
                    + Integer.parseInt(pis.substring(3, 4)) * 12
                    + Integer.parseInt(pis.substring(4, 5)) * 11
                    + Integer.parseInt(pis.substring(5, 6)) * 10
                    + Integer.parseInt(pis.substring(6, 7)) * 9
                    + Integer.parseInt(pis.substring(7, 8)) * 8
                    + Integer.parseInt(pis.substring(8, 9)) * 7
                    + Integer.parseInt(pis.substring(9, 10)) * 6
                    + (Integer.parseInt(pis.substring(10, 11)) * 5) + 2;
            resto = soma % 11;
            dv = 11 - resto;
            resultado = pis + "001" + dv;
        } else {
            resultado = pis + "000" + dv;
        }
        
        value = resultado;
    }

    public String geradorNumero() {
        Integer[] a = {
                Utils.randomiza(1,3,false),
                Utils.randomiza(0, 10,false),
                Utils.randomiza(0, 10,false),
                Utils.randomiza(0, 10,false),
                Utils.randomiza(0, 10,false),
                Utils.randomiza(0, 10,false),
                Utils.randomiza(0, 10,false),
                Utils.randomiza(0, 10,false),
                Utils.randomiza(0, 10,false),
                Utils.randomiza(0, 10,false)
        };
        
        double soma = (a[0] * 3) + (a[1] * 2) + (a[2] * 9) + (a[3] * 8) + (a[4] * 7) + (a[5] * 6) + (a[6] * 5) + (a[7] * 4) + (a[8] * 3) + (a[9] * 2);
        double resto = soma % 11;
        Double dv = 11 - resto;
        if (dv == 10 || dv == 11) {
            dv = (double) 0;
        }
        String aa = String.format("%d%d%d%d%d%d%d%d%d%d", a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9]);
        return String.format("%s%d", aa, dv.intValue());
    }

    public String getValue() {
        return value;
    }

}
