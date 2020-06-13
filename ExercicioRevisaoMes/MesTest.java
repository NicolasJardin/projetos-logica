

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MesTest.
 *
 * @author  Nicólas
 * @version 1.0
 */
public class MesTest
{
    
    Mes mes = new Mes();
    /**
     * Default constructor for test class MesTest
     */
    public MesTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        mes.setMes(1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    /**
     * testa o metodo validarMes()
     * funcionando
     */
    @Test
    public void testValidarMes() {
        assertEquals("Janeiro",mes.validarMes());
        mes.setMes(2);
        assertEquals("Fevereiro",mes.validarMes());
        mes.setMes(3);
        assertEquals("Março",mes.validarMes());
        mes.setMes(4);
        assertEquals("Abril",mes.validarMes());
        mes.setMes(5);
        assertEquals("Maio",mes.validarMes());
        mes.setMes(6);
        assertEquals("Junho",mes.validarMes());
        mes.setMes(7);
        assertEquals("Julho",mes.validarMes());
        mes.setMes(8);
        assertEquals("Agosto",mes.validarMes());
        mes.setMes(9);
        assertEquals("Setembro",mes.validarMes());
        mes.setMes(10);
        assertEquals("Outubro",mes.validarMes());
        mes.setMes(11);
        assertEquals("Novembro",mes.validarMes());
        mes.setMes(12);
        assertEquals("Dezembro",mes.validarMes());
        
        /*
         *             case 1: return "Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
         */
    }
}
