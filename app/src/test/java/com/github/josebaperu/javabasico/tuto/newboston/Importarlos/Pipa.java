package com.github.josebaperu.javabasico.tuto.newboston.Importarlos;

public class Pipa {
    private int month;
    private int day;
    private int year;

    public Pipa(int m, int d, int y){

        month = m;
        day = d;
        year = y;
        System.out.printf("The constructor for this is %s\n", this);
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, month);
    }
}
