package br.com.qualqrum;

/**
 * Essa classe representa uma Pessoa Fisica.
 *
 * @author Wesley Inacio
 *
 */
public class PessoaFisica extends Pessoa {

    private String tipoPessoa = TipoPessoa.FISICA.name();
    private String rg;
    private String cpf;
    private String pis;
    private String estadoCivil;
    private String cns;
    private String cnae;
    private String sexo;
    private String dataNascimento;
    private String profissao;
    private String senha;
    private String signo;
    private int idade;
    private Filiacao filiacao;

    PessoaFisica(Pessoa pessoa) {
        super(pessoa);
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSexoAbreviado() {
        if (TipoSexo.FEMININO.getTexto().equals(sexo)) {
            return TipoSexo.FEMININO.getSigla();
        }
        return TipoSexo.MASCULINO.getSigla();
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }
}
