package learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.println("The sum of the digits in 1980 is " + sumDigits(1980));
//        System.out.println(isPalindrome(-1221));
//        sumFirstAndLastDigit(15);
//        int getEven = getEvenDigitSum(123456789);
//        System.out.println(getEven);
//        boolean shared = hasSharedDigit(15, 55);
//        // System.out.println(shared);
//        boolean sameLast = hasSameLastDigit(11, 22, 31);
//        System.out.println(sameLast);
//        int greatestDivisor = getGreatestCommonDivisor(25, 15);
//        System.out.println(greatestDivisor);

       //  FactorPrinter.printFactors(10);
//         boolean perfect = PerfectNumber.isPerfectNumber(0);
//        System.out.println(perfect);
        NumberToWords.numberToWords(4000);

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
// Shared digits
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            int firstDigit = num1 % 10;
            int secondDigit = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            return num1 == num2 || num1 == secondDigit || firstDigit == num2;
        } else
            return false;

    }
// Checking if numbers have the same right most digit
    public static boolean hasSameLastDigit(int firstDigit, int secondDigit, int thirdDigit) {
        //numbers have to be valid between 10 and 1000
        if ((firstDigit >= 10 && firstDigit <= 1000) && (secondDigit >= 10 && secondDigit <= 1000) && (thirdDigit >= 10 && thirdDigit <= 1000)) {
            int firstOne = firstDigit % 10;
            int secondOne = secondDigit % 10;
            int thirdOne = thirdDigit % 10;
            firstDigit /= 10;
            secondDigit /= 10;
            thirdDigit /= 10;
            return firstDigit == secondOne || secondDigit == thirdOne || firstOne == thirdDigit || thirdDigit == secondDigit || firstOne == thirdOne;
        } else return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else return false;
    }
    //Common Divisor between two numbers The Greatest Common Denominators
    //Euclid's algorithm   reduce the larger of the two numbers, repeating gives smaller pairs of numbers until the two numbers become equal.
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }

}
