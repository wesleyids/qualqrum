package br.com.qualqrum;

import org.modelmapper.ModelMapper;

import br.com.qualqrum.data.Bairro;
import br.com.qualqrum.data.CEP;
import br.com.qualqrum.data.CNAE;
import br.com.qualqrum.data.CNPJ;
import br.com.qualqrum.data.CNS;
import br.com.qualqrum.data.CPF;
import br.com.qualqrum.data.Cidade;
import br.com.qualqrum.data.ContatoTelefonico;
import br.com.qualqrum.data.Data;
import br.com.qualqrum.data.Email;
import br.com.qualqrum.data.Endereco;
import br.com.qualqrum.data.EstadoCivil;
import br.com.qualqrum.data.EstadosBrasil;
import br.com.qualqrum.data.Filiacao;
import br.com.qualqrum.data.InscricaoEstadual;
import br.com.qualqrum.data.Logradouro;
import br.com.qualqrum.data.Nome;
import br.com.qualqrum.data.NomeEmpresa;
import br.com.qualqrum.data.PIS;
import br.com.qualqrum.data.Pessoa;
import br.com.qualqrum.data.PessoaFisica;
import br.com.qualqrum.data.PessoaJuridica;
import br.com.qualqrum.data.Profissao;
import br.com.qualqrum.data.RG;
import br.com.qualqrum.data.Senha;
import br.com.qualqrum.data.Signo;
import br.com.qualqrum.data.Site;
import br.com.qualqrum.data.StatusEmpresa;
import br.com.qualqrum.data.TipoPessoa;
import br.com.qualqrum.data.TipoSexo;

import java.util.Arrays;
import java.util.List;

/**
 * Essa classe representa um Gerador de Dados.
 *
 * @author Wesley Inacio
 *
 */
public class Generator {

    private TipoSexo tipoSexo = null;

    private EstadosBrasil estadosBrasil;

    private Pessoa pessoa;

    private boolean isMaiorIdade;

    private int tamanhoSenha;

    Generator(TipoSexo tipoSexo, EstadosBrasil estadosBrasil, boolean isMaiorIdade, int tamanhoSenha) {
        this.tipoSexo = tipoSexo;
        this.estadosBrasil = estadosBrasil;
        this.isMaiorIdade = isMaiorIdade;
        this.tamanhoSenha = tamanhoSenha;
        init();
    }

    private void init() {
        if (tipoSexo == null) {
            List<TipoSexo> sx = Arrays.asList(TipoSexo.FEMININO, TipoSexo.MASCULINO);
            tipoSexo = sx.get(Utils.random(sx.size()));
        }

        if (estadosBrasil == null) {
            EstadosBrasil[] eb = EstadosBrasil.values();
            estadosBrasil = eb[Utils.random(eb.length)];
        }

        Endereco endereco = createEndereco(estadosBrasil);
        Nome nome = new Nome(tipoSexo);
        Email email = new Email(nome.getValue());
        ContatoTelefonico contatoTelefonico = new ContatoTelefonico(estadosBrasil);

        pessoa = new Pessoa(nome.getValue(), email.getValue(), contatoTelefonico.getTelefone(),
                contatoTelefonico.getCelular(), endereco);
    }

    /**
     * Retorna um cpf valido
     *
     * @return String
     */
    public static String cpf() {
        return new CPF().getValue();
    }

    /**
     * Retorna um cnpj valido
     *
     * @return String
     */
    public static String cnpj() {
        return new CNPJ().getValue();
    }

    /**
     * Retorna um email valido
     *
     * @param String nome
     * @return String
     */
    public static String email(String nome) {
        return new Email(nome).getValue();
    }

    /**
     * Retorna um email valido
     *
     * @return @{link Endereco}
     */
    public static String email() {
        return new Email(new Nome().getValue()).getValue();
    }

    /**
     * Retorna um nome valido
     *
     * @return String
     */
    public static String nome() {
        return new Nome().getValue();
    }

    /**
     * Retorna uma senha
     *
     * @return String
     */
    public static String senha() {
        return new Senha().getValue();
    }

    /**
     * Retorna uma senha
     *
     * @param int tamanhoSenha
     * @return String
     */
    public static String senha(int tamanhoSenha) {
        return new Senha(tamanhoSenha).getValue();
    }

    /**
     * Retorna um estado do territorio brasileiro
     *
     * @return String
     */
    public static String estado() {
        return EstadosBrasil.values()[Utils.random(EstadosBrasil.values().length)].getEstado();
    }

    /**
     * Retorna uma uf do territorio brasileiro
     *
     * @return String
     */
    public static String uf() {
        return EstadosBrasil.values()[Utils.random(EstadosBrasil.values().length)].getSigla();
    }

    /**
     * Retorna uma cidade do territorio brasileiro
     *
     * @param String ufEstado
     * @return String
     */
    public static String cidade(String ufEstado) {
        return new Cidade().get(ufEstado);
    }

    /**
     * Retorna uma cidade do territorio brasileiro
     *
     * @return String
     */
    public static String cidade() {
        return new Cidade().get();
    }

