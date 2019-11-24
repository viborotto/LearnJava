package ExerciciosA;

public class Retangulo {

    public double altura;
    public double largura;

    public double area(){
        return altura*largura;
    }
    public double perimetro(){
        return 2*(this.largura + this.altura);
    }
    public double diagonal(){
        return Math.sqrt(altura*altura + largura*largura);
    }
}
