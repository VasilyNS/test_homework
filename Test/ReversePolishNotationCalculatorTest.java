import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        int i = calculator.calculatePolishNotation("10 1 +");
        //System.out.println(i);
        Assert.assertEquals(11, i);
    }

    @Test
    public void shouldCalculateSubtraction() {
        int i = calculator.calculatePolishNotation("10 5 -");
        //System.out.println(i);
        Assert.assertEquals(5, i);
    }

    @Test
    public void shouldCalculateMultiplication() {
        int i = calculator.calculatePolishNotation("10 5 3 * - ");
        //System.out.println(i);
        Assert.assertEquals(-5, i);
    }

    @Test
    public void shouldGiveLastValueAndTestPartsIsBlank() {
        int i = calculator.calculatePolishNotation("1  10 5 3");
        System.out.println(i);
        Assert.assertEquals(3, i);
    }

}