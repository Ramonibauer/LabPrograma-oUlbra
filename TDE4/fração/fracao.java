public class fracao {
    int numerador;
    int denominador;
    fracao(int num, int den) {
        numerador = num;
        denominador = den;
    }
    fracao multiplicar(fracao outra) {
        int novoNumerador = numerador * outra.numerador;
        int novoDenominador = denominador * outra.denominador;
        return new fracao(novoNumerador, novoDenominador);
    }
    System.out.println(fracao);
}
