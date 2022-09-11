package br.com.qualqrum.data;

import java.util.List;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa um Logradouro.
 *
 * @author Wesley Inacio
 *
 */
public class Logradouro {

    private List<String> logradouros = Constants.LOGRADOUROS;

    public String get() {
        return logradouros.get(Utils.random(logradouros.size()));
    }
}
