package br.com.qualqrum.data;

/**
 * Essa classe representa uma Filiacao.
 *
 * @author Wesley Inacio
 *
 */
public class Filiacao {

    private String nomeMae;
    private String nomePai;

    public Filiacao() {
        init();
    }

    private void init() {
        this.nomeMae = new Nome(TipoSexo.FEMININO).getValue();
        this.nomePai = new Nome(TipoSexo.MASCULINO).getValue();
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }
}
