import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Nicólas
 * @version 1.0
 * @since 6/3/2020 - 12:59
 */
class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        calculadora.setNumero1(2);
        calculadora.setNumero2(3);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * testa se ta somando direitinho
     * teste 1 com numero1 = 2 e numero2 = 3
     * teste 2 com numero1 = 7 e numero2 = 13
     * teste 3 com numero1 = 5 e numero2 = 5
     */
    @org.junit.jupiter.api.Test
    void calcularSoma() {
        assertEquals(5,calculadora.calcularSoma());
        calculadora.setNumero1(7);
        calculadora.setNumero2(13);
        assertEquals(20,calculadora.calcularSoma());
        calculadora.setNumero1(5);
        calculadora.setNumero2(5);
        assertEquals(10,calculadora.calcularSoma());
    }

    /**
     * teste 1 com numero1 = 2 e numero2 = 3
     * teste 2 com numero1 = 14 e numero2 = 7
     * teste 3 com numero1 = 5 e numero2 = 5
     */
    @Test
    void calcularSubtracao() {
        assertEquals(-1,calculadora.calcularSubtracao());
        calculadora.setNumero1(14);
        calculadora.setNumero2(7);
        assertEquals(7,calculadora.calcularSubtracao());
        calculadora.setNumero1(5);
        calculadora.setNumero2(5);
        assertEquals(0,calculadora.calcularSubtracao());
    }

    /**
     * teste 1 com numero1 = 2 e numero2 = 3
     * teste 2 com numero1 = 2 e numero2 = 7
     * teste 3 com numero1 = 1 e numero2 = 1
     */
    @Test
    void calcularMultiplicacao() {
        assertEquals(6,calculadora.calcularMultiplicacao());
        calculadora.setNumero1(2);
        calculadora.setNumero2(7);
        assertEquals(14,calculadora.calcularMultiplicacao());
        calculadora.setNumero1(1.45);
        calculadora.setNumero2(1.3);
        assertEquals(1.8,calculadora.calcularMultiplicacao(),0.1);
    }

    /**
     * teste 1 com numero1 = 2 e numero2 = 3
     * teste 2 com numero1 = 10 e numero2 = 5
     * teste 3 com numero1 = 1 e numero2 = 1
     */
    @Test
    void calcularDivisao() {
        assertEquals(0.6,calculadora.calcularDivisao(), 0.1);
        calculadora.setNumero1(10);
        calculadora.setNumero2(5);
        assertEquals(2,calculadora.calcularDivisao());
        calculadora.setNumero1(1);
        calculadora.setNumero2(1);
        assertEquals(1,calculadora.calcularDivisao());
    }

    @Test
    void escolherOpcao() {
        assertEquals("Soma: 5.0", calculadora.escolherOperacao(1));
        assertEquals("Subtração: -1.0", calculadora.escolherOperacao(2));
        assertEquals("Multiplicação: 6.0", calculadora.escolherOperacao(3));
        assertEquals("Divisão: 0.6666666666666666", calculadora.escolherOperacao(4));
        assertEquals("\nNumero1: 2.0"
                           + "\nNumero2: 3.0"
                           + "\nSoma: 5.0"
                           + "\nSubtração: -1.0"
                           + "\nMultiplicação: 6.0"
                           + "\nDivisão: 0.6666666666666666", calculadora.escolherOperacao(5));
        assertEquals("Opção inválida", calculadora.escolherOperacao(0));
    }
}