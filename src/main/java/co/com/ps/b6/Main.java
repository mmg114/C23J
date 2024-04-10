package co.com.ps.b6;

public class Main {
    public static void main(String[] args) {
        try {
            int resultado=dividir(10,0);
            System.out.println(resultado);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (RuntimeException ec){
            System.out.println(ec);
        }finally {

        }
        System.out.println("La Aplicacion termino con exito");
    }
    public static int dividir(int a , int b){
        return a/b;
    }
}
