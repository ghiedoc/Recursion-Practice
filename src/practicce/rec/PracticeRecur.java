package practicce.rec;

public class PracticeRecur {

    /**
     * Only count numbers n to 100
     *
     * @param n takes the starting number up to 100
     */
    public static void looping(int n) {
        if (n != 100) {
            System.out.println(n);
            looping(n + 1);

        } else {
            System.out.println(n);
        }
    }

    /**
     *
     * @param n takes the number of what factorial
     * @return the factorial of a given number
     */
    public static int factorial(int n) {

        System.out.println("Method " + n);

        if (n <= 1) {
            System.out.println("Returned 1");
            return 1;
        } else {
            int result = factorial(n - 1) * n;
            System.out.print("Returned " + result);
            System.out.println(": " + n + " * factorial(" + n + "-1)");

            return result;

        }
    }

    /**
     *
     * @param n take the number of what fibonacci
     * @return the fibonacci of a given number
     */
    public static int fibonacci(int n) {

        System.out.println("Method " + n);

        if (n < 2) {
            System.out.println("Returned 1");
            return 1;
        } else {
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            System.out.print("Returned " + result);
            System.out.println(": " + "fibonacci(" + n + "-1) + " + "fibonacci(" + n + "-2)");

            return result;
        }
    }

    /**
     *
     * @param bunnies
     * @return the bunnies of a given number
     */
    public static int bunnyEars2(int bunnies) {

        System.out.println("Method " + bunnies);

        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {

            return bunnyEars2(bunnies - 1) + 3;

        } else {

            return bunnyEars2(bunnies - 1) + 2;
        }

    }

    public static int triangle(int rows) {

        System.out.println("Method " + rows);

        if (rows == 1) {
            System.out.println("Returned 1");
            return 1;
            
        } else {
            int result = triangle(rows - 1) + rows;
            System.out.print("Returned " + result);
            System.out.println(": " + rows + " + triangle(" + rows + "-1)");

            return result;
        }
    }

    /**
     * compute the sum of natural numbers up to n
     *
     */
    public static int natural(int n) {

        if (n != 0) {
            return n + natural(n - 1);

        } else {
            return n;
        }

    }

    //factorial also
    public static int prod(int n) {
        if (n != 1) {
            System.out.println(n);
            return n * prod(n - 1);
        } else {

            return n;
        }
    }

    public static void sumlooping() {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    
    public static int power(int base, int exponent){
        int result = 0;
        
        if(exponent == 0){

            return  1;
        }
        else if(exponent != 0){
            result =  (base * power(base, exponent-1));
            //System.out.println(result);
            
        }
        return result;
    }
    
    //fing GCD of two numbers
    public static int getGCD(int n1, int n2){
        
        if(n2 != 0){
            System.out.println("returned " + n1 + " % " + n2);
            return getGCD(n2, n1 % n2);
        }
        else{
            System.out.println("returned 1");
            return n1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getGCD(40,24));
        
    }

}
