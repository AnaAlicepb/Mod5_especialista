package teste.br.com.ana;

import main.br.com.ana.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTeste {

    @Test
    public void testFibonacciBase() {
        Assert.assertEquals(0, Fibonacci.fib(0));
        Assert.assertEquals(1, Fibonacci.fib(1));
    }

    @Test
    public void testFibonacciPequeno() {
        Assert.assertEquals(1, Fibonacci.fib(2));
        Assert.assertEquals(5, Fibonacci.fib(5));
    }

    @Test
    public void testFibonacciGrande() {
        Assert.assertEquals(55, Fibonacci.fib(10));
    }
}
