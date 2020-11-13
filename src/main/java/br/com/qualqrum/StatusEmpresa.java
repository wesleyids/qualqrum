package br.com.qualqrum;

/**
 * Enum que representa o status de uma empresa que podem ser usados.
 *
 * @author Wesley Inacio
 *
 */
enum StatusEmpresa {

    ATIVA("Ativa"),
    INATIVA("Inativa");

    private String value;

    StatusEmpresa(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
