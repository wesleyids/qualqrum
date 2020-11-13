package br.com.qualqrum;

import java.util.Arrays;
import java.util.List;

/**
 * Essa classe representa um Nome.
 *
 * @author Wesley Inacio
 *
 */
public class Nome {

    private String value;

    private List<String> nomesFemininos = Constants.NOMES_FEMININOS;

    private List<String> nomesMasculinos = Constants.NOMES_MASCULINOS;

    private List<String> sobrenomes = Constants.SOBRENOMES;

    public Nome(TipoSexo sexoEnum) {
        init(sexoEnum);
    }

    public Nome() {
        List<TipoSexo> sx = Arrays.asList(TipoSexo.FEMININO, TipoSexo.MASCULINO);
        init(sx.get(Utils.random(sx.size())));
    }

    private void init(TipoSexo sexoEnum) {

        String nome = "";

        if (TipoSexo.FEMININO.equals(sexoEnum)) {

            nome = nomesFemininos.get(Utils.random(nomesFemininos.size()));

        } else if (TipoSexo.MASCULINO.equals(sexoEnum)) {

            nome = nomesMasculinos.get(Utils.random(nomesMasculinos.size()));

        }

        String nomeCompleto = nome.concat(" ").concat(sobrenomes.get(Utils.random(sobrenomes.size())));
        this.value = nomeCompleto;
    }

    public String getValue() {
        return value;
    }
}
