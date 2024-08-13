package main.br.com.ana;

/**
 * Classe responsável por calcular números da sequência de Fibonacci.
 */
public class Fibonacci {

    /**
     * Calcula o n-ésimo número da sequência de Fibonacci.
     *
     * @param n Posição na sequência de Fibonacci.
     * @return O n-ésimo número da sequência.
     */
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
