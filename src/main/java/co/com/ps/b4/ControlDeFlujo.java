package co.com.ps.b4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControlDeFlujo {

    public static void main(String[] args) {
        // Ejemplo de while
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador (while): " + contador);
            contador++;
        }

        // Ejemplo de do-while
        contador = 0;
        do {
            System.out.println("Contador (do-while): " + contador);
            contador++;
        } while (contador < 5);

        // Ejemplo de for
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración (for): " + i);
        }

        String[] miArreglo2= {"hola","ComoEstas"};


        for (String datosArreglo:miArreglo2){

            System.out.println(datosArreglo);
        }

        List<String> lista= new ArrayList<>();
        lista.add("Comida1");
        lista.add("Comida2");
        lista.add("Comida3");
        lista.add("Comida4");
        lista.add("Comida5");


        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }




    }
}
