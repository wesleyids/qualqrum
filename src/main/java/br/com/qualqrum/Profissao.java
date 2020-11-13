package br.com.qualqrum;

import java.util.List;

/**
 * Essa classe representa uma Profissao.
 *
 * @author Wesley Inacio
 *
 */
class Profissao {

    private String value;

    private List<String> profissoes = Constants.PROFISSOES;

    Profissao() {
        init();
    }

    private void init() {
        value = profissoes.get(Utils.random(profissoes.size()));
    }

    public String getValue() {
        return value;
    }
}
