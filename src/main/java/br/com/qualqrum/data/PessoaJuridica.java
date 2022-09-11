package br.com.qualqrum.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe representa uma Pessoa Juridica.
 *
 * @author Wesley Inacio
 *
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String inscricaoEstadual;
    private String dataAbertura;
    private String status;
    private String site;

    public PessoaJuridica(Pessoa pessoa) {
        super(pessoa);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
