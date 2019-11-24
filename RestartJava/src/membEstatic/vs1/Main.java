package membEstatic.vs1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.14159; //membro estatico, o *final* significa que não mudará
    //padrão do java para constante é letra maiúscula
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);
        // não pode chamar um método não estático dentro do estático, por isso tem static no circumference e volume
        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", PI);
    }
    public static double circumference(double radius){
        return 2.0*PI*radius;
    }
    public static double volume(double radius){
        return 4.0*PI*radius*radius*radius/3.0;
    }
}
