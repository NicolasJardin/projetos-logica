import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Nicólas
 * @version 1.0
 * @since 06/06/2020 - 14:27
 */
class ProdutoTest {

    Produto produto = new Produto();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        produto.setValor(10);
        produto.setQuantidade(5);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    /**
     * 1° Teste com valor 10 e quantidade 5
     * 2° Teste com valor 15 e quantidade 10
     * 3° Teste com valor 5.5 e quantidade 3
     */
    @org.junit.jupiter.api.Test
    void calcularCompra() {
        assertEquals(50, produto.calcularCompra());
        produto.setValor(15);
        produto.setQuantidade(10);
        assertEquals(150, produto.calcularCompra());
        produto.setValor(5.5);
        produto.setQuantidade(3);
        assertEquals(16.5, produto.calcularCompra());
    }
}