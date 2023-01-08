package com.github.josebaperu.javabasico.tuto.newboston.basico;

import com.github.josebaperu.javabasico.test.strings.StringTest;
import com.github.josebaperu.javabasico.tuto.newboston.intermedio.cositas;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.random.RandomGenerator;

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

    @Test
    @DisplayName("Ejercicio : Third")
    public void stringTestThird() {
        double manzana;
        manzana = 9.12;

        System.out.print("yo quiero ");
        System.out.print(manzana);
        System.out.println(" peras");


    }

    @Test
    @DisplayName("Ejercicio : Fourth")
    public void stringTestFourth() {
        Scanner hola = new Scanner(System.in);
        double girls, boys, people;
        girls = 64;
        boys = 85;
        people = girls + boys;
        System.out.println(people);


    }

    @Test
    @DisplayName("Ejercicio : Fiveth")
    public void stringTestFiveth() {
        Scanner bucky = new Scanner(System.in);

        int papa = 5;
        int camote = 18;
        papa -= 53;
        System.out.println(papa);

    }

    @Test
    @DisplayName("Ejercicio : SIxth")
    public void stringTestSixth() {
        int test = 30;

        if (test < 9) {
            System.out.println("yes");
        } else {
            System.out.println("la cagaste, viejo");
        }


    }

    @Test
    @DisplayName("Ejercicio : Seventh")
    public void stringTestSeventh() {
        int boy, girl;
        boy = 18;
        girl = 48;

        if (boy > 10 || girl < 60) {
            System.out.println("pasa pasa");
        } else {
            System.out.println("tu eres muy chibolo");
        }
    }

    @Test
    @DisplayName("Ejercicio : Eigth")
    public void stringTestEigth() {
        int edad;
        edad = 30;

        switch (edad) {
            case 1:
                System.out.println("puedes gatear");
                break;
            case 2:
                System.out.println("puedes hablar");
                break;
            case 3:
                System.out.println("puedes estar en problemas");
                break;
            default:
                System.out.println("no se que edad tienes");
                break;
        }


    }

    @Test
    @DisplayName("Ejercicio : Ninth")
    public void stringTestNinth() {
        int counter = 0;
        while (counter < 100) {
            System.out.println(counter);
            counter++;
        }
    }

    @Test
    @DisplayName("Ejercicio : Tenth")
    public void stringTestTenth() {
        System.out.println("esto es una simple clase");

    }

    @Test
    @DisplayName("Ejercicio : Eleventh")
    public void stringTestEleventh(String name) {
        System.out.println("Hola " + name);

    }

    @Test
    @DisplayName("Ejercicio : Twelfth")
    public void stringTestTwelfth() {
        Random dice = new Random();
        int number;

        for (int counter = 1; counter <= 10; counter++) {
            number = 1 + dice.nextInt(6);
            System.out.println(number + " ");
        }


    }

    @Test
    @DisplayName("Ejercicio : Thirteenth")
    public void stringTestThirteenth() {
        int bucky[] = new int[10];
        bucky[0] = 87;
        bucky[1] = 543;
        bucky[9] = 65;
        System.out.println(bucky[9]);
    }

    //esto es lo más básico
    @Test
    @DisplayName("Ejercicio : FourTeenth")
    public void stringTestFourteenth() {
        int bucky[] = {2, 4, 5, 7, 9};

        System.out.println(bucky[2]);
    }

    @Test
    @DisplayName("Ejercicio : Fifteenth")
    public void stringTestFifteenth() {
        System.out.println("Index\tValue");
        int bucky[] = {32, 12, 18, 54, 2};
        for (int counter = 0; counter < bucky.length; counter++) {
            System.out.println(1 + counter + "\t" + bucky[counter]);
        }

    }

    @Test
    @DisplayName("Ejercicio : Sixteenth")
    public void stringTestSixteenth() {
        int bucky[] = {21, 16, 81, 21, 3};
        int sum = 0;

        for (int counter = 0; counter < bucky.length; counter++) {
            sum += bucky[counter];
        }
        System.out.println("La suma de esos numeros son " + sum);
    }

    @Test
    @DisplayName("Ejercicio : Eightteenth")
    public void stringTestEightteenth() {
        Random rand = new Random();
        int freq[] = new int[7];
        for (int roll = 1; roll < 1000; roll++) {
            ++freq[1 + rand.nextInt(6)];
        }
        System.out.println("Face\tFrecuency");
        for (int face = 1; face < freq.length; face++) {
            System.out.println(face + "\t" + freq[face]);
        }
    }

    @Test
    @DisplayName("Ejercicio : Nineteenth")
    public void stringTestNineteenth() {
        int bucky[] = {3, 4, 5, 6, 7};
        int total = 1;

        for (int x : bucky) {
            total += x;
        }
        System.out.println(total);
    }

    @Test
    @DisplayName("Ejercicio : Twentieth")
    public void stringTestTwentieth() {
        int bucky[] = {3, 4, 5, 6, 7};
        change(bucky);

        for (int y : bucky)
            System.out.println(y);
    }

    public void change(int x[]) {
        for (int counter = 0; counter < x.length; counter++)
            x[counter] += 5;

    }

    @Test
    @DisplayName("Ejercicio : Twentyoneth")
    public void stringTestTwentyfirstth() {
        int firstarray[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
        int secondarray[][] = {{30, 31, 32, 33}, {43}, {4, 5, 6}};


    }

    @Test
    @DisplayName("Ejercicio : TwentySecondth")
    public void stringTestTwentySecondth() {
        System.out.println(avarage(43, 56, 76, 8, 65, 76, 2, 31));
    }

    public int avarage(int... numbers) {
        int total = 0;
        for (int x : numbers) ;

        return total / numbers.length;

    }
    //me sale incorreccto "total+=x:" en la linea274

    @Test
    @DisplayName("Ejercicio : TwentyThird")
    public void stringTestTwentyThird() {
        cositas cositasObject = new cositas();
        System.out.println(cositasObject.toMilitary());
        cositasObject.setTime(13, 27, 6);
        System.out.println(cositasObject.toMilitary());
        System.out.println(cositasObject.toString());
//SISTEMAS DE HORARIOS
    }

    @Test
    @DisplayName("Ejercicio : TwentyFourth")
    public void stringTestTwentyFourth() {
        cositas cositasObject = new cositas();
        System.out.println(cositasObject.toMilitary());
        cositasObject.setTime(13, 27, 6);
        System.out.println(cositasObject.toMilitary());
        System.out.println(cositasObject.toString());
//SISTEMAS DE HORARIOS
    }

    @Test
    @DisplayName("Ejercicio : TwentyFifth")
    public void stringTestTwentyFifth(String[] args) {
        tuna tunaObject = new tuna();
        tuna tunaObject2 = new tuna(5);
        tuna tunaObject3 = new tuna(5, 13);
        tuna tunaObject4 = new tuna(5, 13, 43);

        System.out.Printf("%s\n", tunaObject.toMilitary());
        System.out.Printf("%s\n", tunaObject2.toMilitary());
        System.out.Printf("%s\n", tunaObject3.toMilitary());
        System.out.Printf("%s\n", tunaObject4.toMilitary());

    }
    /*https://www.youtube.com/watch?v=MK2SMJZbUmU&list=PLTTTcaxrixZT6v8k_QVSALXHX3KnaruuX&index=41
        tio, por que no puedo poner el printf*/
}



