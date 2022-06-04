import FunctionPackage.BinarySearch;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void binarySearchTest() {
        BinarySearch ob = new BinarySearch();
        int[] arr = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

        Assert.assertEquals(3, result);
    }
}
