package membEstatic.vs2;

public class Calculator {
    //COMO OS MEMBROS NÃO SÃO STATIC, TEREI QUE INSTANCIAR NO MAIN
    public final double PI = 3.14159;

    public double circumference(double radius){
        return 2.0*PI*radius;
    }

    public double volume(double radius){
        return 4.0*PI*radius*radius*radius/3.0;
    }

}
