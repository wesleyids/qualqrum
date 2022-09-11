package br.com.qualqrum.data;

import java.util.Arrays;
import java.util.List;

import br.com.qualqrum.Utils;

public class Signo {

    private String value;

    private List<String> signos = Arrays.asList(
            "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem",
            "Libra", "Escorpião", "Sargitário", "Capricórnio", "Aquário", "Peixes");

    public Signo() {
        init();
    }

    private void init() {
        this.value = signos.get(Utils.random(signos.size()));
    }

    public String getValue() {
        return value;
    }
}
