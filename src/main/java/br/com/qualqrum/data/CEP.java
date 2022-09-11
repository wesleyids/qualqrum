package br.com.qualqrum.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa um Cep
 *
 * @author Wesley Inacio
 *
 */
public class CEP {

    private String value;

    private Map<String, List<String>> cepsPorEstado = new HashMap<>();

    public CEP(String uf) {
        init(uf);
    }

    private void init(String uf) {
        cepsPorEstado.put("AC", Constants.AC_CEP);
        cepsPorEstado.put("AL", Constants.AL_CEP);
        cepsPorEstado.put("AM", Constants.AM_CEP);
        cepsPorEstado.put("AP", Constants.AP_CEP);
        cepsPorEstado.put("BA", Constants.BA_CEP);
        cepsPorEstado.put("CE", Constants.CE_CEP);
        cepsPorEstado.put("DF", Constants.DF_CEP);
        cepsPorEstado.put("ES", Constants.ES_CEP);
        cepsPorEstado.put("GO", Constants.GO_CEP);
        cepsPorEstado.put("MA", Constants.MA_CEP);
        cepsPorEstado.put("MG", Constants.MG_CEP);
        cepsPorEstado.put("MS", Constants.MS_CEP);
        cepsPorEstado.put("MT", Constants.MT_CEP);
        cepsPorEstado.put("PA", Constants.PA_CEP);
        cepsPorEstado.put("PB", Constants.PB_CEP);
        cepsPorEstado.put("PE", Constants.PE_CEP);
        cepsPorEstado.put("PI", Constants.PI_CEP);
        cepsPorEstado.put("PR", Constants.PR_CEP);
        cepsPorEstado.put("RJ", Constants.RJ_CEP);
        cepsPorEstado.put("RN", Constants.RN_CEP);
        cepsPorEstado.put("RO", Constants.RO_CEP);
        cepsPorEstado.put("RR", Constants.RR_CEP);
        cepsPorEstado.put("RS", Constants.RS_CEP);
        cepsPorEstado.put("SC", Constants.SC_CEP);
        cepsPorEstado.put("SP", Constants.SP_CEP);
        cepsPorEstado.put("SE", Constants.SE_CEP);
        cepsPorEstado.put("TO", Constants.TO_CEP);

        if (!cepsPorEstado.containsKey(uf)) {
            value = "";
        } else {
            List<String> cidades = cepsPorEstado.get(uf);
            value = cidades.get(Utils.random(cidades.size()));
        }
    }

    public String getValue() {
        return value;
    }
}
