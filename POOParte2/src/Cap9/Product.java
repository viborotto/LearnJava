package Cap9;

public class Product {
    private String name;
    private double price;
    private int quantity;


    //construtores
    public Product(String name, double price, int quantity){
        //this referencia para o atributo e não o parametro
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }//fim construtores

    //outro construtor que deixe a quantidade opcional, sobrecarga
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Product(){
        //construtor padrão
    }

    //GET E SET
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }//sem set, para proteger de alterações inconsistentes

    public double totalValueInStock(){
        return price*quantity;
    }

    public void addProducts(int quantity){
        this.quantity+=quantity;
    }

    public void removeProducts(int quantity){
        this.quantity-=quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
