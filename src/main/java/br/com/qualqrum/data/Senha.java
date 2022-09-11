package br.com.qualqrum.data;

import br.com.qualqrum.Utils;

/**
 * Essa classe representa uma Senha.
 *
 * @author Wesley Inacio
 *
 */
public class Senha {

    private String value;

    private int tamanhoSenha;

    private char[] options = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z'
    };

    private char[] moreOptions = { '!', '@', '#', '$', '&', '*', '.', '?' };

    public Senha() {
        init();
    }

    public Senha(int tamanhoSenha) {
        this.tamanhoSenha = tamanhoSenha;
        init();
    }

    private void init() {

        if (tamanhoSenha == 0) {
            tamanhoSenha = 8;
        }

        if (tamanhoSenha > 70) {
            tamanhoSenha = 70;
        }

        char[] senha = new char[tamanhoSenha];

        for (int i = 0; i < tamanhoSenha; i++) {
            senha[i] = options[Utils.random(options.length)];
        }

        value = String.valueOf(senha);
    }

    public String getValue() {
        return value;
    }
}
