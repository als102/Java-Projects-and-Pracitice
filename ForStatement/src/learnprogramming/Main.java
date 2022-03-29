package learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
//        //Array practice with user input
//        String day[] = {"Monday","Tuesday","Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number for the day of the Week ");
//        int index = input.nextInt();
//        input.close();
//        System.out.println("Day: "+ day[index-1]);

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

        int sum = 0;
        int timesCount = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                timesCount++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (timesCount == 5) {
                break;
            }

        }
        System.out.println("Sum = " + sum);

        System.out.println(SumOddRange.isOdd(22));
        System.out.println(SumOddRange.sumOdd(100, 100));

        double ltv = LoanToValue.LonaToValueCalculator(800000, 110000000);
        System.out.println(ltv);

        //Manipulate strings

        String text = "TestingTheTesterIsTesting";
        countWords(text);
        reverseString(text);
        System.out.println(" ");
        text = "HelloWorld";
        addSpaces(text);
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    /***
     * Prime number function evenly or by itself. Whole number greater than 1
     *
     */
    public static boolean isPrime(int n) {
        if (n == 0) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            // System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them.
     *
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" "); //marks where to split the string in this case its a space " ".
        int numberOfWords = words.length;   // length of the string to determine the loop and how many words there are
        String message = String.format("Your text contains %d words: ", numberOfWords);   //String.format %d placeholder for a number and second argument what replaces %d with
        System.out.println(message);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
    /**
     * Print a String in reverse order
     *
     * @param text
     */
    public static void reverseString(String text) {
        // start at index end of the String text.length()-1
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
    /**
     * Adds spaces before each uppercase letter
     * Each word begins with a capital letter
     */
    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);

    }


}
