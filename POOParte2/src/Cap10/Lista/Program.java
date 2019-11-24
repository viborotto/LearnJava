package Cap10.Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        //sempre usar a wraper class
        List<String> list = new ArrayList<String>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        //inserir um elemento na posição dois
        list.add(2, "Marco");
        System.out.print(list.size());
        //remover a Anna
        list.remove("Anna");
        //remover os que comecam com a letra M [remocao por predicado]


        for(String x : list){
            System.out.println(x);
        }
        System.out.println("___________________________________");
        list.removeIf(x -> x.charAt(0) == 'M');//retorna um verdadeiro ou falso
        for(String x : list){
            System.out.println(x);
        }
        //encontrar a posicao do elemento
        System.out.println("___________________________________");
        System.out.println("Index of Bob: "+ list.indexOf("Bob"));

        //filtrar só os nomes com A
        //list -> stream -> lambda -> list
        List<String> result = list.stream().filter(x -> x.charAt(0) =='A').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }
        //primeiro elemento com a letra A
        List<String> name = Collections.singletonList(list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null));
        System.out.println(name);


    }
}
