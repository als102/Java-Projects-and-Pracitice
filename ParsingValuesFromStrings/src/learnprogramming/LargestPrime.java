package learnprogramming;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) { // if number is less than or equal to 1 return -1. (includes non-prime and negative numbers. )
            return -1;
        }
        int largestPrime = 0, x = 0;
        for (int i = 2; i <= (number / 2); i++) { // 2 is lowest prime number.. only need to loop through (number/2 numbers)
            if (number % i == 0) { // check if remainder when number divided by index is 0, then we can locate prime numbers
                x = getLargestPrime(i); // inversely call getLargestPrime using index value and store in x.
                if (x <= i) {
                    largestPrime = x; // if x is less than the index then set that as the largestPrime.
                } else {
                    largestPrime = i;
                }
            }

        }
        // if largestPrime is 0 (if largestPrime is not a max prime number, set the actual number as largestPrime.)
        if (largestPrime == 0) {
            largestPrime = number;
        }
        return largestPrime; // return largest prime.
    }
}
