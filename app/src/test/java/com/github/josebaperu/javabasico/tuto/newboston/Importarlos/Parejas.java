package com.github.josebaperu.javabasico.tuto.newboston.Importarlos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public enum Parejas {
    Carlos("nice","22"),
    Evelyn("cutie","10"),
    Olenka("bigmistake","12");
    Nicole("italian", "12"),
    Abril("different", "14"),
    Xiomara("iwish","16"),

    private final String desc;
    private final String year;

    Parejas(String description,String birthday){
            desc = description;
            year = birthday;
    }
    public String   getDesc(){
        return  desc;
    }

    public String getYear() {
        return year;
    }
}
    @Test
    @DisplayName("Ejercicio : TwentySixth")
    public void stringTestTwentySixth() {
        Pipa PipaObject = new Pipa(4,5,6);
        Pipo PipoObject = new Pipo("Carlos", PipaObject);

        System.out.println(PipoObject);
    }
    @Test
    @DisplayName("Ejercicio : TwentySeventh")
    public void stringTestTwentySeventh() {
        for (Parejas people: Parejas.values())
            System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getClass(), people.getYear());
        System.out.println("\nAnd now for the range of constants!!!\n");
    }
