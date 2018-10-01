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
            return 1;
        } else {
            int result = factorial(n - 1) * n;
            System.out.print("Returned " + result);
            System.out.println(": " + n + " factorial(" + n + "-1)");

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
            return 1;
        } else {
            int result = fibonacci(n - 1) + fibonacci(n - 2);
            System.out.print("Returned " + result);
            System.out.println(": " + n + " fibonacci(" + n + "-1)");
            
            return result;
        }
    }

    /**
     *
     * @param bunnies
     * @return the bunnies of a given number
     */
    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {

            return bunnyEars2(bunnies - 1) + 3;

        } else {

            return bunnyEars2(bunnies - 1) + 2;
        }

    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else if (rows == 1) {
            return 1;
        } else {
            return triangle(rows - 1) + rows;
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

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

}
