import FunctionPackage.BinarySearch;
import FunctionPackage.JavaService;
import Implementation.Abbreviation;
import Implementation.Factorialmpl;

public class BuildService {
    public static void main(String[] args) {
        JavaService javaService = new JavaService();
        System.out.println(javaService.callPrivate(4, 6));

        BinarySearch ob = new BinarySearch();
        int[] arr = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

        Factorialmpl factorial = new Factorialmpl();
        System.out.println("Factorial: " + factorial.getFactorial(5));

        String name = factorial.getNames("satya prakash");
        System.out.println(name);

//        Abbreviation color = Abbreviation.COLOR;

        for(Abbreviation abb : Abbreviation.values()) {
            System.out.print(abb.name());
            System.out.println(" : " +abb.getValue());
        }

    }
}
