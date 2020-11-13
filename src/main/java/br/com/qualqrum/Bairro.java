package br.com.qualqrum;

import java.util.List;

/**
 * Essa classe representa um Bairro
 *
 * @author Wesley Inacio
 *
 */
class Bairro {

    private List<String> bairros = Constants.BAIRROS;

    public String get() {
        return bairros.get(Utils.random(bairros.size()));
    }
}
