package ExerciciosA;

import java.util.Locale;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.n1 = sc.nextDouble();
        aluno.n2 = sc.nextDouble();
        aluno.n3 = sc.nextDouble();

        System.out.printf("NOTA FINAL: %.2f\n"+ aluno.notaFinal());

        if (aluno.notaFinal() < 60.0){
            System.out.println("EXAME");
            System.out.printf("FALTAM %.2f PONTOS\n" + aluno.notaFalta());

        }else {
            System.out.println("PASSOU");
        }
    }
}
