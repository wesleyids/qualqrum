package br.com.qualqrum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Essa classe representa uma Cidade
 *
 * @author Wesley Inacio
 *
 */
class Cidade {

    private Map<String, List<String>> cidadesPorEstado = new HashMap<>();

    private String estado;

    public Cidade() {
        init();
    }

    private void init() {
        cidadesPorEstado.put("AC", Constants.AC);
        cidadesPorEstado.put("AL", Constants.AL);
        cidadesPorEstado.put("AM", Constants.AM);
        cidadesPorEstado.put("AP", Constants.AP);
        cidadesPorEstado.put("BA", Constants.BA);
        cidadesPorEstado.put("CE", Constants.CE);
        cidadesPorEstado.put("DF", Constants.DF);
        cidadesPorEstado.put("ES", Constants.ES);
        cidadesPorEstado.put("GO", Constants.GO);
        cidadesPorEstado.put("MA", Constants.MA);
        cidadesPorEstado.put("MG", Constants.MG);
        cidadesPorEstado.put("MS", Constants.MS);
        cidadesPorEstado.put("MT", Constants.MT);
        cidadesPorEstado.put("PA", Constants.PA);
        cidadesPorEstado.put("PB", Constants.PB);
        cidadesPorEstado.put("PE", Constants.PE);
        cidadesPorEstado.put("PI", Constants.PI);
        cidadesPorEstado.put("PR", Constants.PR);
        cidadesPorEstado.put("RJ", Constants.RJ);
        cidadesPorEstado.put("RN", Constants.RN);
        cidadesPorEstado.put("RO", Constants.RO);
        cidadesPorEstado.put("RR", Constants.RR);
        cidadesPorEstado.put("RS", Constants.RS);
        cidadesPorEstado.put("SC", Constants.SC);
        cidadesPorEstado.put("SP", Constants.SP);
        cidadesPorEstado.put("SE", Constants.SE);
        cidadesPorEstado.put("TO", Constants.TO);
    }

    public String get(String uf) {
        if (Utils.isBlank(uf)) {
            return "";
        }

        uf = uf.toUpperCase();

        if (!cidadesPorEstado.containsKey(uf)) {
            return "";
        }

        List<String> cidades = cidadesPorEstado.get(uf);
        return cidades.get(Utils.random(cidades.size()));
    }

    public String get() {
        return get(EstadosBrasil.values()[Utils.random(EstadosBrasil.values().length)].getSigla());
    }
}
