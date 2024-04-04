package co.com.ps.b3;

import java.time.LocalDate;
import java.util.Date;

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

    }

}
