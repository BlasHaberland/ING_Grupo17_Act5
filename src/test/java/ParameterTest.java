
import com.mycompany.grupo17_tp5.Calculador;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterTest {

    private static Calculador calculador;
    private int a;
    private int b;
    private int resultadoEsperado;

    public ParameterTest(int a, int b, int resultadoEsperado) {
        this.a = a;
        this.b = b;
        this.resultadoEsperado = resultadoEsperado;
    }

    @BeforeClass
    public static void iniciar() {
        calculador = new Calculador();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][]{
            {8, 7, 15},
            {2, 0, 2},
            {10, -1, 9},
            {20, -9, 11}
        });
    }

    @Test
    public void testSumaParametrizada() {
        assertEquals(resultadoEsperado, calculador.sumar(a, b), 0.001);
    }
}
