package Cap10;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double soma = 0.0;

        Product[] vect = new Product[N];



        //ler nome e preco dos N produtos
        for(int i=0; i<vect.length;i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Product(nome, preco);
            System.out.println("_________________________");
            soma += vect[i].getPreco();
        }
        double media = soma / vect.length;
        System.out.printf("AVERAGE PRICE: %.2f", media);

    }
}
