package br.com.qualqrum.data;

import static br.com.qualqrum.data.Constants.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa um Email.
 *
 * @author Wesley Inacio
 *
 */
public class Email {

    private String value;

    private List<String> provedores = PROVEDORES_EMAIL;

    private List<String> separadores = Arrays.asList(
            "_", ".");

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    public Email(String nome) {
        init(nome);
    }

    /**
     * Cria um email baseado no {nome}
     *
     * @param nome String
     */
    private void init(String nome) {

        String email = nome.replaceAll(" ", separadores.get(Utils.random(separadores.size())));
        email = email.concat("@").concat(provedores.get(Utils.random(provedores.size())));

        value = email.toLowerCase();
    }

    public String getValue() {
        return value;
    }

    /**
     * Verifica se o email eh valido
     *
     * @param email String
     * @return boolean se email for valdio
     * @throws IllegalArgumentException
     */
    public static boolean isValid(String email) {

        if (Utils.isBlank(email)) {
            return false;
        }

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
