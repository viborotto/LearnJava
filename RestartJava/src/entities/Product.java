package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity; //quero acessar o atributo da classe
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("&.2f", price)
                + ", "
                + quantity
                + String.format("&.2f", totalValueInStock())
                + totalValueInStock();
    }

}
