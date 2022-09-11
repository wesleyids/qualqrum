package br.com.qualqrum;

import br.com.qualqrum.data.CNH;
import br.com.qualqrum.data.CNPJ;
import br.com.qualqrum.data.CPF;
import br.com.qualqrum.data.Email;

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
     * @param cpf String
     * @return boolean
     */
    public static boolean cpfValid(String cpf) {
        return new CPF(cpf).isValid();
    }

    /**
     * Verifica se o cnpj eh valido
     *
     * @param cnpj String
     * @return boolean
     */
    public static boolean cnpjValid(String cnpj) {
        return new CNPJ(cnpj).isValid();
    }

    /**
     * Verifica se o email eh valido
     *
     * @param email String
     * @return boolean
     */
    public static boolean emailValid(String email) {
        return Email.isValid(email);
    }

    /**
     * Verifica se o cnh eh valido
     *
     * @param cnh String
     * @return boolean
     */
    public static boolean cnhValid(String cnh) {
        return CNH.isValid(cnh);
    }
}
