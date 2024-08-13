
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Explicação do Código</h1>
    <h2>Classe Calculadora</h2>
    <p>A classe <code>Calculadora</code> é responsável por realizar operações matemáticas básicas como adição, subtração, multiplicação e divisão. Cada método implementa uma dessas operações, garantindo que os cálculos sejam realizados corretamente.</p>
    <ul>
        <li><strong>adicionar(int a, int b):</strong> Retorna a soma de <code>a</code> e <code>b</code>.</li>
        <li><strong>subtrair(int a, int b):</strong> Retorna a diferença entre <code>a</code> e <code>b</code>.</li>
        <li><strong>multiplicar(int a, int b):</strong> Retorna o produto de <code>a</code> e <code>b</code>.</li>
        <li><strong>dividir(int a, int b):</strong> Retorna o quociente da divisão de <code>a</code> por <code>b</code>. Caso <code>b</code> seja zero, uma exceção <code>ArithmeticException</code> é lançada para prevenir a divisão por zero.</li>
    </ul>
    <h2>Classe Fibonacci</h2>
    <p>A classe <code>Fibonacci</code> calcula números da sequência de Fibonacci. O método <code>fib(int n)</code> implementa a lógica recursiva para determinar o <code>n</code>-ésimo número na sequência de Fibonacci.</p>
    <ul>
        <li><strong>fib(int n):</strong> Se <code>n</code> for 0 ou 1, o método retorna <code>n</code>. Caso contrário, retorna a soma dos dois números anteriores na sequência, ou seja, <code>fib(n-1) + fib(n-2)</code>.</li>
    </ul>
    <h2>Testes Unitários</h2>
    <p>Os testes unitários foram implementados para garantir que os métodos das classes <code>Calculadora</code> e <code>Fibonacci</code> funcionem corretamente.</p>
    <ul>
        <li><strong>CalculadoraTeste:</strong> Verifica se cada operação matemática (adição, subtração, multiplicação e divisão) está retornando os resultados esperados. Também testa a divisão por zero para garantir que a exceção correta seja lançada.</li>
        <li><strong>FibonacciTeste:</strong> Testa o método <code>fib</code> para diferentes valores de <code>n</code>, garantindo que a lógica de Fibonacci funcione conforme esperado.</li>
    </ul>
    <h2>Estrutura do Projeto</h2>
    <p>O projeto está organizado em duas pastas principais:</p>
    <ul>
        <li><strong>main.br.com.ana:</strong> Contém as classes <code>Calculadora</code> e <code>Fibonacci</code>, que implementam as funcionalidades principais.</li>
        <li><strong>teste.br.com.ana:</strong> Contém os testes unitários nas classes <code>CalculadoraTeste</code> e <code>FibonacciTeste</code>, que validam o comportamento do código.</li>
    </ul>
</body>
</html>
