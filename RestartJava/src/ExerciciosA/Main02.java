package ExerciciosA;

import java.util.Locale;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario func = new Funcionario();
        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.println("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        func.tax = sc.nextDouble();

        //Mostrar infos
        System.out.println();
        System.out.println("Employee: "+ func);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        func.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: "+ func);

    }
}
