package br.com.qualqrum;

/**
 * Essa classe representa uma Validacao.
 *
 * @author Wesley Inacio
 *
 */
public class Validator {

    /**
     * Verifica se o cpf eh valido
     *
     * @param   cpf String
     * @return  boolean
     */
    public static boolean cpfValid(String cpf) {
        return new CPF(cpf).isValid();
    }

    /**
     * Verifica se o cnpj eh valido
     *
     * @param   cnpj String
     * @return  boolean
     */
    public static boolean cnpjValid(String cnpj) {
        return new CNPJ(cnpj).isValid();
    }

    /**
     * Verifica se o email eh valido
     *
     * @param   email String
     * @return  boolean
     */
    public static boolean emailValid(String email) {
        return Email.isValid(email);
    }
}
