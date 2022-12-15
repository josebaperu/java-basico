package com.github.josebaperu.javabasico.test.strings;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {
    private static Logger LOG = Logger.getLogger(StringTest.class.getName());

    @Test
    public void stringTest() {
        String name = "This is my name";
        assertEquals("This is my name", name);
        LOG.info("test OK");

    }
}
