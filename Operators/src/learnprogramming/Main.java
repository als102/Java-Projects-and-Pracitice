package learnprogramming;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1;
        System.out.println("Previous result - 1 = " + result);

        result = result * 10; // 2 * 10
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20/5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println(result);

        result--;
        System.out.println("2 -1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 -2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        }
        int topScore = 80;
        if (topScore != 100) {

            System.out.println("you have the high score");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
        if (topScore > 90 || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true");
        }
        int newValue = 50;
        if (newValue == 50 ){
            System.out.println("This is not an error, assignment ==");
        }
        boolean isCar = true;

        if(isCar){
            System.out.println("This is not supposed to happen");
        }
        //ternary operator
        boolean wasCar = (isCar) ? true:false;

        if(wasCar){
            System.out.println("was car was true");
        }

        double myFirstNumber = 20;
        double  mySecondNumber = 80;
        double addSum = (myFirstNumber + mySecondNumber) * 100.00;
        System.out.println("My total values "+addSum);
        double leftOver = addSum % 40.00;
        System.out.println("My Remainder "+ leftOver);
        boolean stepFive = (leftOver == 0) ? true:false;
        System.out.println(stepFive);
        if(!stepFive){
            System.out.println("Got Some Remainder");
        }

    }
}
