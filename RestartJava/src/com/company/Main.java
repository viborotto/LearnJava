package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Ola Mundo!");
        String product1 = "COmputer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        String gender = "F";

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.printf("Products:\n%s, which price is $ %.2f\n%s, which price is $ %.2f\n", product1, price1, product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f\nRounded (three decimal places): %.3f\nUS decimal point:  ");

        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

    }
}
