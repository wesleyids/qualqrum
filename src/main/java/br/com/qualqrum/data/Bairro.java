package br.com.qualqrum.data;

import java.util.List;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa um Bairro
 *
 * @author Wesley Inacio
 *
 */
public class Bairro {

    private List<String> bairros = Constants.BAIRROS;

    public String get() {
        return bairros.get(Utils.random(bairros.size()));
    }
}
