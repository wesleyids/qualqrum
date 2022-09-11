package br.com.qualqrum.data;

import java.util.List;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa um Nome de Empresa.
 *
 * @author Wesley Inacio
 *
 */
public class NomeEmpresa {

    private String value;

    private List<String> nomesEmpresa = Constants.NOMES_EMPRESA;

    public NomeEmpresa() {
        init();
    }

    private void init() {
        value = nomesEmpresa.get(Utils.random(nomesEmpresa.size()));
    }

    public String getValue() {
        return value;
    }
}
