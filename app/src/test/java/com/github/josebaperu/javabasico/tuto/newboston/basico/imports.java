package com.github.josebaperu.javabasico.tuto.newboston.basico;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;


public class imports {

    public static void main(String[] args){
        Scanner imput = new Scanner(System.in);
        Capitulo10   treceObject = new Capitulo10();

        System.out.println("Pon tu nombre aqui");
        String name = imput.nextLine();
        treceObject.stringTestEleventh(name);

    }


}
