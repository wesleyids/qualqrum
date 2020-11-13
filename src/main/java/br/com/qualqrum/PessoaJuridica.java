package br.com.qualqrum;

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
    private String codigoAtividadeEconomica;
    private String codigoAtividadeEconomicaDescricao;
    private String codigoNaturezaJuridica;
    private String codigoNaturezaJuridicaDescricao;
    private String situacaoRFB;
    private String motivoSituacaoRFB;
    private List<String> cnaes = new ArrayList<>();
    private String status;

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

    public String getCodigoAtividadeEconomica() {
        return codigoAtividadeEconomica;
    }

    public void setCodigoAtividadeEconomica(String codigoAtividadeEconomica) {
        this.codigoAtividadeEconomica = codigoAtividadeEconomica;
    }

    public String getCodigoAtividadeEconomicaDescricao() {
        return codigoAtividadeEconomicaDescricao;
    }

    public void setCodigoAtividadeEconomicaDescricao(String codigoAtividadeEconomicaDescricao) {
        codigoAtividadeEconomicaDescricao = codigoAtividadeEconomicaDescricao;
    }

    public String getCodigoNaturezaJuridica() {
        return codigoNaturezaJuridica;
    }

    public void setCodigoNaturezaJuridica(String codigoNaturezaJuridica) {
        codigoNaturezaJuridica = codigoNaturezaJuridica;
    }

    public String getCodigoNaturezaJuridicaDescricao() {
        return codigoNaturezaJuridicaDescricao;
    }

    public void setCodigoNaturezaJuridicaDescricao(String codigoNaturezaJuridicaDescricao) {
        codigoNaturezaJuridicaDescricao = codigoNaturezaJuridicaDescricao;
    }

    public String getSituacaoRFB() {
        return situacaoRFB;
    }

    public void setSituacaoRFB(String situacaoRFB) {
        situacaoRFB = situacaoRFB;
    }

    public String getMotivoSituacaoRFB() {
        return motivoSituacaoRFB;
    }

    public void setMotivoSituacaoRFB(String motivoSituacaoRFB) {
        motivoSituacaoRFB = motivoSituacaoRFB;
    }

    public List<String> getCnaes() {
        return cnaes;
    }

    public void setCnaes(List<String> cnaes) {
        this.cnaes = cnaes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
