package learnprogramming;
public class NumberToWords {

    public static void numberToWords (int number) {

        int lastDigit = 0;

        if(number < 0) {
            System.out.println("Invalid Value");
        }

        //Sends a call to the reverse method to correct the order of the number
        int reversedNumber = reverse(number);

        //'getDigitCount' method to get the number of digits in the original number;
        int numberCount = getDigitCount(number);

        for(int i = numberCount; i > 0; i--) {
            lastDigit = reversedNumber % 10;
            reversedNumber /= 10;

            switch (lastDigit) {
                case(0):
                    System.out.println("Zero");
                    break;
                case(1):
                    System.out.println("One");
                    break;
                case(2):
                    System.out.println("Two");
                    break;
                case(3):
                    System.out.println("Three");
                    break;
                case(4):
                    System.out.println("Four");
                    break;
                case(5):
                    System.out.println("Five");
                    break;
                case(6):
                    System.out.println("Six");
                    break;
                case(7):
                    System.out.println("Seven");
                    break;
                case(8):
                    System.out.println("Eight");
                    break;
                case(9):
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse (int number) {

        int lastDigit = 0;
        int reversedNumber = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount (int number) {

        int count = 0;

        if(number < 0) {
            return -1;
        }

        do {
            count++;
            number /= 10;
        } while(number > 0);

        return count;
    }
}

