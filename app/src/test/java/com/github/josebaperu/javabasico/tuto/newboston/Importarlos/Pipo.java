package com.github.josebaperu.javabasico.tuto.newboston.Importarlos;

import com.github.josebaperu.javabasico.tuto.newboston.Importarlos.Pipa;

public class Pipo {
    private String name;
    private Pipa birthday;

    public Pipo(String theName, Pipa theDate){
        name = theName;
        birthday = theDate;
    }

    @Override
    public String toString() {
        return String.format("My name is %s", name, birthday);
    }
}
