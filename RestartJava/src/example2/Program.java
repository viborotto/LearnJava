package example2;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product(); //instanciando novo produto
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product); //sem o to string fica desformatado
        System.out.println(product.toString()); //implicitamente ele chama o toString do objeto

        System.out.println();
        System.out.println("Product data: "+ product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity); //atualiza a quantidade no objeto

        System.out.println();
        System.out.println("Update data: "+ product);

        System.out.println(product.name + "," + product.price + "," + product.quantity);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: "+ product);
    }
}
