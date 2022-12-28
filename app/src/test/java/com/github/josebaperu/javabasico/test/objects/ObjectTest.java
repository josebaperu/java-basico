package com.github.josebaperu.javabasico.test.objects;

import com.github.josebaperu.javabasico.model.Human;
import com.github.josebaperu.javabasico.test.strings.StringTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Ejercicios : Objetos")
public class ObjectTest {
    private static final Logger LOG = Logger.getLogger(StringTest.class.getName());

    @Test
    @DisplayName("Ejercicio : creacion objeto")
    public void objectCreationTest() {
        Human human = new Human();
        human.setGender("male");
        human.setName("Carlos");
        human.setYearOfBirth("20000");
        assertEquals("Carlos", human.getName());
        assertEquals("male", human.getGender());
        assertEquals("20000", human.getYearOfBirth());

        LOG.info("human toString : " + human);
            System.out.println("hola ");
            //no se que hacer
    }
    @Test
    @DisplayName("Ejercicio : creacion objeto dos")
    public void objectCreationTestDos() {
        Human human = new Human();
        human.setGender("male");
        human.setName("Carlos");
        human.setYearOfBirth("20000");
        assertEquals("Carlos", human.getName());
        assertEquals("male", human.getGender());
        assertEquals("20000", human.getYearOfBirth());

        LOG.info("human toString : " + human);
        System.out.println("hola ");
        //no se que hacer
    }
}
