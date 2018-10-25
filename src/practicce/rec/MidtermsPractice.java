package practicce.rec;

public class MidtermsPractice {

    public static int minimumNum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static int maximumNum(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }

    public static int average(int a, int b, int c) {
        int sum = (a + b + c) / 3;
        return sum;
    }

    public static int countVowels(String str) {
        int vowel = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i' || str.charAt(i) == 'o' 
                || str.charAt(i) == 'u') {
                
                    vowel++;
            }
        }
        return vowel;
    }
    
    public static void meth1(){
        int[][] demo = new int[12][12];
        
        int row = 1;
        int col = 1;
        
        for (int x = 0; x < demo.length; x++) {
            for (int y = 0; y < demo[x].length; y++) {
                demo[x][y] = row * col;
                col = col + 1;
            }
            row = row + 1;
            col = 1;
        }
        
        //for displaying the above code
        for (int x = 0; x < demo.length; x++) {
            for (int y = 0; y < demo[x].length; y++) {
                System.out.print("  " + demo[x][y] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;

        meth1();
    }

}
