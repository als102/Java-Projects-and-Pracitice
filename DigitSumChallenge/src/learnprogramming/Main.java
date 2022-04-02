package learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of the digits in 1980 is "+ sumDigits(1980));
        System.out.println(isPalindrome(-1221));
        sumFirstAndLastDigit(15);
       int getEven = getEvenDigitSum(123456789);
        System.out.println(getEven);
    }
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0; // counter hold sum of the digits

        //extract the smallest digit 125-> 125/10 = 12-> 12*10 = 120 ->125-120 = 5
        while (number > 0) {
            // extract least -significant digit
            int digit = number % 10;
            sum += digit;
            // drop least significant digit number = number /10
            number /= 10;
        }
        return sum;

    }
// Number Palindrome
static boolean isPalindrome(int number) {
    int startingNumber = number;
    int reverse = 0;
    if (number < 0) {
        number = number * (-1);
        startingNumber = startingNumber * (-1);
    }
    while (number > 0) {
        //extract the last number
        int lastDigit = number % 10;
        // increase the place value and add to the last digit
        reverse = reverse * 10 + lastDigit;
        number /= 10;

    }
    return reverse == startingNumber;
}

// First and last Digit Sum
    // log the first number =  number % 10
public static int sumFirstAndLastDigit(int number) {
    int firstDigit = 0;
    int lastDigit = number % 10;
    System.out.println("last digit: " + lastDigit);
    if (number < -1) {
        return -1;
    }

    while (number != 0) {
        firstDigit = number % 10;
        number /= 10;
    }
    System.out.println("First digit: " + firstDigit);
    int sum = firstDigit + lastDigit;
    System.out.println("The sum of these numbers: " + sum);
    return sum;
}
    public static int getEvenDigitSum(int number) {

        int lastDigit;
        int sumOfEven = 0;
        if (number >= 0) {
            while (number > 0) {
                lastDigit = number % 10;
                if (lastDigit % 2 == 0) {
                    sumOfEven += lastDigit;
                }
                number /= 10;
            }

            return sumOfEven;
        }
        System.out.println("Invalid input:");
        return -1;
    }


}
