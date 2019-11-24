package membEstatic.vs2;

import membEstatic.vs2.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //instanciando por não ter static no calculator
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);
        // não pode chamar um método não estático dentro do estático, por isso tem static no circumference e volume
        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", calc.PI);
    }

}

