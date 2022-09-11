package br.com.qualqrum.data;

import br.com.qualqrum.Utils;

public class Site {

    private String value;

    public Site(String nome) {
        init(nome);
    }

    private void init(String nome) {
        nome = Utils.removerEspacos(nome);
        nome = nome.toLowerCase();

        value = "www.".concat(nome).concat(".com.br");
    }

    public String getValue() {
        return value;
    }
}
