package co.com.ps.b4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> lista= new ArrayList<>();
        String[] miArreglo= new String[2];
        String[] miArreglo2= {"hola","ComoEstas"};
        miArreglo2[0]="Hola Que tal";


//        for (int i = 0; i <miArreglo2.length ; i++) {
//            System.out.println(miArreglo2[i]);
//        }

        Arrays.stream(miArreglo2).forEach(System.out::println);

        List<Integer> numero = Arrays.asList(1,2,2,2,3,4,5,5,5,5,5,5,6,78,8);

        numero.stream().distinct().forEach(System.out::println);

    }
}
