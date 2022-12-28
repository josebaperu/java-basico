package com.github.josebaperu.javabasico.tuto.newboston.basico;

import com.github.josebaperu.javabasico.test.strings.StringTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Ejercicios : String")
public class Capitulo10 {
    private static final Logger LOG = Logger.getLogger(Capitulo10.class.getName());

    @Test
    @DisplayName("Ejercicio : Paco")
    public void stringTest() {
        String name = "Juan Perez";
        assertEquals("Juan Perez", name);
        LOG.info("valor de name :" + name);

    }
    @Test
    @DisplayName("Ejercicio : first")
    public void stringTestOne() {
        String name = "Juan Perez";
        assertEquals("Juan Perez", name);
        LOG.info("valor de name :" + name);

    }
    @Test
    @DisplayName("Ejercicio : Second")
    public void stringTestSecond() {
        System.out.println(Math.ceil(6.2));
        System.out.println(Math.floor(8.2));



    }


}
