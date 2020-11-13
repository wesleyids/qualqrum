package br.com.qualqrum;

import java.util.List;

/**
 * Essa classe representa um Nome de Empresa.
 *
 * @author Wesley Inacio
 *
 */
class NomeEmpresa {

    private String value;

    private List<String> nomesEmpresa = Constants.NOMES_EMPRESA;

    NomeEmpresa() {
        init();
    }

    private void init() {
        value = nomesEmpresa.get(Utils.random(nomesEmpresa.size()));
    }

    public String getValue() {
        return value;
    }
}
