import main.java.Calculo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class CalculoTest {

    @Test
    void testExecutaCalculo(){
        float passaValor1 = 10;
        float passaValor2 = 5;
        float retornoEsperado = 15;

        Calculo c = new Calculo();
        float retornoFeito = c.soma(passaValor1,passaValor2 );
        assertEquals (retornoEsperado, retornoFeito);
    }
}
