package br.com.qualqrum;

import java.util.List;

/**
 * Essa classe representa um Logradouro.
 *
 * @author Wesley Inacio
 *
 */
class Logradouro {

    private List<String> logradouros = Constants.LOGRADOUROS;

    public String get() {
        return logradouros.get(Utils.random(logradouros.size()));
    }
}
