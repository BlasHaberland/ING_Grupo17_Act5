
import com.mycompany.grupo17_tp5.Calculador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadorTest {

    // Declaración de la instancia de Calculador y la variable de resultado
    static Calculador calculador;
    static double resultado;

    // Método que se ejecuta una vez al inicio de todas las pruebas
    @BeforeClass
    public static void iniciar() {
        calculador = new Calculador();  // Inicializamos la calculadora
        resultado = 0;
        System.out.println("Inicio de Test");
    }

    // Método que se ejecuta antes de cada prueba
    @Before
    public void nombreTest() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    // Prueba para el método sumar de Calculador
    @Test
    public void sumar() {
        resultado = calculador.sumar(5.5, 5.5);  // Realizamos la suma
        // Verificamos que el resultado es el esperado
        assertEquals("La calculadora no realizó la suma correctamente", 11.0, resultado, 0.001);
    }

    // Prueba para el método restar de Calculador
    @Test
    public void restaTest() {
        resultado = calculador.restar(17.0, 5.5);  // Realizamos la resta
        // Verificamos que el resultado es el esperado
        assertEquals("La calculadora no realizó la resta correctamente", 11.5, resultado, 0.001);
    }

    // Método que se ejecuta después de cada prueba
    @After
    public void limpiar() {
        resultado = 0;  // Reseteamos el resultado
        System.out.println("Prueba finalizada: campos en 0");
    }

    // Método que se ejecuta una vez al finalizar todas las pruebas
    @AfterClass
    public static void finalizar() {
        System.out.println("Todos los Test finalizados");
    }
}
