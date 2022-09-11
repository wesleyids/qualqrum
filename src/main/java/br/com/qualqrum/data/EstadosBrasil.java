package br.com.qualqrum.data;

import java.util.Arrays;
import java.util.List;

/**
 * Enum que representa os estados do Brasil que podem ser usados.
 *
 * @author Wesley Inacio
 *
 */
public enum EstadosBrasil {

    AC("AC", "Acre", Arrays.asList(68)),
    AL("AL", "Alagoas", Arrays.asList(82)),
    AM("AM", "Amazonas", Arrays.asList(92, 97)),
    AP("AP", "Amapá", Arrays.asList(96)),
    BA("BA", "Bahia", Arrays.asList(71, 73, 74, 75, 77)),
    CE("CE", "Ceará", Arrays.asList(85, 88)),
    DF("DF", "Distrito Federal", Arrays.asList(61)),
    ES("ES", "Espírito Santo", Arrays.asList(27, 28)),
    GO("GO", "Goiás", Arrays.asList(61, 62, 64)),
    MA("MA", "Maranhão", Arrays.asList(98, 99)),
    MG("MG", "Minas Gerais", Arrays.asList(32, 33, 34, 35, 37, 38)),
    MS("MS", "Mato Grosso do Sul", Arrays.asList(67)),
    MT("MT", "Mato Grosso", Arrays.asList(65, 66)),
    PA("PA", "Pará", Arrays.asList(91, 93, 94)),
    PB("PB", "Paraíba", Arrays.asList(83)),
    PE("PE", "Pernambuco", Arrays.asList(81, 82)),
    PI("PI", "Piauí", Arrays.asList(86, 89)),
    PR("PR", "Paraná", Arrays.asList(41, 42, 43, 44, 45, 46)),
    RJ("RJ", "Rio de Janeiro", Arrays.asList(21, 22, 24)),
    RN("RN", "Rio Grande do Norte", Arrays.asList(84)),
    RO("RO", "Rondônia", Arrays.asList(69)),
    RR("RR", "Roraima", Arrays.asList(95)),
    RS("RS", "Rio Grande do Sul", Arrays.asList(51, 53, 54, 55)),
    SC("SC", "Santa Catarina", Arrays.asList(47, 48, 49)),
    SP("SP", "São Paulo", Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19)),
    SE("SE", "Sergipe", Arrays.asList(79)),
    TO("TO", "Tocantins", Arrays.asList(63));

    private String sigla;

    private String estado;

    private List<Integer> ddds;

    EstadosBrasil(String sigla, String estado, List<Integer> ddds) {
        this.sigla = sigla;
        this.estado = estado;
        this.ddds = ddds;
    }

    public static EstadosBrasil get(String sigla) {

        if (sigla != null) {
            sigla = sigla.toUpperCase();
        }

        for (EstadosBrasil estado : EstadosBrasil.values()) {
            if (estado.getSigla().equals(sigla)) {
                return estado;
            }
        }

        throw new IllegalStateException(String.format("%s not found", sigla));
    }

    public String getSigla() {
        return sigla;
    }

    public String getEstado() {
        return estado;
    }

    public List<Integer> getDdds() {
        return ddds;
    }
}
