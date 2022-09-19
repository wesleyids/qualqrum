package br.com.qualqrum.sql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.qualqrum.Utils;
import br.com.qualqrum.data.CNPJ;
import br.com.qualqrum.data.CPF;
import br.com.qualqrum.data.ContatoTelefonico;
import br.com.qualqrum.data.Data;
import br.com.qualqrum.data.Email;
import br.com.qualqrum.data.EstadoCivil;
import br.com.qualqrum.data.EstadosBrasil;
import br.com.qualqrum.data.Nome;
import br.com.qualqrum.data.PIS;
import br.com.qualqrum.data.Profissao;
import br.com.qualqrum.data.RG;
import br.com.qualqrum.data.Senha;
import br.com.qualqrum.data.Signo;
import br.com.qualqrum.data.Site;
import br.com.qualqrum.data.TipoSexo;

import static java.util.stream.Collectors.joining;

public class DatabaseGenerator {

    private List<String> fieldsDefault = Arrays.asList(
            "nome", "email", "idade", "cpf", "rg", "profissao",
            "pis", "signo", "cns", "cne", "dataNascimento", "inscricaoEstadual",
            "dataAbertura", "site", "statusEmpresa", "estadoCivil", "filiacao",
            "cnpj", "senha", "estado", "endereco", "telefone", "celular");

    private String tableNameDefault = "Table";

    private String documentNameDefault = "document";

    private boolean removeMask = false;

    public List<String> init(List<String> fields, String tableName, int limit) {
        List<String> scripts = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            scripts.add(generator(fields, tableName));
        }
        return scripts;
    }

    private String generator(List<String> webFields, String tableName) {

        if (webFields == null || webFields.isEmpty()) {
            webFields = fieldsDefault;
        }

        if (tableName == "" || tableName == null) {
            tableName = tableNameDefault;
        }

        String nome = "";
        TipoSexo tipoSexo = TipoSexo.FEMININO;
        EstadosBrasil estado = EstadosBrasil.DF;

        List<String> fields = new ArrayList<>();
        List<String> values = new ArrayList<>();

        if (webFields.contains("sexo")) {
            fields.add("sexo");
            List<TipoSexo> sx = Arrays.asList(TipoSexo.FEMININO, TipoSexo.MASCULINO);
            tipoSexo = sx.get(Utils.random(sx.size()));
            values.add(tipoSexo.getTexto());
        }

        if (webFields.contains("nome")) {
            fields.add("nome");
            nome = new Nome(tipoSexo).getValue();
            values.add(nome);
        }

        if (webFields.contains("email")) {
            fields.add("email");
            values.add(new Email(nome == "" ? new Nome().getValue() : nome).getValue());
        }

        if (webFields.contains("idade")) {
            fields.add("idade");
            Data data = new Data(true);
            values.add(String.valueOf(data.getCurrentYear() - data.getYear()));
        }

        if (webFields.contains("cpf")) {
            fields.add("cpf");
            values.add(new CPF().getValue());
        }

        if (webFields.contains("rg")) {
            fields.add("rg");
            values.add(new RG().getValue());
        }

        if (webFields.contains("profissao")) {
            fields.add("profissao");
            values.add(new Profissao().getValue());
        }

        if (webFields.contains("pis")) {
            fields.add("pis");
            values.add(new PIS().getValue());
        }

        if (webFields.contains("signo")) {
            fields.add("signo");
            values.add(new Signo().getValue());
        }

        if (webFields.contains("cns")) {
            fields.add("cns");
            values.add("");
        }

        if (webFields.contains("cne")) {
            fields.add("cne");
            values.add("");
        }

        if (webFields.contains("dataNascimento")) {
            fields.add("dataNascimento");
            values.add(new Data().getValue());
        }

        if (webFields.contains("inscricaoEstadual")) {
            fields.add("inscricaoEstadual");
            values.add("");
        }

        if (webFields.contains("dataAbertura")) {
            fields.add("dataAbertura");
            values.add(new Data().getValue());
        }

        if (webFields.contains("site")) {
            fields.add("site");
            values.add(new Site(nome == "" ? new Nome().getValue() : nome).getValue());
        }

        if (webFields.contains("statusEmpresa")) {
            fields.add("statusEmpresa");
            values.add("");
        }

        if (webFields.contains("estadoCivil")) {
            fields.add("estadoCivil");
            EstadoCivil[] ec = EstadoCivil.values();
            values.add(ec[Utils.random(ec.length)].getValue());
        }

        if (webFields.contains("filiacao")) {
            fields.add("filiacao");
            values.add("");
        }

        if (webFields.contains("cnpj")) {
            fields.add("cnpj");
            values.add(new CNPJ().getValue());
        }

        if (webFields.contains("senha")) {
            fields.add("senha");
            values.add(new Senha().getValue());
        }

        if (webFields.contains("endereco")) {
            fields.add("endereco");
            values.add("");
        }

        if (webFields.contains("telefone")) {
            fields.add("telefone");
            values.add(new ContatoTelefonico(estado).getTelefone());
        }

        if (webFields.contains("celular")) {
            fields.add("celular");
            values.add(new ContatoTelefonico(estado).getCelular());
        }

        String dml = "INSERT INTO " + tableName + " (" + fields.stream().collect(joining(", ")) + ")";
        dml += " VALUES ('" + values.stream().collect(joining("', '")) + "');";

        return dml;
    }
}
