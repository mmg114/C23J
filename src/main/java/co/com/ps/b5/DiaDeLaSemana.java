package co.com.ps.b5;

public enum DiaDeLaSemana {
    DOMINGO(1),
    LUNES(2),
    MARTES(3),
    MIÉRCOLES(4),
    JUEVES(5),
    VIERNES(6),
    SÁBADO(7);

    private final int valor;

    DiaDeLaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}