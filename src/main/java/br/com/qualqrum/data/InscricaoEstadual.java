package br.com.qualqrum.data;

/**
 * Essa classe representa uma Inscricao Estadual.
 *
 * @author Wesley Inacio
 *
 */
public class InscricaoEstadual {

    private String value;

    public InscricaoEstadual(EstadosBrasil estadosBrasil) {
        value = "123.456.789";
    }

    public String getValue() {
        return value;
    }
}
