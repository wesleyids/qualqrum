package br.com.qualqrum;

/**
 * Essa classe representa um Rg.
 *
 * @author Wesley Inacio
 *
 */
class RG {

    private String value;

    public RG() {
        init();
    }

    private void init() {
        int n1 = nextInt();
        int n2 = nextInt();
        int n3 = nextInt();
        int n4 = nextInt();
        int n5 = nextInt();
        int n6 = nextInt();
        int n7 = nextInt();
        int n8 = nextInt();
        int n9 = nextInt();

        value = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;

        value = setMask();
    }

    /**
     * Adiciona mascara padrao de RG
     *
     * @return String 12.345.678-9
     */
    private String setMask() {
        return String.format("%s.%s.%s-%s", value.substring(0, 2), value.substring(2, 5), value.substring(5, 8), value.substring(8, 9));
    }

    private int nextInt() {
        return Utils.random(10);
    }

    public String getValue() {
        return value;
    }
}
