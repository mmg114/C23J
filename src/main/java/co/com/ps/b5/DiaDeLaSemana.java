package co.com.ps.b5;

public enum DiaDeLaSemana {
    ELECTRODOMESTICOS(0.25);


    private final Double valor;

    DiaDeLaSemana(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}