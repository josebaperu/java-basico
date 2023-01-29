package com.github.josebaperu.javabasico.loops;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoop {
    String[] noEmpty = new String[] {"hola","como","estas","amigo"};
    String result = "hola como estas amigo";

    @Test
    public void whileLoopTest() {
        String toPrint = "";
        int maxIndex = noEmpty.length;
        int index = 0 ;
        while(index < maxIndex) {
            toPrint = toPrint + noEmpty[index] + " ";
            index++;
        }
        assertEquals(result, toPrint.strip());
    }

    @Test
    public void enhancedLoopTest() {
        String toPrint = "";
        for(String text: noEmpty) {
            toPrint = toPrint + text + " ";
        }
        assertEquals(result, toPrint.strip());
    }
    @Test
    public void forLoopTest() {
    String toPrint = "";
    for(int i = 0; i < noEmpty.length; i++) {
        toPrint = toPrint + noEmpty[i] + " ";
    }
    assertEquals(result, toPrint.strip());
    }

    @Test
    public void iteratorTest() {
        List list = Arrays.asList(noEmpty);
        String toPrint = "";
        Iterator iterator = list.iterator();

        while(iterator.hasNext()) {
            toPrint = toPrint + iterator.next() + " ";
        }
        assertEquals(result, toPrint.strip());
    }
}
