
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class DivisionTest {

    @BeforeClass
    public static void iniciar() {
        System.out.println(":: Inicio de Test Division cero::");
    }

    @Test
    public void divisionCeroTest() {
        assertThrows(ArithmeticException.class, () -> {
            int resultado = 10 / 0;
        });
    }

    @AfterClass
    public static void finalizar() {
        System.out.println(":: Test finalizado ::");
    }
}
