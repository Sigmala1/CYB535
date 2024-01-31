public class MathUtils {

    public MathUtils() {
        //
    }

    /*add should return the sum of two integers, a and b*/
    public int add(int a, int b) {
        return a+b;
    }

    /*subtract should return the result of subtracting b from a*/
    public int subtract(int a, int b) {
        return a-b;
    }

    /*add should return the sum of two integers a and b*/
    public int multiply(int a, int b) {
        return a*b;
    }

    /*divide should return the result of dividing a and b.
     Ensure that division by zero is handled appropriately by returning -1.0 in such cases*/
    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0;
        }
        return a/b;
    }
}

