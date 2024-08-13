package main.br.com.ana;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da soma de a e b.
     */
    public int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da subtração de a por b.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da multiplicação de a e b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @return Resultado da divisão de a por b.
     * @throws ArithmeticException Se b for igual a zero.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}
