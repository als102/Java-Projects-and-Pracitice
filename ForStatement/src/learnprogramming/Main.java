package learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
       // System.out.println("10,000 at 2% interest= " + calculateInterest(10000.00, 2.0) + " dollars");
        /***
         * For(init= initialize variable; termination= variable executed until i is false; increment= end of loop increase the value of i)
         String.format() to format  to float */
//        for (int i = 2; i < 9; i++) {
//            System.out.println( "10,000 at " +i+ "% interest = " + String.format("%.2f",calculateInterest(10000.00, i)));
//        }
//        System.out.println("=================");
//        for (int i = 8; i > 1; i--) {
//            System.out.println( "10,000 at " +i+ "% interest = " + String.format("%.2f",calculateInterest(10000.00, i)));
//        }
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    System.out.println("Exit the loop");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }

    //Prime number function evenly or by itself. Whole number greater than 1
    public static boolean isPrime(int n) {
        if (n == 0) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
