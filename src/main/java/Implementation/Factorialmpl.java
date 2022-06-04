package Implementation;

public class Factorialmpl implements Interfaces.Factorial {
    @Override
    public Integer getFactorial(int n) {
        if (n <= 1)
            return 1;
        return n*getFactorial(n-1);
    }

    @Override
    public String getNames(String names) {
        return names;
    }

    @Override
    public Integer add(int a, int b) {

        return a+b;
    }

    @Override
    public Integer substract(int a, int b){

        if(a > b)
            return a - b;
        return b-a;
    }

    @Override
    public Integer division(int a, int b){
        if(b == 0)
            return 0;
        return a/b;
    }

    @Override
    public Integer multiplication(int a, int b) {
        return a*b;
    }
}
