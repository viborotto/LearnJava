package com.company;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ComPOO {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y; //AREA STACK DE MEMÓRIA ESTÁTICA , X PASSA A TER O ENDEREÇO DE MEMÓRIS DO OBJETO NA HEAP
                //INSTANCIANDO OS OBJETOS
        x = new Triangle(); //AREA HEAP MEMORIA DINAMICA
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }
}
