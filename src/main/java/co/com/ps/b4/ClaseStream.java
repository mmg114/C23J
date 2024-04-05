package co.com.ps.b4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClaseStream {

    public static void main(String[] args) {
        // Ejemplo de Stream
        List<String> palabras = Arrays.asList("Hola", "Mundo", "Stream", "Ejemplo");
        var miLista=palabras.stream().filter(palabra->palabra.length()>4).toList();

        List<String> palabras2 = Arrays.asList("Java", "es", "genial");

        //var palabrasEnMayusculas= palabras2.stream().map(String::toUpperCase);
        var palabrasEnMayusculas= palabras2.stream().map(String::toUpperCase);

        List<Integer> numero = Arrays.asList(1,2,2,2,3,4,5,5,5,5,5,5,6,78,8);
        List<Integer> numero1= new ArrayList<>();
        numero1.add(1);


        numero.stream().distinct().forEach(System.out::println);




    }
}
