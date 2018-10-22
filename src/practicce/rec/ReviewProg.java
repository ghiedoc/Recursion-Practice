package practicce.rec;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class ReviewProg {
    // number 1
    public static int power(int base, int expo, int prod) {
        if (expo == 1) {
            return base;
        } else {
            return base * power(base, expo - 1, prod);
        }
    }
    //number 2
    public static int sumEven(int n) {
        if (n < 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return n + sumEven(n - 1);
        }
        return sumEven(n - 1);
    }
    
    public static int sumOdd(int n){
        if(n < 0){
            return 0;
        }
        if(n % 2 == 1){
            return n + sumOdd(n-1);
        }
        return sumOdd(n-1);
    }
    //number 3
    public static int sumDivi(int n){
        if(n<0){
            return 0;
        }
        if(n % 5 == 0 || n % 3 == 0){
            return n + sumDivi(n-1);
        }
        return sumDivi(n-1);
    }
    //array
    public static void array1(){
        //int[][] array = new int[3][3];
        int [][] array1 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        //total of 1,5,9
        int total = 0;
        for(int i = 0; i < array1.length; i++){
            total += array1[i][i];
        }
        System.out.println("the total is: " + total);
        
        //total of 3,5,7
        int total2 = 0;
        int c = array1.length-1;
        for(int i = 0; i < array1.length; i++){
            total2 += array1[i][c--];
        }
        System.out.println("the total 2: " + total2);
        
        //total of right triangle
        int total3 = 0;
        int one = 1;
        int two = 2;
        int ye = 0;
        for(int i = 0; i < array1.length; i++){
            if(i == 0){
                total3 += array1[i][i];
            }
            total3 += array1[one][0]; 
            total3 += array1[two][i];
        }
        System.out.println(total3);
        
    }
    //finding minimum
    public static int minNum(int x, int y, int z){
        return Math.min(Math.min(x, y), z);
    }
    //finding maximum
    public static int maxNum(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }
    //adding 3 numbers using methods
    public static int aveNums(int a, int b, int c){
        return (a + b + c)/3;
    }
    //middle string return
    public static String middleRet(String str){
        return str;
    }
    //display date and time
    public static void displayCal(){
        Calendar cal = Calendar.getInstance();
//        System.out.println(cal.get(Calendar.HOUR));
//        System.out.println(cal.get(Calendar.MINUTE));
//        System.out.println(cal.get(Calendar.AM_PM));
//        System.out.println(cal.get(Calendar.YEAR));
//        System.out.println(cal.getTime());
        
        //get next year
        cal.add(Calendar.YEAR, 1);
        Date nyear = cal.getTime();
        
        //get previous year
        cal.add(Calendar.YEAR, -2);
        Date pyear = cal.getTime();
        
        System.out.println(nyear);
        System.out.println(pyear);
    }
    
    /**

     * Write a Java program to get a date after 2 weeks.

     */
    public static void method2() {
        //two weeks
        int noOfDays = 14;
        Calendar cal = Calendar.getInstance();
        
        //Date cdate = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, noOfDays);
        Date date = cal.getTime();

        //System.out.println("\nCurrent Date: " + cdate + "\n");
        System.out.println("Day after two weeks: " + date + "\n");
    }
    
    /**
     * Write a Java program to get year and months between two dates.
     */
    public static void method3() {

        LocalDate today = LocalDate.now();
        LocalDate userday = LocalDate.of(2015, Month.MAY, 15);
        Period diff = Period.between(userday, today);
        System.out.println("\nDifference between " + userday + " and " + today + ": "
                + diff.getYears() + " Year(s) and " + diff.getMonths() + " Month(s)\n");
    }
    

    public static void main(String[] args) {
        //System.out.println("the asnser is: " + power(10, 2, 1));
        int x = 5;
        int y = 1;
        int z = 7;
        //System.out.println("The lowest number is: " + minNum(x, y, z));
        //System.out.println("The maximum number is: " + maxNum(x, y, z));
        method3();
        
    }

}
