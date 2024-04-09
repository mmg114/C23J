package co.com.ps.b5;

public class Cuadrado implements FiguraGeometrica {

    int lado;
    @Override
    public Object area() {
        return lado*lado;
    }
}
