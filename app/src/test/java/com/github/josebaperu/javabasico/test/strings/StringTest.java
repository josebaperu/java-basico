package com.github.josebaperu.javabasico.test.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Ejercicios : String")
public class StringTest {
    private static final Logger LOG = Logger.getLogger(StringTest.class.getName());

    @Test
    @DisplayName("Ejercicio : String")
    public void stringTest() {
        String name = "Juan Perez";
        assertEquals("Juan Perez", name);
        LOG.info("valor de name :" + name);

    }
    @Test
    @DisplayName("Ejercicio : StringMayusCula")
    public void stringTestMayusCula() {
        String name = "Juan Perez";
        assertEquals("JUAN PEREZ", name.toUpperCase());

    }

}
