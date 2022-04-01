package learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of the digits in 1980 is "+ sumDigits(1980));
    }
    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int allDigits = 0;

        //extract the smallest digit 125->125/10 = 12-> 12*10 = 120 ->125-120 = 5
        while (number > 0){
            // extract least -significant digit
            int digit = number % 10;
            allDigits += digit;

            // drop least significant digit
            number/= 10;
        }
        return allDigits;

    }


}
