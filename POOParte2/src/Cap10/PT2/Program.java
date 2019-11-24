package Cap10.PT2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for(int i = 0; i<vect.length; i++){
            System.out.println(vect[i]);
        }
        //FOR EACH .... PRA CADA OBJ UM ELEMENTO DO VETOR
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}
