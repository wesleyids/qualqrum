package br.com.qualqrum.database;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.qualqrum.sql.DatabaseGenerator;

public class DatabaseTest {

    @Test
    public void test() {
        List<String> scripts = new DatabaseGenerator().init(Arrays.asList("nome", "email", "sexo"), "pessoa", 2);
        assertTrue("", scripts.size() == 2);
    }
}
