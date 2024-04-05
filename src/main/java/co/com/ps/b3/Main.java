package co.com.ps.b3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Colombiano colombiano = new Colombiano("1144662723","Mauricio","Guzman","CC","o-");
        System.out.println(colombiano.getNombre());
        colombiano.setNombre("Maricarmen");
        System.out.println(colombiano.getNombre());

        System.out.println(colombiano.getApellido());

// <---------------------------------------------------------------------------------->

        int edad=36;
        double fracciones =1.2;
        boolean esVerdad=false;
        short numeros=60;
        char letra='a';
        Integer edad2=18;
        Boolean esFalso=false;


        Date fecha = new Date();
        LocalDate fechaLocal= LocalDate.now();
        System.out.println(edad);

// <---------------------------------------------------------------------------------->


        int numero = -19;

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo o cero.");
        }

// <---------------------------------------------------------------------------------->

        int dia = 3;
        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número de día inválido";
                break;
        }

        System.out.println("El día " + dia + " es " + nombreDia);
        System.out.println();

        List<String> lista= new ArrayList<>();
        String[] miArreglo= new String[2];
        String[] miArreglo2= {"hola","ComoEstas"};
        miArreglo2[0]="Hola Que tal";









    }

}