    /**
     * Retorna um endereco aleatorio
     *
     * @return @{link Endereco}
     */
    public static Endereco endereco() {
        Endereco endereco = new Endereco();

        EstadosBrasil estadosBrasil = EstadosBrasil.values()[Utils.random(EstadosBrasil.values().length)];

        endereco.setEstado(estadosBrasil.getEstado());
        endereco.setUf(estadosBrasil.getSigla());

        String uf = estadosBrasil.getSigla();
        endereco.setCidade(new Cidade().get(uf));

        endereco.setBairro(new Bairro().get());
        endereco.setLogradouro(new Logradouro().get());
        endereco.setNumero(Utils.random(999));
        endereco.setCep(new CEP(uf).getValue());

        return endereco;
    }

    /**
     * Retorna um contato telefonico aleatorio
     *
     * @return @{link Contato}
     */
    public static ContatoTelefonico contatoTelefonico() {
        return new ContatoTelefonico();
    }

    /**
     * Metodo responsavel por fazer um parse de um objeto para outro
     *
     * @param clazz
     * @param Enum  TipoPessoa
     * @return Class<T>
     *
     * @throws IllegalArgumentException
     */
    public <T> T toResult(Class<T> clazz, TipoPessoa tipoPessoa) {

        if (clazz == null) {
            throw new IllegalArgumentException("Class is null");
        }

        if (tipoPessoa == null) {
            throw new IllegalArgumentException("TipoPessoa is null");
        }

        Object object = null;

        if (TipoPessoa.JURIDICA.equals(tipoPessoa)) {
            object = pessoaJuridica();
        } else if (TipoPessoa.FISICA.equals(tipoPessoa)) {
            object = pessoaFisica();
        }

        return new ModelMapper().map(object, clazz);
    }

    public PessoaFisica pessoaFisica() {

        PessoaFisica pessoaFisica = new PessoaFisica(pessoa);
        pessoaFisica.setRg(new RG().getValue());
        pessoaFisica.setCpf(new CPF().getValue());
        pessoaFisica.setSexo(tipoSexo.getTexto());
        pessoaFisica.setProfissao(new Profissao().getValue());
        pessoaFisica.setFiliacao(new Filiacao());
        pessoaFisica.setPis(new PIS().getValue());
        pessoaFisica.setSigno(new Signo().getValue());

        EstadoCivil[] ec = EstadoCivil.values();
        pessoaFisica.setEstadoCivil(ec[Utils.random(ec.length)].getValue());

        pessoaFisica.setCns(new CNS().getValue());
        pessoaFisica.setCnae(new CNAE().getValue());
        pessoaFisica.setSenha(new Senha(tamanhoSenha).getValue());

        Data data = new Data(isMaiorIdade);
        pessoaFisica.setDataNascimento(data.getValue());
        pessoaFisica.setIdade(data.getCurrentYear() - data.getYear());

        return pessoaFisica;
    }

    public PessoaJuridica pessoaJuridica() {

        PessoaJuridica pessoaJuridica = new PessoaJuridica(pessoa);
        pessoaJuridica.setNome(new NomeEmpresa().getValue());
        pessoaJuridica.setCnpj(new CNPJ().getValue());
        pessoaJuridica.setInscricaoEstadual(new InscricaoEstadual(estadosBrasil).getValue());
        pessoaJuridica.setDataAbertura(new Data().getValue());
        pessoaJuridica.setSite(new Site(pessoa.getNome()).getValue());
        StatusEmpresa[] se = StatusEmpresa.values();
        pessoaJuridica.setStatus(se[Utils.random(se.length)].getValue());

        return pessoaJuridica;
    }

    private Endereco createEndereco(EstadosBrasil estadosBrasilEnum) {
        Endereco endereco = new Endereco();

        endereco.setEstado(estadosBrasilEnum.getEstado());
        endereco.setUf(estadosBrasilEnum.getSigla());

        String uf = estadosBrasilEnum.getSigla();
        endereco.setCidade(new Cidade().get(uf));

        endereco.setBairro(new Bairro().get());
        endereco.setLogradouro(new Logradouro().get());
        endereco.setNumero(Utils.random(999));
        endereco.setCep(new CEP(uf).getValue());

        return endereco;
    }

    public static class GeneratorBuilder {

        private TipoSexo tipoSexo = null;

        private EstadosBrasil estadosBrasil;

        private boolean isMaiorIdade = false;

        private int tamanhoSenha;

        public GeneratorBuilder sexoFeminino() {
            this.tipoSexo = TipoSexo.FEMININO;
            return this;
        }

        public GeneratorBuilder sexoMasculino() {
            this.tipoSexo = TipoSexo.MASCULINO;
            return this;
        }

        public GeneratorBuilder setEstado(String ufEstado) {
            this.estadosBrasil = EstadosBrasil.get(ufEstado);
            return this;
        }

        public GeneratorBuilder setMaiorIdade(boolean isMaiorIdade) {
            this.isMaiorIdade = isMaiorIdade;
            return this;
        }

        public GeneratorBuilder setSenha(int tamanhoSenha) {
            this.tamanhoSenha = tamanhoSenha;
            return this;
        }

        public Generator create() {
            return new Generator(tipoSexo, estadosBrasil, isMaiorIdade, tamanhoSenha);
        }
    }
}
