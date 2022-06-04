import Implementation.Factorialmpl;
import Interfaces.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialTest() {
        Factorial factorial = new Factorialmpl();
        Integer f = factorial.getFactorial(5);
        Integer f01 = 120;
        Assert.assertEquals(f01, f);
    }
}
