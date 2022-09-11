package br.com.qualqrum.data;

import java.util.List;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa um Contato Telefonico
 *
 * @author Wesley Inacio
 *
 */
public class ContatoTelefonico {

    private String telefone;
    private String celular;

    public ContatoTelefonico(EstadosBrasil estadosBrasilEnum) {
        init(estadosBrasilEnum);
    }

    public ContatoTelefonico() {
        init(null);
    }

    private void init(EstadosBrasil estadosBrasilEnum) {

        if (estadosBrasilEnum == null) {
            EstadosBrasil[] eb = EstadosBrasil.values();
            estadosBrasilEnum = eb[Utils.random(eb.length)];
        }

        List<Integer> ddds = estadosBrasilEnum.getDdds();

        String ddd = String.format("(%s) ", ddds.get(Utils.random(ddds.size())).toString());

        telefone = ddd.concat(createNumber());
        celular = ddd.concat("9").concat(createNumber());
    }

    private String createNumber() {
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.random(9));
        sb.append(Utils.random(9));
        sb.append(Utils.random(9));
        sb.append(Utils.random(9));
        sb.append("-");
        sb.append(Utils.random(9));
        sb.append(Utils.random(9));
        sb.append(Utils.random(9));
        sb.append(Utils.random(9));

        return sb.toString();
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }
}
