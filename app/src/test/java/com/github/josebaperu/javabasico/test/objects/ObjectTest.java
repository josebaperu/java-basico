package com.github.josebaperu.javabasico.test.objects;

import com.github.josebaperu.javabasico.model.Human;
import com.github.josebaperu.javabasico.test.strings.StringTest;
import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ObjectTest {
    private static Logger LOG = Logger.getLogger(StringTest.class.getName());
    @Test
    public void objectTest() {
        Human human = new Human();
        human.setGender("male");
        human.setName("Carlos");
        human.setYearOfBirth("2000");
        assertEquals("Carlos", human.getName());
        assertEquals("male", human.getGender());
        assertEquals("2000", human.getYearOfBirth());

        LOG.info("test OK");
    }
}
