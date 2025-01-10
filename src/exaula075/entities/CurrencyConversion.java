package exaula075.entities;

public class CurrencyConversion {
    public static double valorFinal (double cotacao, double valor) {
        double valorFinal = valor * cotacao;
        final double IOS = 0.06 * valorFinal;

        return valorFinal + IOS;
    }
}
