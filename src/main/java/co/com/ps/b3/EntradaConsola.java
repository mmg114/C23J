package co.com.ps.b3;

import java.util.Scanner;

public class EntradaConsola {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba Su nombre: ");
        String nombre = scanner.next();
        System.out.println("Su nombre es "+ nombre);

        System.out.print("Escriba Su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Su edad es "+ edad);

        scanner.close();
    }
}
