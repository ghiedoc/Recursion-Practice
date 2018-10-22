package practicce.rec;

/**
 *
 * @author Gillian
 */
public class RecursionPractice {

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
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;

        }
    }

    /**
     *
     * @param n take the number of what fibonacci
     * @return the fibonacci of a given number
     */
    public static int fibonacci(int n) {
        if (n < 2) {
            return 1;
        } else {
            //System.out.println(n);
            return fibonacci(n - 1) + fibonacci(n - 2);

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

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    //replace x with y for example codex will be codey
    public static String replaceX(String str) {
        if (str.length() < 1) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            //System.out.println( "this: " + "y" + replaceX(str.substring(1)));
            return "y" + replaceX(str.substring(1));
        }
        //System.out.println("thiss: " + str.charAt(0) + replaceX(str.substring(1)));
        return str.charAt(0) + replaceX(str.substring(1));
    }

    public static int totalDiff(int sensorA[], int sensorB[], int size) {
        int diff = 0;
        for (int i = 0; i < size; i++) {
            diff += Math.abs(sensorA[i] - sensorB[i]);
        }
        return diff;
    }

    public static int totalDiffDispatcher(int sensorA[], int sensorB[], int size) {
        if (size == 0) {
            return 0;
        }
        int lastElementDiff = Math.abs(sensorA[size - 1] - sensorB[size - 1]);
        int diff = totalDiffDispatcher(sensorA, sensorB, size - 1) + lastElementDiff;
        return diff;
    }

    public static int totalSum(int array[], int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int totalSumDispatcher(int array[], int index) {
        if (index == 0) {
            return 0;
        }
        int total = array[index - 1];
        int sum = totalSumDispatcher(array, index - 1) + total;
        return sum;
    }

    //Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
    public static String changePi(String str) {
        if (str.length() < 1) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }

    //contains
    public static boolean contains(int array[], int index, int check) {

        if (index < array.length) {
            if (array[index] == check) {
                return true;
            } else {
                return contains(array, index + 1, check);
            }
        }
        return false;
    }

    public static int minVal(int arr[], int index, int min) {
        int smallest = min;

        while (index < arr.length) {
            if (arr[index] < smallest) {
                smallest = arr[index + 1];
            }
            minVal(arr, index + 1, smallest);
        }
        return smallest;
    }

    public static int sumOfArr(int[] arr, int num) {

        if (num <= 0) {
            return 0;
        } else {
            return sumOfArr(arr, num - 1) + arr[num - 1];
        }
    }

    public static void main(String[] args) {
          
        int n[]  = {1,2,3};
        System.out.println(sumOfArr(n, 0));
        //System.out.println(factorial(3));;
        //String temp = "pixpix";
        //System.out.println(changePi(temp));
        //int array[] = {1, 2, 3, 4, 5};
        //System.out.println(totalSumDispatcher(array, array.length));
        //String temp = "xcodex";
        //System.out.println(replaceX(temp));
    }

}
