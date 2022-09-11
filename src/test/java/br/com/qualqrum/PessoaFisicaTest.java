package br.com.qualqrum;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PessoaFisicaTest {

    @Test
    public void teste_pessoa_fisica() {
        PessoaFisica pf = new Generator.GeneratorBuilder()
                .sexoMasculino()
                .setMaiorIdade(true)
                .create()
                .pessoaFisica();

        assertTrue("Maior de idade", pf.getIdade() > 18);
        assertTrue("Pessoa do sexo masculino", pf.getSexo() == "Masculino");
    }
}
