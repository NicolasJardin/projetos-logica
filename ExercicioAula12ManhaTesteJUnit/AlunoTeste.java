
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AlunoTeste.
 *
 * @author  Nicorinhas e Jamesin
 * @version 1.0
 */
public class AlunoTeste {
    Aluno aluno = new Aluno();
    
    public AlunoTeste() {  
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        aluno.setNota1(10);
        aluno.setNota2(10);
        aluno.setTotalDeAulas(100);
        aluno.setNumeroDePresencas(25);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCalcularFrequencia() {
        assertEquals(25, aluno.calcularFrequencia(), 0.0);
        aluno.setNumeroDePresencas(42);
        assertEquals(42, aluno.calcularFrequencia(), 0.0);
        aluno.setNumeroDePresencas(59);
        assertEquals(59, aluno.calcularFrequencia(), 0.0);
    }
    
    @Test 
    public void testCalcularMediaAritimetica() {
        assertEquals(10, aluno.calcularMediaAritimetica(), 0.0);
        aluno.setNota1(2);
        aluno.setNota2(8);
        assertEquals(5, aluno.calcularMediaAritimetica(), 0.0);
        aluno.setNota1(5);
        aluno.setNota2(5);
        assertEquals(5, aluno.calcularMediaAritimetica(), 0.0);
    }
}
