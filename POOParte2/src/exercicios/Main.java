package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cliente cliente; //declaramos antes globalmente para não ter problemas nas condições

        System.out.println("Enter account number: ");
        int numeroConta = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.print("Is there an initial deposit(y/n)?");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            cliente = new Cliente(nomeTitular, numeroConta,initialDeposit);
        } else {
            cliente = new Cliente(nomeTitular, numeroConta);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(cliente);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double valorDeposito = sc.nextDouble();
        cliente.deposito(valorDeposito);
        System.out.println("Updated account data:");
        System.out.println(cliente);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double valorSaque = sc.nextDouble();
        cliente.saque(valorSaque);
        System.out.println("Updated account data:");
        System.out.println(cliente);
    }
}
