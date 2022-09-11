package br.com.qualqrum.data;

import java.util.List;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa uma Profissao.
 *
 * @author Wesley Inacio
 *
 */
public class Profissao {

    private String value;

    private List<String> profissoes = Constants.PROFISSOES;

    public Profissao() {
        init();
    }

    private void init() {
        value = profissoes.get(Utils.random(profissoes.size()));
    }

    public String getValue() {
        return value;
    }
}
