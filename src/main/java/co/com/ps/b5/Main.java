package co.com.ps.b5;

public class Main {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.LUNES;

        if (dia == DiaSemana.DOMINGO || dia==DiaSemana.LUNES){
            System.out.println("Es dia de trabajar");
        }else {
            System.out.println("Hoy se descansa");
        }

        System.out.println( DiaDeLaSemana.ELECTRODOMESTICOS.getValor());


    }
}
