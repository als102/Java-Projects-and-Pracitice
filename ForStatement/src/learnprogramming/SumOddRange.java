package learnprogramming;

public class SumOddRange {
    //function is odd number
    public static boolean isOdd(int number) {
        if (number % 2 > 0) {
            return true;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > 0 && end > 0 && end >= start) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        } else
            return -1;
    }
}
