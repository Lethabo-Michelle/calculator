import junit.framework.TestCase;
import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2,1));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiply(1,2));
    }

    @Test
    public void testDivision(){
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.divide(2,2));
    }
}