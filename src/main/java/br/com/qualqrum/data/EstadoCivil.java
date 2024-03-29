package br.com.qualqrum.data;

/**
 * Enum que representa os tipos de estado civil que podem ser usados.
 *
 * @author Wesley Inacio
 *
 */
public enum EstadoCivil {

    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viúvo");

    private String value;

    EstadoCivil(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
