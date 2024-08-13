package teste.br.com.ana;

import main.br.com.ana.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

    @Test
    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(5, calc.adicionar(2, 3));
    }

    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(1, calc.subtrair(3, 2));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        Assert.assertEquals(2, calc.dividir(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        calc.dividir(1, 0);
    }
}
