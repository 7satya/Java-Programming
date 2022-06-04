import FunctionPackage.JavaCalculator;
import FunctionPackage.JavaService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class ModuleBuild {
    @Mock JavaCalculator javaCalculator;

    @Test
    public void TestJavaCalculator() {
        JavaService javaService = new JavaService();
        Integer a = 5;
        Assert.assertEquals(a, javaService.callPrivate(2, 3));
    }

    @Test
    public void ReverseStringTest() {
        String input = "GeeksForGeeks";

        JavaService javaService = new JavaService();
        Assert.assertEquals("skeeGroFskeeG", javaService.Function(input));
    }

}
