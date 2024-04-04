package co.com.ps.b2;

import java.time.LocalDate;
import java.util.List;


public class Main {

    public static void main(String[] args) {


        Persona persona = new Persona();
        persona.nombre="";
        persona.edad=12;
        persona.id="1231241";
        persona.estatura=1.78f;
        System.out.println("Llamar Caminar "+ persona.caminar(3));

        persona.caminar(3);
        persona.bailar();
        Persona.cantar();
        System.out.println(LocalDate.now());


        Persona p1;

        Persona persona2 = new Persona("Mauricio",30,"1144123123",1.90f);
        Persona persona3 = new Persona("martha",30,"1144123123",1.90f);
        Persona persona4= new Persona("Diana",30,"1144123123",1.90f);
        var persona6= new Persona("Diana",30,"1144123123",1.90f);
        p1 = new Persona(persona2.nombre,0,"",0f);
        persona2.nombre="alejandra";

        System.out.println(p1.nombre);
        System.out.println(persona2.nombre);
    }
}
