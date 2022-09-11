package br.com.qualqrum;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CPFTest {

    @Test
    public void teste_gerar_cpf() {
        String cpfGerado = Generator.cpf();
        assertTrue("CPF tem 14 caracteres", cpfGerado.length() == 14);
    }
}
