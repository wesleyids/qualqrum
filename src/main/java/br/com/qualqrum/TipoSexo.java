package br.com.qualqrum;

/**
 * Lista de enum que representa o tipo do sexo que podem ser usados.
 *
 * @author Wesley Inacio
 *
 */
enum TipoSexo {

    FEMININO("Feminino", "F"),
    MASCULINO("Masculino", "M");

    private String texto;
    private String sigla;

    TipoSexo(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return sigla;
    }
}
